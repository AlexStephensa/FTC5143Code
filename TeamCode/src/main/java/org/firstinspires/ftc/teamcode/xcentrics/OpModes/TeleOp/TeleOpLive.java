package org.firstinspires.ftc.teamcode.xcentrics.OpModes.TeleOp;

import org.firstinspires.ftc.teamcode.xcentrics.paths.TeleOpPaths;

public class TeleOpLive extends LiveTeleopBase{
    private TeleOpPaths paths;

    @Override
    public void on_init() {

    }

    @Override
    public void on_start() {

    }

    @Override
    public void on_stop() {

    }

    @Override
    public void on_loop() {
        if(gamepad1.a){
            robot.launcher.spinUp();
        }

    }
}
