package lab2;

/*
 * TODO:
 * 0. constructors
 * 1. getters, setters
 * 2. toString
 * 3. equals
 * */

public class Position {
	private int x = 0; //letters
	private int y = 0; //numbers
	
	//constructors
	
	public Position(char letter, int num) {
		setPosition(letter, num);
	}
	
	public Position(String pos) {
		setPosition(pos);
	}
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public boolean isOnBoard() {
		return x >= 0 && x < 8 && y >= 0 && y < 8;
	}
	
	//getters
	public int getIntX() {
		return x;
	}
	
	public int getIntY() {
		return y;
	}
	
	public String getX() {
		return "" + (char) (x + 97);
	}
	
	public String getY() {
		return "" + (y + 1);
	}
	
	public String getPosition() {
		return "" + getX() + getY();
	}
	
	public void setPosition(char letter, int num) { //i put these here to not duplicate code
		try {	//try-catches are not taken from gpt. i wrote them myself bc i have experience with try-catch in JS and it is similar to that of java
			x = (int) letter - 97;
			y = num - 1;
			
			if (!isOnBoard()) {
				x = 0;
				y = 0;
				throw new Exception("Incorrect coordinates!");
			}
			
		} catch (Exception e) {
			System.err.println("Error converting to Position");
		}		
	}
	
	public void setPosition(String pos) {
		setPosition(pos.toLowerCase().charAt(0), Integer.parseInt(pos.substring(1)));
	}
	
	public int differenceX(Position pos) {
		return Math.abs(pos.x - this.x);
	}
	
	public int differenceY(Position pos) {
		return Math.abs(pos.y - this.y);
	}
	
	public String toString() {
		return "Position: " + getPosition() + ", " + "x :" + x + ", y: " + y;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Position p = (Position)o;
		
		return p.x == this.x && p.y == this.y;
		
	}
	

}
