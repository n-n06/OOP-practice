package lab3.task1;

public class TestOrders {

	public static void main(String[] args) {
		Order o1 = new Order(20);
		o1.addProduct(new Phone("Xiaomi J32", 70000));
		o1.addProduct(new Pizza(1500, Flavor.HAWAIIAN));
		
		Order o2 = new Order(40);
		Order o3 = new Order(70);
		Order o4 = new Order(80);
		Order o5 = new Order(50);
		
		TruckCar t = new TruckCar("Hyundai", "348JFS");
		t.addOrder(o1);
		t.addOrder(o3);
		t.addOrder(o5);
		t.addOrder(o2);
		t.addOrder(o4);
		
		System.out.println(t);
		
		t.refuel(100);
		t.drive(60);
		
		System.out.println(t);

	}

}
