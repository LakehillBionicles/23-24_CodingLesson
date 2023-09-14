package org.firstinspires.ftc.teamcode.musselman;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;

@TeleOp
public class musselmanTele extends LinearOpMode {
    musselmanHardwareClass robot = new musselmanHardwareClass();


    public void runOpMode (){
        robot.init(hardwareMap); //accessing the config every config is called "hardwareMap"
        waitForStart();
        //define variables
        while (opModeIsActive()) {
                    //for gamepad y values, forward is negative
            robot.fpd.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x + gamepad1.right_stick_x);
            robot.bpd.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x + gamepad1.right_stick_x);
            robot.fsd.setPower(-gamepad1.left_stick_y - gamepad1.left_stick_x - gamepad1.right_stick_x);
            robot.bsd.setPower(-gamepad1.left_stick_y + gamepad1.left_stick_x - gamepad1.right_stick_x);
        }
    }
    public void method(){
        //type your method here
        //checking if this pushes.
        //round 2?
    }

}
