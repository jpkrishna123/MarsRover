package com.krishtech.marsrover.commands;

import com.krishtech.marsrover.model.Position;
import com.krishtech.marsrover.model.Rover;

public class CommandMove implements IFCommand {

	@Override
	public void execute(Rover rover) {
		
		Position position = rover.getPosition();
		switch (rover.getDirection()) {
	      case NORTH:
	       position.incrementY();
	       break;
	      case EAST:
	       position.incrementX();
	       break;
	      case SOUTH:
	       position.decrementY();
	       break;
	      case WEST:
	       position.decrementX();
	       break;
	     }
	}

}
