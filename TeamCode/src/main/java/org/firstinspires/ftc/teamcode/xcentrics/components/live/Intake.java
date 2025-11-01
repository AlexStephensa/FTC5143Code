package org.firstinspires.ftc.teamcode.xcentrics.components.live;


import static org.firstinspires.ftc.teamcode.xcentrics.components.live.IntakeConfig.speed;

import android.graphics.Path;

import com.bylazar.configurables.annotations.Configurable;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorEx;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;
import org.firstinspires.ftc.teamcode.xcentrics.components.Component;
import org.firstinspires.ftc.teamcode.xcentrics.robots.Robot;
import org.firstinspires.ftc.teamcode.xcentrics.util.DcMotorQUS;

@Configurable
class IntakeConfig {
    public static double speed = 0;
}
public class Intake extends Component {

    /// Motors ///
    private DcMotorQUS intake;

    {
        name = "intake";
    }
    public Intake(Robot robot){
        super(robot);
    }

    public void registerHardware(HardwareMap hardwareMap){
        super.registerHardware(hardwareMap);
        /// Motors ///
        intake = new DcMotorQUS(hardwareMap.get(DcMotorEx.class,"intake"));
    }

    public void update(OpMode opMode){
        super.update(opMode);
        intake.queue_power(speed);
    }
    public void startup(){
        intake.motor.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
    }
    public void shutdown(){
        intake.queue_power(0);
    }
    public void updateTelemetry(Telemetry telemetry){
        addData("Intake speed: ",speed);
    }
}
