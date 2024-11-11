package lab3.task1;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassengerCar p = new PassengerCar("Suzuki", "727OSU", 2012);
		System.out.println(p);
		
		TruckCar t = new TruckCar("Gazel", "421FHS");
		
		t.refuel(200);
		
		t.addOrder(new Order(40));
		t.addOrder(new Order(20));
		t.addOrder(new Order(100));
		
		System.out.println(t.getOrders());
		
		t.drive(20, 3);
		
		System.out.println(t.getOrders());
		

	}

}
