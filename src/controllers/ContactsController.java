package controllers;

import static spark.Spark.*;

import spark.template.freemarker.FreeMarkerEngine;

public class ContactsController {
	
	public ContactsController(FreeMarkerEngine freeMarkerEngine) {
		
		get("/contacts/create", (req, res) -> {
			return modelAndView(null, "contact_form.ftl");
		}, freeMarkerEngine);
		
		post("/contacts/create", (req, res) -> {
			Contact contact = new Contact();
			contact.setName(req.queryParams("name"));
			contact.setEmail(req.queryParams("email"));
			contact.setMessage(req.queryParams("message"));
			res.redirect("/contacts/thankyou", 301);
			return "";
		});
	}

}
