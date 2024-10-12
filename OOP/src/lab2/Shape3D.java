package lab2;

public abstract class Shape3D {
	public abstract double volume();
	public abstract double surfaceArea();
	
	public String toString() {
		return "Shape: ";
	};
	public boolean equals(Object o) {
		if (o == this) return true;
		if (o == null) return false;
		if (this.getClass() != o.getClass()) return false;
		
		Shape3D s = (Shape3D) o;
		return (this.surfaceArea() == s.surfaceArea() && this.volume() == s.volume());
		
	};

}
