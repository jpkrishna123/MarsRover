package com.krishtech.marsrover.model;

public class Rover {
	private Position position;
	private Direction direction;
	
	public Rover() {
	}
	
	public Rover(final int x, final int y) {
		this.position = new Position(x, y);
	}
	
	public Rover(final int x, final int y, Direction direction) {
		this.position = new Position(x, y);
		this.direction = direction;
	}
	
	public Rover(final Position position, final Direction direction) {
		this.position = position;
		this.direction = direction;
	}
	
	public Position getPosition() {
		return position;
	}
	
	public void setPosition(Position position) {
		this.position = position;
	}
	
	public void setPosition(int x, int y) {
		this.position = new Position(x, y);
	}
	
	public Direction getDirection() {
		return direction;
	}
	
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	
	public String toString() {
		return this.position.getX() +  " " +   this.position.getY() +  " "  
				+  this.direction.toString();
	}
	
}
