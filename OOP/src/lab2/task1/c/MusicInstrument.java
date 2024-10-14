package lab2.task1.c;

public class MusicInstrument {
	private String brand;
	private int yearMade;
	private NoteRange range;
	
	public MusicInstrument() {
		
	}
	
	public MusicInstrument(String brand) {
		this.brand = brand;
	}
	
	public MusicInstrument(String brand, int year) {
		this(brand);
		this.yearMade = year;
	}
	
	public MusicInstrument(String brand, int year, NoteRange range) {
		this(brand, year);
		this.range = range;
	}
	
	public MusicInstrument(String brand, int year, String lowest, String highest) {
		this(brand, year);
		this.range = new NoteRange(new Note(lowest), new Note(highest));
	}
	
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public int getYear() {
		return yearMade;
	}
	
	public void setYear(int year) {
		this.yearMade = year;
	}
	
	public NoteRange getRange() {
		return range;
	}
	
	public void setRange(NoteRange range) {
		this.range = range;
	}
	
	public void setRange(String lowest, String highest) {
		this.range = new NoteRange(new Note(lowest), new Note(highest));
	}
	
	public String toString() {
		return "brand: " + brand + ", year made: " + yearMade + ", note range: " + range;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		MusicInstrument mi = (MusicInstrument) o;
		return this.brand.equals(mi.brand) &&
				this.yearMade == mi.yearMade &&
				this.range.equals(mi.range);
	}
	
	public int hashCode() {
	    final int prime = 31;
	    int result = 17;
	    result = prime * result + ((brand == null) ? 0 : brand.hashCode());
	    result = prime * result + yearMade;
	    result = prime * result + ((range == null) ? 0 : range.hashCode());
	    return result;
	}
	
}
