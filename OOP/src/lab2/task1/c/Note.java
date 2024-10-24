package lab2.task1.c;

public class Note {
	private String name;
	private int octave;
	
	public Note(String name, int octave) {
		this.name = name.toUpperCase();
		this.octave = octave;
	}
	
	public Note(String note) {
		this.name = note.substring(0, 1).toUpperCase();
		this.octave = Integer.parseInt(note.substring(1, 2));
	}
	
	public String getName() {
		return name;
	}
	
	public int getOctave() {
		return octave;
	}
	
	public String toString() {
		return name + octave;
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Note n = (Note) o;
		return this.octave == n.octave && this.name.equals(n.name);
	}
}
