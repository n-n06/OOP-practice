package lab2;

public class DVD extends LibraryItem {
	private int duration;
	private double sampleRate;
	private Format format;
	
	public DVD(String title) {
		super(title);
	}
	
	public DVD(String title, String author) {
		super(title, author);
	}
	
	public DVD(String title, int publicationYear) {
		super(title, publicationYear);
	}
	
	public DVD(String title, String author, int publicationYear) {
		super(title, author, publicationYear);
	}
	
	public DVD(String title, String author, int publicationYear, int duration) {
		this(title, author, publicationYear);
		this.duration = duration;
	}
	
	public DVD(String title, String author, int publicationYear, double sampleRate) {
		this(title, author, publicationYear);
		this.sampleRate = sampleRate;
	}
	
	public DVD(String title, String author, int publicationYear, Format format) {
		this(title, author, publicationYear);
		this.format = format;
	}
	
	public DVD(String title, String author, int publicationYear, int duration, double sampleRate) {
		this(title, author, publicationYear, duration);
		this.sampleRate = sampleRate;
	}
	
	public DVD(String title, String author, int publicationYear, int duration, double sampleRate, Format format) {
		this(title,author,publicationYear, duration, sampleRate);
		this.format = format;
	}
	
	public int getBitrate() {
		return duration;
	}
	
	public double getSampleRate() {
		return sampleRate;
	}
	
	public Format getFormat() {
		return format;
	}
	
	public void setBitrate(int duration) {
		this.duration = duration;
	}
	
	public void setSampleRate(double sampleRate) {
		this.sampleRate = sampleRate;
	}
	
	public void setFormat(Format format) {
		this.format = format;
	}
	
	
	public String toString() {
		return "DVD, " + super.toString() + "bitrate: " + duration + ", sample rate: " + sampleRate + ", format: " + format;
	}
	
	public boolean equals(Object o) {
		if (!super.equals(o)) return false;
		DVD d = (DVD) o;
		return this.duration == d.duration && this.sampleRate == d.duration && this.format == d.format;
	}
	
}
