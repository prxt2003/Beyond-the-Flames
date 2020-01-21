package frc.robot.subsystems;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class sDrive extends SubsystemBase {

  WPI_VictorSPX leftSlaveMotor = new WPI_VictorSPX(Constants.leftSlaveMotorPort);
  WPI_VictorSPX rightSlaveMotor = new WPI_VictorSPX(Constants.rightSlaveMotorPort);
  WPI_VictorSPX leftMasterMotor = new WPI_VictorSPX(Constants.leftMasterMotorPort);
  WPI_VictorSPX rightMasterMotor = new WPI_VictorSPX(Constants.rightMasterMotorPort);
  // SpeedControllerGroup leftMotorGroup = new SpeedControllerGroup(leftMasterMotor, leftSlaveMotor);
  // SpeedControllerGroup rightMotorGroup = new SpeedControllerGroup(rightMasterMotor, rightSlaveMotor);
  DifferentialDrive drive = new DifferentialDrive(leftMasterMotor, rightMasterMotor);


  public sDrive() {
    leftSlaveMotor.follow(leftMasterMotor);
    rightSlaveMotor.follow(rightMasterMotor);
    
    leftSlaveMotor.configFactoryDefault();
    rightSlaveMotor.configFactoryDefault();
    leftMasterMotor.configFactoryDefault();
    rightMasterMotor.configFactoryDefault();

    leftSlaveMotor.setInverted(false);
    rightSlaveMotor.setInverted(false);
    leftMasterMotor.setInverted(false);
    rightMasterMotor.setInverted(false);
  }

  public void manualDrive(double speed, double rotation) {
    drive.arcadeDrive(speed, rotation);
  }

  public void stop() {
  }

  @Override
  public void periodic() {
  }
}
