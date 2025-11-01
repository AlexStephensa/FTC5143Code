package org.firstinspires.ftc.teamcode.xcentrics.components.live;

import com.bylazar.configurables.annotations.Configurable;

import org.firstinspires.ftc.teamcode.xcentrics.components.Component;
import org.firstinspires.ftc.teamcode.xcentrics.robots.Robot;
import org.firstinspires.ftc.vision.VisionPortal;
import org.firstinspires.ftc.vision.apriltag.AprilTagProcessor;
import org.openftc.apriltag.AprilTagDetection;

import java.util.List;

@Configurable
class CameraConfig{
    public static final int PPG_TAG_ID = 23;
    public static final int PGP_TAG_ID = 22;
    public static final int GPP_TAG_ID = 21;
    public static int foundID = -1;
    public static List<AprilTagDetection> currentDetections;
}
public class Camera extends Component {
    /// vision things//
    private VisionPortal visionPortal;
    private AprilTagProcessor aprilTag;

    public Camera(Robot robot){
        super(robot);
    }

}
