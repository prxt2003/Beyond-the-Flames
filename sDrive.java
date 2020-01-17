package frc.robot.subsystems;
import edu.wpi.first.wpilibj.PWMVictorSPX;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class sDrive extends SubsystemBase {

  
  public PWMVictorSPX leftFrontMotor, rightFrontMotor, leftBackMotor, rightBackMotor;
  public DifferentialDrive drive;
  public SpeedControllerGroup leftMotorGroup, rightMotorGroup;


  public sDrive() {
    PWMVictorSPX leftFrontMotor= new PWMVictorSPX(Constants.leftFrontMotorPort);
    PWMVictorSPX rightFrontMotor= new PWMVictorSPX(Constants.rightFrontMotorPort);
    PWMVictorSPX leftBackMotor= new PWMVictorSPX(Constants.leftBackMotorPort);
    PWMVictorSPX rightBackMotor= new PWMVictorSPX(Constants.rightBackMotorPort);
    DifferentialDrive drive = new DifferentialDrive(leftFrontMotor, rightFrontMotor);
    SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftFrontMotor, leftBackMotor);
    SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(rightFrontMotor, rightBackMotor);
  }

  public void manualDrive(double speed, double rotation) {
    drive.arcadeDrive(speed, rotation);
  }

  @Override
  public void periodic() {
    
  }
}
