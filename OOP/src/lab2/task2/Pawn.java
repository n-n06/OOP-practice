package lab2.task2;

public class Pawn extends Piece {
	
	public Pawn() {
		
	}
	
	public Pawn(Position pos) {
		super(pos);
	}
	
	@Override
	public boolean isLegalMove(Position newPos) {
		if (!super.isLegalMove(newPos)) {
			return false;
		}
		
		if (this.pos.getIntY() == 1 || this.pos.getIntY() == 6) {
			return this.pos.differenceY(newPos) <= 2;
		} else {
			return this.pos.differenceY(newPos) <= 1;
		}
	}

	@Override
	public String toString() {
		return "Pawn at " + pos;
	}

	
}
