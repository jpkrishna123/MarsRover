package com.krishtech.marsrover.commands;

import com.krishtech.marsrover.model.Direction;
import com.krishtech.marsrover.model.Rover;

public class CommandLeft implements IFCommand {

	@Override
	public void execute(Rover rover) {
		Direction direction = rover.getDirection().left();
		rover.setDirection(direction);
	}

}
