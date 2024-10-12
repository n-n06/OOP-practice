package lab2;

public class TestPosition {

	public static void main(String[] args) {
		Position p = new Position('d', 4);
		System.out.println(p.getIntX());
		System.out.println(p.getIntY());
		
		Position p2 = new Position("d4");
		
		System.out.println(p2.equals(p));
		
	}

}
