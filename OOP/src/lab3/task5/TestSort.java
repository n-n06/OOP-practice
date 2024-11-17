package lab3.task5;

import java.util.Arrays;

import lab3.task4.*;
import practice2.Time;

public class TestSort {

	public static void main(String[] args) {
		Chocolate[] chocoArray = {
				new Chocolate("Snickers", 700),
				new Chocolate("Twix", 500),
				new Chocolate("Mars", 400),
				new Chocolate("Kazakhstan", 100),
				new Chocolate("Lotte", 200),
				new Chocolate("Bounty", 300),
				new Chocolate("Snickers", 600),
		};
		
		Time[] timeArray = {
				new Time(12, 30, 45),
				new Time(13, 40, 45),
				new Time(10, 10, 45),
				new Time(9, 30, 45),
				new Time(12, 10, 45),
				new Time(12, 30, 49),
				new Time(23, 30, 45),
		};
		
		Employee yuji = new Employee("Yuji", 9000);
		Employee maki = new Employee("Maki", 7500);
		Employee yuta = new Employee("Yuta", 7000);
		Employee inumaki = new Employee("Inumaki", 5000);
		
		Manager gojo = new Manager("Gojo", 10000, 2000);
		gojo.getTeam().add(yuji);
		gojo.getTeam().add(maki);
		gojo.getTeam().add(yuta);
		gojo.getTeam().add(inumaki);
		
		Employee[] employeeArray = {
				yuji,
				gojo,
				maki,
				inumaki,
				yuta
		};
		
		Sort.mergeSort(chocoArray);
		System.out.println(Arrays.toString(chocoArray));
		
		Sort.heapSort(timeArray);
		System.out.println(Arrays.toString(timeArray));
		
		Sort.mergeSort(employeeArray);
		
		for (Employee e : employeeArray) {
			System.out.println(e);
		};

	}

}
