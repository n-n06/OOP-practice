package lab2;

/*
 * TODO: 
 * 1. overrider equals and hashCode
 * 2. test the class for equality and equality in HashSets
 * 3. fix NoteRange
 * 
 * */

public class Guitar extends MusicInstrument {
	private int numOfStrings;
	
	public Guitar() {
		super();
	}
	
	public Guitar(String brand) {
		super(brand);
	}
	
	public Guitar(String brand, int year) {
		super(brand, year);
	}
	
	public Guitar(String brand, int year, int numOfStrings) {
		this(brand, year);
		this.numOfStrings = numOfStrings;
	}
	
	public Guitar(String brand, int year, NoteRange range) {
		super(brand, year, range);
	}
	
	public Guitar(String brand, int year, NoteRange range, int numOfStrings) {
		this(brand, year, range);
		this.numOfStrings = numOfStrings;
	}
	
	public Guitar(String brand, int year, String lowest, String highest) {
		super(brand, year, lowest, highest);
	}
	
	public Guitar(String brand, int year, String lowest, String highest, int numOfStrings) {
		super(brand, year, lowest, highest);
		this.numOfStrings = numOfStrings;
	}
	
	
	public int getNumOfStrings() {
		return this.numOfStrings;
	}
	
	public void setNumOfStrings(int strings) {
		this.numOfStrings = strings;
	}
	
	public String toString() {
		return "Guitar: [" + super.toString() + ", Strings: " + numOfStrings + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		Guitar g = (Guitar)o;
		return this.numOfStrings == g.numOfStrings;
	}
	
	@Override 
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = result * prime + numOfStrings;
		return result;
	}
	
	
}
