package org.firstinspires.ftc.teamcode.kessler;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;


@TeleOp
public abstract class kesslerTele extends LinearOpMode {
    KesslerHardwareMap robot = new KesslerHardwareMap();
    public double motorPower = 0;
    public void runOpmode () {

        robot.init(hardwareMap);

        waitForStart();

        while (opModeIsActive()) {


            motorPower = -gamepad1.left_stick_y;
            robot.fpd.setPower(motorPower);

            robot.fpd.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
            robot.bpd.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x);
            robot.fsd.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            robot.bsd.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);

        }
    }


}
