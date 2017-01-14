package org.usfirst.frc.team1014.robot.commands;

import org.usfirst.frc.team1014.robot.OI;
import org.usfirst.frc.team1014.robot.subsystems.DriveTrain;
import org.usfirst.frc.team1014.robot.util.Vector2d;

import edu.wpi.first.wpilibj.command.Command;

public class TeleDrive extends Command {

	@Override
	protected void end()
	{
	}

	@Override
	public void execute()
	{
		DriveTrain.getInstance().drive(OI.xboxController0.getRawAxis(0), new Vector2d(OI.xboxController0.getRawAxis(4), -OI.xboxController0.getRawAxis(5)));
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
