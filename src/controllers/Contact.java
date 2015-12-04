package controllers;

public class Contact {
	
	private String name;
	private String email;
	private String message;
	private int id;
	
	
	public Contact(String name, String email, String message) {
		this.name = name;
		this.email = email;
		this.message = message;
	}
	
	public void setId(int newGeneratedId) {
		this.id = newGeneratedId;
		
	}

	public void setName(String name) {
		this.name = name;
		
	}
	
	public void setEmail(String email) {
		this.email = email;
		
	}
	
	public void setMessage(String message) {
		this.message = message;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	public int getId() {
		return this.id;
	}


}

