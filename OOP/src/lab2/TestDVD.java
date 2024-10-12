package lab2;

public class TestDVD {

	public static void main(String[] args) {
		DVD d1 = new DVD("Kid A", "Radiohead", 2000, Format.MP3);
		DVD d2 = new DVD("Kid A", "Radiohead", 2000, Format.FLAC);
		
		System.out.println(d1.equals(d2));
		
		DVD d3 = new DVD("Velocity : Design : Comfort", "Sweet Trip", 2003);
		DVD d4 = new DVD("Velocity : Design : Comfort", "Sweet Trip");
		
		d4.setYear(2003);
		
		System.out.println(d4.equals(d3));

	}

}
