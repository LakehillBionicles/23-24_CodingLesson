package org.firstinspires.ftc.teamcode.white;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.robot.Robot;

@TeleOp
public class whiteTele extends LinearOpMode {
    whiteHWMap robot = new whiteHWMap();

    public void runOpMode () {
        robot.init(hardwareMap);
        waitForStart();

        while (opModeIsActive()) {
            robot.fpd.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
            robot.bpd.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x);
            robot.fsd.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            robot.bsd.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
        }
    }
    public void method(){
    }
}