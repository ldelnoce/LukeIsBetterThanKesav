package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.RefreshCamera;

import com.ni.vision.NIVision;
import com.ni.vision.NIVision.DrawMode;
import com.ni.vision.NIVision.Image;
import com.ni.vision.NIVision.ShapeMode;

import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Camera extends Subsystem {
    int session;
	Image frame;
	NIVision.Rect rect;
	
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
    	
    	setDefaultCommand(new RefreshCamera());
    }
    public void init() {
    
    frame = NIVision.imaqCreateImage(NIVision.ImageType.IMAGE_RGB, 0);

    // the camera name (ex "cam0") can be found through the roborio web interface
    session = NIVision.IMAQdxOpenCamera("cam12",
            NIVision.IMAQdxCameraControlMode.CameraControlModeController);
    NIVision.IMAQdxConfigureGrab(session);
}
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
	
		
		public void refresh(){

            NIVision.IMAQdxGrab(session, frame, 1);
            NIVision.imaqDrawShapeOnImage(frame, frame, rect,
                    DrawMode.DRAW_VALUE, ShapeMode.SHAPE_OVAL, 0.0f);
            
            CameraServer.getInstance().setImage(frame);

            /** robot code here! **/
            Timer.delay(0.005);		// wait for a motor update time

		}
            
        public void end(){
        	NIVision.IMAQdxStopAcquisition(session);
	}
		
		}
