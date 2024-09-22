package lab1;

import java.util.ArrayList;

public class Course {
	private String name;
	private String description;
	private int numOfCredits;
	private ArrayList<Course> prerequisites = new ArrayList<>();

	// constructor functions
	Course() {

	}

	Course(String name) {
		this.name = name;
	}

	Course(String name, String description) {
		this(name);
		this.description = description;
	}

	Course(String name, int numOfCredits) {
		this(name);
		this.numOfCredits = numOfCredits;
	}

	Course(String name, String description, int numOfCredits) {
		this(name, description);
		this.numOfCredits = numOfCredits;
	}

	Course(String name, int numOfCredits, ArrayList<Course> prereq) {
		this(name, numOfCredits);
		this.prerequisites = prereq;
	}

	Course(String name, String description, int numOfCredits, ArrayList<Course> prereq) {
		this(name, description, numOfCredits);
		this.prerequisites = prereq;
	}

	// getters and setters
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getNumOfCredits() {
		return this.numOfCredits;
	}

	public void setNumOfCredits(int numOfCredits) {
		if (numOfCredits > 0) {
			this.numOfCredits = numOfCredits;
		} else {
			System.err.println("Number of credits can only be a positive number!");
		}
	}

	public ArrayList<Course> getPrerequisites() {
		return this.prerequisites;
	}

	public Course getPrerequisiteAt(int index) {
		return this.prerequisites.get(index);
	}

	public void setPrerequisites(ArrayList<Course> prerequisites) {
		this.prerequisites = prerequisites;
	}

	public void addPrerequisite(Course prereq) {
		this.prerequisites.add(prereq);
	}

	public String toString() {
		return String.format("Course name: %s \nDescription: %s. \nCredits: %d \nPrerequisites: %s", this.name,
				this.description, this.numOfCredits, this.prerequisites.toString());
	}
}
