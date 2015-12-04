package controllers;

import static spark.Spark.*;

import java.util.HashMap;

import spark.template.freemarker.FreeMarkerEngine;

public class ContactsController {
	
	private ContactRepository contactRepository = new ContactRepository();

	public ContactsController(FreeMarkerEngine freeMarkerEngine) {
		
		get("/contacts/create", (req, res) -> {
			return modelAndView(null, "contact_form.ftl");
		}, freeMarkerEngine);
		
		post("/contacts/create", (req, res) -> {
			
			String name = req.queryParams("name");
			String email = req.queryParams("email");
			String message = req.queryParams("message");
			
			Contact contact = contactRepository.save(new Contact(name, email, message));
			
			res.redirect("/contacts/thankyou/"+contact.getId(), 301);
			return "";
		});
		
		get("/contacts/thankyou/:id", (req, res) -> {
			String paramId = req.params("id");
			int id=Integer.parseInt(paramId);
			Contact contact = contactRepository.findById(id);
			HashMap<String, Contact> model = new HashMap<String, Contact>();  
			model.put("contact", contact);
			return modelAndView(model, "thank_you.ftl");
		}, freeMarkerEngine);
	}

}
