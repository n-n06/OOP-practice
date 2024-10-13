package lab2.task2;

public class Rook extends Piece {

	public Rook() {
		
	}
	
	public Rook(Position pos) {
		super(pos);
	}
	
	@Override
	public boolean isLegalMove(Position newPos) {
		if (!super.isLegalMove(newPos)) {
			return false;
		}
		return Piece.isLegalStraighMove(this.pos, newPos);
	}

	@Override
	public String toString() {
		return "Rook at " + pos;
	}
}
