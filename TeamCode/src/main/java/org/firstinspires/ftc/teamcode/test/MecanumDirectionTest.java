package org.firstinspires.ftc.teamcode.test;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

import org.firstinspires.ftc.teamcode.subsystems.MecanumDrive;

@TeleOp(name = "TEST: Mecanum Direction Test")
public class MecanumDirectionTest extends LinearOpMode {
    MecanumDrive drive;

    @Override
    public void runOpMode() throws InterruptedException {
        this.drive = new MecanumDrive(hardwareMap);

        float x = gamepad1.left_stick_x;
        float y = gamepad1.left_stick_y;
        float rx = gamepad1.right_stick_x;
        drive.setPowers(x, y, rx);
    }
}
