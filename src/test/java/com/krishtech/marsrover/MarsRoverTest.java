package com.krishtech.marsrover;

import org.junit.Assert;
import org.junit.Test;

import com.krishtech.marsrover.commands.CommandProcessor;
import com.krishtech.marsrover.model.Direction;
import com.krishtech.marsrover.model.Rover;

public class MarsRoverTest {
	
	@Test
	public void currentPositionTest() {
		Rover rover = new Rover();
		rover.setPosition(3, 3);
		rover.setDirection(Direction.NORTH);

		Assert.assertEquals("3 3 N", rover.toString());
	}
	
	@Test
	public void blankCommandTest() {
		Rover rover = new Rover();
		rover.setPosition(3, 3);
		rover.setDirection(Direction.NORTH);
		
		CommandProcessor.process(rover, "");
		Assert.assertEquals("3 3 N", rover.toString());
	}
	
	@Test
	public void wrongCommandTest() {
		Rover rover = new Rover();
		rover.setPosition(1, 3);
		rover.setDirection(Direction.NORTH);
		
		CommandProcessor.process(rover, "U");
		Assert.assertEquals("1 3 N", rover.toString());
	}
	
	@Test
	public void verifyMoveTest() {
		Rover rover = new Rover();
		rover.setPosition(1, 3);
		rover.setDirection(Direction.NORTH);
		
		CommandProcessor.process(rover, "M");
		Assert.assertEquals("1 4 N", rover.toString());
	}
	
	@Test
	public void verifyRotateLeftTest() {
		Rover rover = new Rover();
		rover.setPosition(1, 2);
		rover.setDirection(Direction.NORTH);
		
		CommandProcessor.process(rover, "L");
		Assert.assertEquals("1 2 W", rover.toString());
	}
	
	@Test
	public void verifyRotateRightTest() {
		Rover rover = new Rover();
		rover.setPosition(1, 2);
		rover.setDirection(Direction.NORTH);
		
		CommandProcessor.process(rover, "R");
		Assert.assertEquals("1 2 E", rover.toString());
	}
	
	@Test
	public void verifyMultipleCommandsTest() {
		Rover rover = new Rover();
		rover.setPosition(3, 3);
		rover.setDirection(Direction.EAST);
		
		CommandProcessor.process(rover, "MMRMMRMRRM");
		Assert.assertEquals("5 1 E", rover.toString());
	}
}
