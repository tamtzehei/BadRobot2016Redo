package org.usfirst.frc.team1014.robot;

import edu.wpi.first.wpilibj.DriverStation;

public class OI {
	public static DriverStation driverStation;
	public static XboxController xboxController0;
	public static void init()
	{
		driverStation = DriverStation.getInstance();
		xboxController0 = new XboxController(0);
	}
}
