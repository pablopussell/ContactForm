package controllers;

import java.util.ArrayList;

public class ContactRepository {
	
	private static int lastGeneratedId = 0;
	
	private ArrayList<Contact> contacts= new ArrayList<>();

	public Contact save(Contact contact) {
		int newGeneratedId = lastGeneratedId++;
		contact.setId(newGeneratedId);
		contacts.add(contact);
		return contact;
	}
	
	public Contact findById(int id) {
		
		for (Contact contact : contacts) {
			if (contact.getId()==id) 
				return contact;
		}
		return null;
		
	}

}
