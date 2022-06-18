package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class HallEffectLatch extends SubsystemBase {
    private DigitalInput latch = new DigitalInput(Constants.c_latchPin);
    public HallEffectLatch() {
  }

  public Boolean getRaw() {
    return latch.get();
  }

  public String getLastPole() {
      if(latch.get()){
        return "South";
      } else {
        return "North";
      }
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
