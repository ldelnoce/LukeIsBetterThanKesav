
package org.usfirst.frc.team1165.robot.subsystems;

import org.usfirst.frc.team1165.robot.commands.ReportAccelerometer;

import edu.wpi.first.wpilibj.BuiltInAccelerometer;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Accelerometer extends Subsystem {
     BuiltInAccelerometer accelerometer;
     public Accelerometer()
     {
    	 accelerometer  = new BuiltInAccelerometer();
     }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    	setDefaultCommand(new ReportAccelerometer());
    }
    
    public double valueX()
    {
    	return accelerometer.getX();
    }
    
    public double valueY()
    {
    	return accelerometer.getY();
    }
    
    public double valueZ()
    {
    	return accelerometer.getZ();
    }
}

