// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import frc.robot.commands.DriveRobot;
import frc.robot.subsystems.DriveTrain;
/**
 * This class is where the bulk of the robot should be declared. Since Command-based is a
 * "declarative" paradigm, very little robot logic should actually be handled in the {@link Robot}
 * periodic methods (other than the scheduler calls). Instead, the structure of the robot (including
 * subsystems, commands, and button mappings) should be declared here.
 */
 // the m in front does not mean anything 
public class RobotContainer {
  // The robot's subsystems and commands are defined here...
  //Subsytems defined
  public static DriveTrain m_driveTrain = new DriveTrain();

  //Commands defined
  public static DriveRobot m_driveRobot = new DriveRobot();

  //OI defined
  public static Joystick joystickMain = new Joystick(Constants.c_joystickMain);
  public static Joystick joystickExtraButton = new Joystick(Constants.c_joystickButton);
 
  //Chooser for autonomous
  SendableChooser<Boolean> autoChooser = new SendableChooser<>();

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    // Configure the button bindings
    configureButtonBindings();

    //Connects the subsystem to the command
    m_driveTrain.setDefaultCommand(m_driveRobot);
   // autoChooser.setDefaultOption("Normal", true);
   // autoChooser.addOption("Taxi Only", false);
    //SmartDashboard.putData("Autonomous Mode", autoChooser);
  }

  /**
   * Use this method to define your button->command mappings. Buttons can be created by
   * instantiating a {@link GenericHID} or one of its subclasses ({@link
   * edu.wpi.first.wpilibj.Joystick} or {@link XboxController}), and then passing it to a {@link
   * edu.wpi.first.wpilibj2.command.button.JoystickButton}.
   */
  private void configureButtonBindings() {
    
  }

  /**
   * Use this to pass the autonomous command to the main {@link Robot} class.
   *
   * @return the command to run in autonomous
   */
  //public Command getAutonomousCommand() {
    // An ExampleCommand will run in autonomous
    //return m_autoCommand;
  //}
}
