
package org.usfirst.frc.team1014.robot.subsystems;

import org.usfirst.frc.team1014.robot.RobotMap;
import org.usfirst.frc.team1014.robot.util.SwerveWheel;
import org.usfirst.frc.team1014.robot.util.Vector2d;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	private static final double ENCODER_CPR = 414.1666d;
	private static final double L = 1, W = 1;
	private static DriveTrain instance;

	public static DriveTrain getInstance()
	{
		if (instance == null)
			instance = new DriveTrain();
		return instance;
	}

	SwerveWheel wheel1, wheel2, wheel3, wheel4;

	private DriveTrain()
	{
		super();
		wheel1 = new SwerveWheel(RobotMap.DRIVE_MOTOR_0, RobotMap.PIVOT_MOTOR_0, RobotMap.PIVOT_ENCODER_0A,
				RobotMap.PIVOT_ENCODER_0B, ENCODER_CPR);
		wheel2 = new SwerveWheel(RobotMap.DRIVE_MOTOR_1, RobotMap.PIVOT_MOTOR_1, RobotMap.PIVOT_ENCODER_1A,
				RobotMap.PIVOT_ENCODER_1B, ENCODER_CPR);
		wheel3 = new SwerveWheel(RobotMap.DRIVE_MOTOR_2, RobotMap.PIVOT_MOTOR_2, RobotMap.PIVOT_ENCODER_2A,
				RobotMap.PIVOT_ENCODER_2B, ENCODER_CPR);
		wheel4 = new SwerveWheel(RobotMap.DRIVE_MOTOR_3, RobotMap.PIVOT_MOTOR_3, RobotMap.PIVOT_ENCODER_3A,
				RobotMap.PIVOT_ENCODER_3B, ENCODER_CPR);
	}

	public void drive(double rotation, Vector2d translation)
	{
		double a = translation.getX() - rotation * L / 2;
		double b = translation.getX() + rotation * L / 2;
		double c = translation.getY() - rotation * W / 2;
		double d = translation.getY() + rotation * W / 2;

		wheel1.drive(Math.atan2(b, c), speed(b, c));
		wheel2.drive(Math.atan2(b, d), speed(b, d));
		wheel3.drive(Math.atan2(a, d), speed(a, d));
		wheel4.drive(Math.atan2(a, c), speed(a, c));
	}

	private double speed(double x, double y)
	{
		return Math.sqrt(x * x + y * y);
	}

	@Override
	protected void initDefaultCommand()
	{
	}

}
