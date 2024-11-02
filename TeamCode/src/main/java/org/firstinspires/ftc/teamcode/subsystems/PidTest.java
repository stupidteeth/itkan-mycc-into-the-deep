package org.firstinspires.ftc.teamcode.subsystems;

import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import android.database.AbstractCursor;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

public class PidTest {

    public void innit() {
        DcMotor armMotor;
        armMotor = hardwareMap.get(DcMotor.class, "arm");
    }

    double Kp = 1;
    double Ki = 0;
    double Kd = 0;

    int reference = 30; //in cm

    double integralSum = 0;

    double lastError = 0;

    // Elapsed timer class from SDK, please use it, it's epic
    ElapsedTime timer = new ElapsedTime();

    while (//set point not reached) {

        // obtain the encoder position
        double encoderPosition = armMotor.getPosition();
        // calculate the error
        double error = reference - encoderPosition;

        // rate of change of the error
        double derivative = (error - lastError) / timer.seconds();

        // sum of all error over time
        integralSum = integralSum + (error * timer.seconds());

        double out = (Kp * error) + (Ki * integralSum) + (Kd * derivative);

        armMotor.setPower(out);

        lastError = error;

        // reset the timer for next time
        timer.reset();

    }
}
