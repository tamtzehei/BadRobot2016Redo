package org.usfirst.frc.team1014.robot.commands;

import org.usfirst.frc.team1014.robot.subsystems.DriveTrain;

import edu.wpi.first.wpilibj.command.Command;

public class TeleDrive extends Command {

	@Override
	protected void end()
	{
	}

	@Override
	protected void execute()
	{
		System.out.println("TeleDrive execute()");
	}

	@Override
	protected void initialize()
	{
		requires(DriveTrain.getInstance());
	}

	@Override
	protected void interrupted()
	{
	}

	@Override
	protected boolean isFinished()
	{
		return false;
	}

}
