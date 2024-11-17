package lab3.task4;

import java.util.Collections;
import java.util.Vector;
import lab3.task4.NameComparator;
import java.util.concurrent.TimeUnit;


public class TestEmployee {

	public static void main(String[] args) throws InterruptedException, CloneNotSupportedException {		
		Manager m = new Manager();
		
		Vector<Employee> v = new Vector<>();
		Vector<Employee> v_names = new Vector<>();
		Vector<Employee> v_hire_date = new Vector<>();
		
		Employee e1 = new Employee("John", 200);
//		TimeUnit.SECONDS.sleep(1);
		Employee e2 = new Employee("Thom", 100);
//		TimeUnit.SECONDS.sleep(1);
		Employee e3 = new Employee("Mark", 300);
//		TimeUnit.SECONDS.sleep(1);
		Employee e4 = new Employee("Alice", 500);
//		TimeUnit.SECONDS.sleep(1);
		
		v.add(e1);
		v.add(e2);
		v.add(e3);
		v.add(e4);
		
		v_names.addAll(v);
		v_hire_date.addAll(v);
		
		
		System.out.println(m);
		
		Collections.sort(v);
		Collections.sort(v_names, new NameComparator());
		Collections.sort(v_hire_date, new HireDateComparator());
		
		System.out.println(v);
		System.out.println(v_names);
		System.out.println(v_hire_date);
		
		
		Employee e5 = new Employee("Gojo", 700);
		Employee e6 = (Employee) e5.clone();
		
		e5.getHireDate().setYear(99); //deprecated lmao
		System.out.println("\n" + e5);
		System.out.println(e6);
		
		Manager m1 = new Manager("Joseph", 1000);
		m1.getTeam().add(e1);
		m1.getTeam().add(e2);
		m1.getTeam().add(e3);
		m1.getTeam().add(e4);
		
		Manager m2 = (Manager) m1.clone();
		m2.getTeam().add(e5);
		
		System.out.println("\nOriginal vector size is not changed: " + m1.getTeam().size());
		System.out.println(m2.getTeam().size());
				
		System.out.println(m1);
		System.out.println(m2);
	}

}
