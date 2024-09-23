package lab1;

public class DragonLunchTest {

	public static void main(String[] args) {
		DragonLunch d = new DragonLunch();

		Person p1 = new Person(Gender.GIRL);
		Person p2 = new Person(Gender.BOY);
		Person p3 = new Person(Gender.GIRL);
		Person p4 = new Person(Gender.BOY);
//		Person p5 =  new Person(Gender.girl);
//		Person p6 =  new Person(Gender.girl);

		d.kidnap(p1);
		d.kidnap(p2);
		d.kidnap(p3);
		d.kidnap(p4);
//		d.kidnap(p5);
//		d.kidnap(p6);

		System.out.println(d.getPeopleListGenders());
		System.out.println(d.willDragonEatOrNot());
		System.out.println(d);

	}

}
