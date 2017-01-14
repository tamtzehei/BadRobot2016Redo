package util;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

public class SwerveWheel {

	private static final int ANGLE_DIFF_COEFFICIENT = 1;

	SpeedController driveSpeedController;
	SpeedController swerveSpeedController;
	Encoder encoder;

	/*
	 * CPR is Counts per Rotation and is the product of encoders internal CPR
	 * and the gear ratio.
	 */
	double encoderCPR;

	public SwerveWheel(int driveMotorPin, int swerveMotorPin, int encoderAPin, int encoderBPin, double encoderCPR)
	{
		this.encoderCPR = encoderCPR;
		driveSpeedController = new Talon(driveMotorPin);
		swerveSpeedController = new Talon(swerveMotorPin);
		encoder = new Encoder(encoderAPin, encoderBPin);
	}

	public void drive(double angle, double speed)
	{
		double physical_angle = getAngle();
		double turn_speed = (-2d * Math.atan(ANGLE_DIFF_COEFFICIENT * (physical_angle - angle))) / Math.PI;
		driveSpeedController.set(speed);
		swerveSpeedController.set(turn_speed);
	}

	private double getAngle()
	{
		return ((double) encoder.get()) / encoderCPR;
	}
}
