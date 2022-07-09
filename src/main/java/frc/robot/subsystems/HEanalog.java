package frc.robot.subsystems;

import edu.wpi.first.wpilibj.AnalogInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class HEanalog extends SubsystemBase {
    private AnalogInput sensor = new AnalogInput(Constants.c_analogHEpin);
    public HEanalog() {
  }

  public double getRawVoltage() {
    return sensor.getVoltage();
  }

  public double getScaled() {
      return (sensor.getVoltage()/1) - 1; //0->2 scaled to -1 -> 1
  }

  public String getPole() {
      double value = getScaled();
      if(value > Constants.AnalogHEThreshold){
        return "North";
      } else if(value < -Constants.AnalogHEThreshold) {
        return "South";
      } else {
        return "None";
      }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
