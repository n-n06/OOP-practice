package defense2;

import java.util.Vector;

public class Contact {
	private int id;
	private String name;
	private String email;
	private String phoneN
	
	private static Vector<Contact> contacts; 
	
	public Contact() {
		
	}
	
	public Contact(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public Contact(int id, String name, String email) {
		this(id, name);
		this.email = email;
	}
}
