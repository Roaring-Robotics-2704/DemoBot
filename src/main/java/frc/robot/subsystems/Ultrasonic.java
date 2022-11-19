// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.AnalogInput;
import frc.robot.Constants;

public class Ultrasonic extends SubsystemBase {
  /** Creates a new Ultrasonic. */
  public AnalogInput ultrasonic = new AnalogInput(Constants.c_ultrasonic);
  public Ultrasonic() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}