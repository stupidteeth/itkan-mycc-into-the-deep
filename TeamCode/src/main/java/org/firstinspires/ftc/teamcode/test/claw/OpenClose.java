package org.firstinspires.ftc.teamcode.test.claw;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;
import com.qualcomm.robotcore.hardware.Servo;

public class OpenClose extends OpMode {
    private Servo openClose;
    double position;
    boolean button = gamepad1.a;

    @Override
    public void init() {
        openClose = hardwareMap.get(Servo.class, "openClose");

        public void setServoPosition(double position); {
            openClose.setPosition(position);

        }
    }

    @Override
    public void loop() {

        while (position >= 0){
            gamepad1.a button = true;
        }

        while (gamepad1.a = true) {


        }

        }

}
