package frc.robot.subsystems;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.VictorSP;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class sDrive extends SubsystemBase {

  public double tunable;
  public Victor leftMaster, rightMaster, leftSlave, rightSlave;
  public DifferentialDrive drive;
  public static double turnMultiplier;

  
  public sDrive(double tunable) {
    PWMVictorSPX leftFrontMotor= new PWMVictorSPX(Constants.leftFrontMotorPort);
    PWMVictorSPX rightFrontMotor= new PWMVictorSPX(Constants.rightFrontMotorPort);
    PWMVictorSPX leftBackMotor= new PWMVictorSPX(Constants.leftBackMotorPort);
    PWMVictorSPX rightBackMotor= new PWMVictorSPX(Constants.rightBackMotorPort);
    DifferentialDrive drive = new DifferentialDrive(leftFrontMotor, rightFrontMotor);
  }

  @Override
  public void periodic() {
    
  }
}
