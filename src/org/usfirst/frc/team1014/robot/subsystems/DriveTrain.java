
package org.usfirst.frc.team1014.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem {

	private static DriveTrain instance;

	public static DriveTrain getInstance()
	{
		if (instance == null)
			instance = new DriveTrain();
		return instance;
	}

	private DriveTrain()
	{
		super();
	}

	@Override
	protected void initDefaultCommand()
	{
	}

}
