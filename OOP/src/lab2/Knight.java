package lab2;

public class Knight extends Piece {
	
	public Knight() {
		
	}
	
	public Knight(Position pos) {
		super(pos);
	}
	
	@Override
	public boolean isLegalMove(Position newPos) {
		if (!super.isLegalMove(newPos)) {
			return false;
		}
		int diffX = this.pos.differenceX(newPos);
		int diffY = this.pos.differenceY(newPos);
		return (diffX == 1 && diffY == 2) || (diffY == 1 && diffX == 2);
	}

	@Override
	public String toString() {
		return "Knight at " + pos;
	}
}
