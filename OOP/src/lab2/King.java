package lab2;

public class King extends Piece {
	
	public King() {
		
	}
	
	public King(Position pos) {
		super(pos);
	}
	
	@Override
	public boolean isLegalMove(Position newPos) {
		return this.pos.differenceX(newPos) <= 1 && this.pos.differenceY(newPos) <= 1;
	}

	@Override
	public String toString() {
		return "King at " + pos;
	}
}
