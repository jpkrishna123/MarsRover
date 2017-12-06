package com.krishtech.marsrover;

import com.krishtech.marsrover.commands.CommandProcessor;
import com.krishtech.marsrover.model.Direction;
import com.krishtech.marsrover.model.Rover;

public class MarsRover {
	
	public static void main(String []args) {
		Rover rover = new Rover(5, 5);
		rover.setPosition(1, 2);
		rover.setDirection(Direction.NORTH);
		
		CommandProcessor.process(rover, "LMLMLMLMM");
		
		// here print the current position
		System.out.println(rover.toString());
		
		rover.setPosition(3, 3);
		rover.setDirection(Direction.EAST);
		
		CommandProcessor.process(rover, "MMRMMRMRRM");
		// here print the current position
		System.out.println(rover.toString());
	}
}
