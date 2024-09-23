package lab1;

import java.util.Vector;

public class DragonLunch {
	private Vector<Person> peopleList = new Vector<>();

	public DragonLunch() {

	}

	public DragonLunch(Vector<Person> peopleList) {
		this.peopleList = peopleList;
	}

	public void kidnap(Person p) {
		this.peopleList.add(p);
	}

	public String getPeopleListGenders() {
		String output = "";
		for (Person p : this.peopleList) {
			if (p.getGender() == Gender.boy) {
				output += "B";
			} else {
				output += "G";
			}
		}
		return output;
	}

	public boolean willDragonEatOrNot() {
		if (this.peopleList.isEmpty()) {
			return false;
		}

		int leftPointer = 0;

		for (int rightPointer = 0; rightPointer < this.peopleList.size(); rightPointer++) {
			if (leftPointer > 0 
					&& this.peopleList.get(leftPointer - 1).getGender() == Gender.boy
					&& this.peopleList.get(rightPointer).getGender() == Gender.girl) {
				leftPointer--;
			} else {
				peopleList.set(leftPointer, peopleList.get(rightPointer));
				leftPointer++;
			}
		}

		return leftPointer > 0;
	}

	public String toString() {
		String output = "This dragon will ";
		if (!this.willDragonEatOrNot())
			output += "not ";
		output += "eat students today!";
		return output;
	}

}
