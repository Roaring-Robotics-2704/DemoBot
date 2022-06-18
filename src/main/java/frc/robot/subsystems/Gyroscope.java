// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.ADIS16448_IMU;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Gyroscope extends SubsystemBase {
  /** Creates a new Gyroscope. */
  public ADIS16448_IMU gyro = new ADIS16448_IMU();

  public Gyroscope() {}

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
