package lab2.task1.b;

public abstract class LibraryItem {
	private String title;
	private String author;
	private int publicationYear;
	
	public LibraryItem() {
		
	}
	
	public LibraryItem(String title) {
		this.title = title;
	}
	
	public LibraryItem(String title, String author) {
		this(title);
		this.author = author;
	}
	
	public LibraryItem(String title, int publicationYear) {
		this(title);
		this.publicationYear = publicationYear;
	}
	
	public LibraryItem(String title, String author, int publicationYear) {
		this(title, author);
		this.publicationYear = publicationYear;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public int getYear() {
		return publicationYear;
	}
	
	public void setYear(int year) {
		this.publicationYear = year;
	}
	
	public String toString() {
		return "title: " + title + ", author" + author + ", published: " + publicationYear;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		LibraryItem li = (LibraryItem) o;
		return this.publicationYear == li.publicationYear &&  this.author == li.author && this.title == li.title; 
	}
}
