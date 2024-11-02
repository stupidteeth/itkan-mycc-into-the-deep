package org.firstinspires.ftc.teamcode.subsystems;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

@TeleOp
public class MecanumDrive {
    public DcMotorEx frontLeft, frontRight, backLeft, backRight;

    public MecanumDrive(HardwareMap map) {
        frontLeft = map.get(DcMotorEx.class, "fl");
        frontRight = map.get(DcMotorEx.class, "fr");
        backLeft = map.get(DcMotorEx.class, "bl");
        backRight = map.get(DcMotorEx.class, "br");
    }


    public void setPowers(float x, float y, float rx) {
        double denominator = Math.max(Math.abs(y) + Math.abs(x) + Math.abs(rx), 1);
        double frontLeftPower = (y + x + rx) / denominator;
        double backLeftPower = (y - x + rx) / denominator;
        double frontRightPower = (y - x - rx) / denominator;
        double backRightPower = (y + x - rx) / denominator;

        frontLeft.setPower(frontLeftPower);
        backLeft.setPower(backLeftPower);
        frontRight.setPower(frontRightPower);
        backRight.setPower(backRightPower);
    }
}