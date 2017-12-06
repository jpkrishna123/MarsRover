package com.krishtech.marsrover.commands;

import com.krishtech.marsrover.model.Direction;
import com.krishtech.marsrover.model.Rover;

public class CommandRight implements IFCommand {

	@Override
	public void execute(Rover rover) {
		Direction direction = rover.getDirection().right();
		rover.setDirection(direction);
	}

}
