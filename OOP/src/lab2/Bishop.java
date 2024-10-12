package lab2;

public class Bishop extends Piece {

	public Bishop() {
		
	}
	
	public Bishop(Position pos) {
		super(pos);
	}
	
	@Override
	public boolean isLegalMove(Position newPos) {
		if (!super.isLegalMove(newPos)) {
			return false;
		}
		return Piece.isLegalDiagonalMove(this.pos, newPos);
	}

	@Override
	public String toString() {
		return "Bishop at " + pos;
	}
}
