// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc.team6665.robot.subsystems;

import org.usfirst.frc.team6665.robot.RobotMap;
import org.usfirst.frc.team6665.robot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Joystick;
// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS


/**
 *
 */
public class DriveTrain extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTANTS

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    private final SpeedController speedControllerleft_back = RobotMap.driveTrainSpeedControllerleft_back;
    private final SpeedController speedControllerleft_front = RobotMap.driveTrainSpeedControllerleft_front;
    private final SpeedControllerGroup speedControllerLeft = RobotMap.driveTrainSpeedControllerLeft;
    private final SpeedController speedControllerright_back = RobotMap.driveTrainSpeedControllerright_back;
    private final SpeedController speedControllerright_front = RobotMap.driveTrainSpeedControllerright_front;
    private final SpeedControllerGroup speedControllerRight = RobotMap.driveTrainSpeedControllerRight;
    public final DifferentialDrive differentialDrive1 = RobotMap.driveTrainDifferentialDrive1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    @Override
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND


    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND

        // Set the default command for a subsystem here.
        // setDefaultCommand(new MySpecialCommand());
    }

    @Override
    public void periodic() {
        // Put code here to be run every loop

    }

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
  public void TakeJoystickInput(Joystick joystick) {
	  // multiply each input to adjust sensitivity
	 differentialDrive1.arcadeDrive(0.8*joystick.getY(), 0.8*joystick.getX());

  }
   public void StopDriving() {
	   differentialDrive1.arcadeDrive(0,0);
   }

}

