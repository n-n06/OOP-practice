package practice2;

public class StarTriangle {
	private int width = 0;
	
	public StarTriangle(int width) {
		this.width = width;
	}
	
	public String toString() {
		String output = "";
		for (int i = 0; i < this.width; i++) {
			for (int j = 0; j < i + 1; j++) {
				output += "[*]";
			}
			if (i != this.width - 1) {
				output += "\n";
			}
		}
		return output;
	}
}
