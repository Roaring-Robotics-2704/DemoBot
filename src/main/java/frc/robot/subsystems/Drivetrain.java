// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.interfaces.Gyro;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj.motorcontrol.PWMVictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;

public class Drivetrain extends SubsystemBase {
  /** Creates a new Drivetrain. */
    //Drive Train Motors
    //Declare Motor Controllers 
    //TalonSRXs
    private WPI_VictorSPX m_frontLeft = new WPI_VictorSPX(Constants.c_frontLeftMotorPort);
    private WPI_VictorSPX m_backLeft = new WPI_VictorSPX(Constants.c_backLeftMotorPort);
    private MotorControllerGroup m_left = new MotorControllerGroup(m_frontLeft, m_backLeft);
    //TalonSRXs
    private WPI_TalonSRX m_frontRight = new WPI_TalonSRX(Constants.c_frontRightMotorPort);
    private WPI_TalonSRX m_backRight = new WPI_TalonSRX(Constants.c_backRightMotorPort);
    private MotorControllerGroup m_right = new MotorControllerGroup(m_frontRight, m_backRight);

    //Mecanum Drive Consturctor 
    //need to make sure that the motor controller you declare works with speedcontroller
    private DifferentialDrive m_drive = new DifferentialDrive(m_left, m_right);

    //Declare PID stuff
    int P_PID = 1;
    int I_PID = 1;
    int D_PID = 1;
    int intergral = 0;
    int preiouvsError = 0;
    int setpoint = 0;
    public double rcw = 0;

    Gyro gyro;

    public Drivetrain(){
      
    }

    public Drivetrain(Gyro gyro){
      this.gyro = gyro;
    }

    public void setSetpoint(int setpoint){
      this.setpoint = setpoint;
    }

    public void PID(){
      double error = setpoint - gyro.getAngle();
      this.intergral += (error*0.02);
      double derivative = (error - this.preiouvsError)/0.02;
      rcw = P_PID*error +I_PID*this.intergral + D_PID*derivative;

    }

  public void arcadeDrive(double ySpeed, double zRotation){
    m_drive.arcadeDrive(ySpeed, zRotation);
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
