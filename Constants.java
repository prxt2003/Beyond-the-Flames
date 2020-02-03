/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants.  This class should not be used for any other purpose.  All constants should be
 * declared globally (i.e. public static).  Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {
    public static int leftJoystickPort = 0;
    public static int rightJoystickPort = 5;

    public static int leftSlaveMotorPort = 2;
    public static int rightSlaveMotorPort = 0;
    public static int leftMasterMotorPort = 3;
    public static int rightMasterMotorPort = 1;

    public static int leftButtonPort = 7;
    public static int rightButtonPort = 8;
    public static int upButtonPort = 9;
    public static int downButtonPort = 10; 

    public static int scissorActuator = 6;

}
