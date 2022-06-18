// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotContainer;
import frc.robot.Constants;

public class HEanalogCommand extends CommandBase {
  public HEanalogCommand() {
    addRequirements(RobotContainer.m_HEanalog);
  }

  // Called just before this Command runs the first time
  @Override
  public void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  public void execute() {
    SmartDashboard.putNumber("Raw Analog HE Volts", RobotContainer.m_HEanalog.getRawVoltage());
    SmartDashboard.putNumber("Scaled analog HE", RobotContainer.m_HEanalog.getScaled());
    SmartDashboard.putString("Pole",RobotContainer.m_HEanalog.getPole());
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  public boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  public void end(boolean interrupted) {}
}
