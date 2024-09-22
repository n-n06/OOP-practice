package lab1;

import practice2.Student;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class GradeBook {
	private Course course;
	private ArrayList<Student> studentList = new ArrayList<>();

	private Map<Student, Integer> studentGrades = new HashMap<>(); // store grades in hashmap bc O(1)

	/*
	 * TODO : 1 constructors 2 getters and setters 3 toString 4 store grades
	 */

	private void setInitGrades() {
		for (Student s : this.studentList) {
			this.studentGrades.put(s, 0);
		}
	}

	// constructors

	public GradeBook() {
		setInitGrades();
	}

	public GradeBook(Course course) {
		this();
		this.course = course;
	}

	public GradeBook(ArrayList<Student> studentList) {
		this();
		this.studentList = studentList;
	}

	public GradeBook(Course course, ArrayList<Student> studentList) {
		this(course);
		this.studentList = studentList;
	}

	// getters and setters
	// course

	public Course getCourse() {
		return this.course;
	}

	public String getCourseAsString() {
		return this.course.toString();
	}

	public void setCourse(Course c) {
		this.course = c;
	}

	// list of students

	public ArrayList<Student> getStudentList() {
		return this.studentList;
	}

	public String getStudentListAsString() {
		return this.studentList.toString();
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
		this.setInitGrades();
	}

	public void addStudentToList(Student s1) {
		this.studentList.add(s1);
		this.studentGrades.put(s1, 0);
	}

	// grade setters and getters

	public int getGrade(Student s) {
		return this.studentGrades.get(s);
	}

	public void setGrade(Student s, int g) {
		if (g >= 0 && g <= 100) {
			this.studentGrades.put(s, g);
		} else {
			System.err.println("Grades can only be integer numbers between 0 and 100!");
		}
	}

	// statistics

	public double getAverageGrade() {
		int sum = 0;
		for (Student s : this.studentList) {
			sum += this.studentGrades.get(s);
		}
		return (double) sum / this.studentList.size();
	}

	public Student getStudentWithMinGrade() {
		Student min = this.studentList.get(0);
		for (Student s : this.studentList) {
			if (this.studentGrades.get(s) < this.studentGrades.get(min)) {
				min = s;
			}
		}
		return min;
	}

	public Student getStudentWithMaxGrade() {
		Student max = this.studentList.get(0);
		for (Student s : this.studentList) {
			if (this.studentGrades.get(s) > this.studentGrades.get(max)) {
				max = s;
			}
		}
		return max;
	}

	// barchart

	public void displayBarchart() {
		System.out.println("\nGrades distribution: ");
		int[] ranges = new int[11];

		for (Integer value : this.studentGrades.values()) {
			ranges[value / 10]++;
		}

		for (int i = 0; i < ranges.length; i++) {
			String rangeName;
			if (i == 10) {
				rangeName = "100:   ";
			} else {
				rangeName = String.format("%02d-%02d: ", i * 10, i * 10 + 9);
			}

			System.out.print(rangeName);

			for (int j = 0; j < ranges[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	// display functions
	private String getGreeting() {
		return "Welcome to the grade book for " + this.course.getName() + "!";
	}

	public void displayMessage() {
		System.out.println(getGreeting());
	}

	// string conversion
	public String toString() {
		return this.getGreeting() + "\n" + this.course.toString() + "\n\n" + "Students: \n"
				+ this.studentList.toString();
	}
}
