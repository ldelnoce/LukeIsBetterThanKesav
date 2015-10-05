
package org.usfirst.frc.team1165.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team1165.robot.Robot;

/**
 *
 */
public class ReportAccelerometer extends Command {

    public ReportAccelerometer() {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.accelerometer);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute()
    {
    	SmartDashboard.putNumber("Accelerometer X", Robot.accelerometer.valueX());
    	SmartDashboard.putNumber("Accelerometer Y", Robot.accelerometer.valueY());
    	SmartDashboard.putNumber("Accelerometer Z", Robot.accelerometer.valueZ());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
