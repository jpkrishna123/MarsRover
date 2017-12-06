package com.krishtech.marsrover.model;

public class Position {
	private int x;
	private int y;
	
	public Position(){}
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void incrementX() {
		this.x++;
	}
	
	public void incrementY() {
		this.y++;
	}
	
	public void decrementX() {
		this.x--;
	}
	
	public void decrementY() {
		this.y--;
	}
	
}
