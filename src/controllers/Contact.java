package controllers;

public class Contact {
	
	private String name;
	String email;
	String message;
	
	
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


}

