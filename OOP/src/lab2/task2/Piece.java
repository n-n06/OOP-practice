package lab2.task2;

import java.util.Objects;

public abstract class Piece {
	Position pos;
	//add color property with an Enum, rewrite move checks later)
	
	public Piece () {
		
	}
	
	public Piece (Position pos) {
		this.pos = pos;
	}
	
	public boolean isLegalMove(Position newPos) {;
		if (!newPos.isOnBoard()) {
			return false;
		}
		if (this.pos.equals(newPos)) {
			return false;
		}
		return true;
	}
	
	public static boolean isLegalDiagonalMove(Position oldPos, Position newPos) {
		if (!oldPos.isOnBoard() || !newPos.isOnBoard()) {
			return false;
		}
		int diffX = oldPos.differenceX(newPos);
		int diffY = oldPos.differenceY(newPos);
		
		return diffX == diffY; 
	}
	
	public static boolean isLegalStraighMove(Position oldPos, Position newPos) {
		if (!oldPos.isOnBoard() || !newPos.isOnBoard()) {
			return false;
		}
		int diffX = oldPos.differenceX(newPos);
		int diffY = oldPos.differenceY(newPos);
		
		return (diffX == 0 || diffY == 0);
	}
	
	public abstract String toString();
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Piece p = (Piece)o;
		
		return p.pos == this.pos;
	};
	
	public int hashCode() {
		return Objects.hash(this.pos) * Objects.hash(this.getClass());
	}
}
