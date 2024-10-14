package lab2.task1.c;

import java.util.Objects;

public class NoteRange {
	private Note lowNote;
	private Note highNote;
	
	public NoteRange(Note lowNote, Note highNote) {
		this.lowNote = lowNote;
		this.highNote = highNote;
	}
	
	public int hashCode() {
		return Objects.hash(lowNote.toString(), highNote.toString());
	}
	
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		NoteRange nr = (NoteRange)o;
		return this.lowNote.equals(nr.lowNote) && this.highNote.equals(nr.highNote);
	}
	
	public String toString() {
		return "[" + lowNote + ", " + highNote + "]";
	}
}
