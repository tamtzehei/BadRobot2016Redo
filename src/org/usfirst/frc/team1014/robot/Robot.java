
package org.usfirst.frc.team1014.robot;

import org.usfirst.frc.team1014.robot.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Robot extends IterativeRobot {
	
	private TeleDrive teleDrive;

	public void robotInit()
	{
		System.out.println("Init");
		OI.init();
		teleDrive = new TeleDrive();
	}

	public void disabledInit()
	{
	}

	public void autonomousInit()
	{
	}

	public void teleopInit()
	{
		
	}

	public void testInit()
	{
	}

	public void disabledPeriodic()
	{
	}

	public void autonomousPeriodic()
	{
	}

	public void teleopPeriodic()
	{
		teleDrive.execute();
	}

	public void testPeriodic()
	{
	}

}
