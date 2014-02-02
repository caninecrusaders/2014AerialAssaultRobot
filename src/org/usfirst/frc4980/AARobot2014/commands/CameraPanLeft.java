// RobotBuilder Version: 0.0.2
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in th future.


package org.usfirst.frc4980.AARobot2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc4980.AARobot2014.Robot;

/**
 *
 */
public class  CameraPanLeft extends Command {
    double currentPan;
    int counter;
    public CameraPanLeft() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
	
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.camera);
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    currentPan = Robot.cameraPan;
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        if (counter %5 == 0)
        {
        currentPan += 0.01;
        Robot.camera.cameraPan(currentPan);
        }
        counter++;
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        if (currentPan >= 1)
        {
            currentPan = 1;
            return true;
        }
        return false;
    }
    // Called once after isFinished returns true
    protected void end() {
        //Robot.camera.cameraPanStop();
        Robot.cameraPan = currentPan;
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}