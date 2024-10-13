package lab2.task2;

public class Queen extends Piece {

	public Queen() {
		
	}
	
	public Queen(Position pos) {
		super(pos);
	}
	
	@Override
	public boolean isLegalMove(Position newPos) {
		if (!super.isLegalMove(newPos)) {
			return false;
		}
		return Piece.isLegalDiagonalMove(this.pos, newPos) || Piece.isLegalStraighMove(this.pos, newPos);
	}

	@Override
	public String toString() {
		return "Queen at " + pos;
	}
}
