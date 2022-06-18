// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class PhotoelectricSensor extends SubsystemBase {
  /** Creates a new PhotoelectricSensor. */
  //Declare PhotoSwitch Sensor as a DigitalInput
  //Using Allen-Bradley RightSight 42EF-D1MNAK-A2 500mm DIFFUSE
  public DigitalInput photoElecticSensor = new DigitalInput(1);

  public PhotoelectricSensor() {
  }



  @Override
  public void periodic() {
    // This method will be called once per scheduler run

  }
}
