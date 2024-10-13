package lab2.task1.c;

import java.util.HashSet;

public class TestGuitar {

	public static void main(String[] args) {; 
		Guitar g1 = new Guitar("Yamaha", 2021, "E2", "C5", 7);
		Guitar g2 = new Guitar("Yamaha", 2021, 7);

		g2.setRange("e2", "c5");

		System.out.println(g1.equals(g2));
		
		HashSet<Guitar> guitarSet = new HashSet<>();
		
		guitarSet.add(g1);
		guitarSet.add(g2);
		
		System.out.println(guitarSet.size());
	}

}
