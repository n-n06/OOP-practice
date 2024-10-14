package lab2.task2;

public class TestChess {
	public static void main(String[] args) {
		Pawn pawn1 = new Pawn(new Position("c2"));
		Pawn pawn2 = new Pawn(new Position("c3"));
		
		
		System.out.println("2 step pawn move at the start (expected true): " + pawn1.isLegalMove(new Position("c4")));
		System.out.println("2 step pawn move not at the start (expected false): " + pawn2.isLegalMove(new Position("c5")));
		System.out.println("1 step pawn move (expected true): " + pawn2.isLegalMove(new Position("c4")));
		
		Rook rook1 = new Rook(new Position("d4"));
		System.out.println("\nRook move (expected true): " + rook1.isLegalMove(new Position("h4")));
		System.out.println("Rook move (expected true): " + rook1.isLegalMove(new Position("b4")));
		System.out.println("Rook move (expected true): " + rook1.isLegalMove(new Position("d8")));
		System.out.println("Rook move (expected true): " + rook1.isLegalMove(new Position("d1")));
		System.out.println("Rook move (expected false): " + rook1.isLegalMove(new Position("c8")));
		
		Knight k = new Knight(new Position("d4"));
		System.out.println("\nKnight move (expected true): " + k.isLegalMove(new Position("b3")));
		System.out.println("Knight move (expected true): " + k.isLegalMove(new Position("b5")));
		System.out.println("Knight move (expected true): " + k.isLegalMove(new Position("f3")));
		System.out.println("Knight move (expected true): " + k.isLegalMove(new Position("f5")));
		System.out.println("Knight move (expected true): " + k.isLegalMove(new Position("c2")));
		System.out.println("Knight move (expected true): " + k.isLegalMove(new Position("c6")));
		System.out.println("Knight move (expected true): " + k.isLegalMove(new Position("e2")));
		System.out.println("Knight move (expected true): " + k.isLegalMove(new Position("e6")));
		System.out.println("Knight move (expected false): " + k.isLegalMove(new Position("c5")));
		
		Bishop b = new Bishop(new Position("g3"));
		System.out.println("\nBishop move (expected true): " + b.isLegalMove(new Position("h2")));
		System.out.println("Bishop move (expected true): " + b.isLegalMove(new Position("e1")));
		System.out.println("Bishop move (expected true): " + b.isLegalMove(new Position("c7")));
		System.out.println("Bishop move (expected true): " + b.isLegalMove(new Position("h4")));
		System.out.println("Bishop move (expected false): " + b.isLegalMove(new Position("f5")));
		
		King kingKunta = new King(new Position("E1"));
		System.out.println("\nKing move (expected true): " + kingKunta.isLegalMove(new Position("d1")));
		System.out.println("King move (expected true): " + kingKunta.isLegalMove(new Position("f2")));
		System.out.println("King move (expected false): " + kingKunta.isLegalMove(new Position("e3")));
		
		Queen q1 = new Queen(new Position("d4"));
		System.out.println("\nQueen move (expected true): " + q1.isLegalMove(new Position("h4")));
		System.out.println("Queen move (expected true): " + q1.isLegalMove(new Position("b4")));
		System.out.println("Queen move (expected true): " + q1.isLegalMove(new Position("d8")));
		System.out.println("Queen move (expected true): " + q1.isLegalMove(new Position("d1")));
		System.out.println("Queen move (expected false): " + q1.isLegalMove(new Position("c8")));
		
		Queen q2= new Queen(new Position("g3"));
		System.out.println("\nNew Queen!\nQueen move (expected true): " + q2.isLegalMove(new Position("h2")));
		System.out.println("Queen move (expected true): " + q2.isLegalMove(new Position("e1")));
		System.out.println("Queen move (expected true): " + q2.isLegalMove(new Position("c7")));
		System.out.println("Queen move (expected true): " + q2.isLegalMove(new Position("h4")));
		System.out.println("Queen move (expected false): " + q2.isLegalMove(new Position("f5")));
	}
}
