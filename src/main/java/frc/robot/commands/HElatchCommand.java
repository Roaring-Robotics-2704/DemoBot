// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotContainer;
import frc.robot.Constants;

public class HElatchCommand extends CommandBase {
  /** Creates a new DriveRobot. */
  public HElatchCommand() {
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(RobotContainer.m_latch);
  }
  
  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
  }
  //don't need to put anything in here

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    SmartDashboard.putBoolean("Raw Latch Output", RobotContainer.m_latch.getRaw());
    SmartDashboard.putString("Latch Pole", RobotContainer.m_latch.getLastPole());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
