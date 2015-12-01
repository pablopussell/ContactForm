import static spark.Spark.*;

import controllers.ContactsController;
import freemarker.template.Configuration;
import spark.template.freemarker.FreeMarkerEngine;

public class WebApp {

	public static void main(String[] args) {
		
		staticFileLocation("/resources"); 
		
		FreeMarkerEngine freeMarkerEngine = initFreeMarkerEngine();
		
		ContactsController contactsController = new ContactsController(freeMarkerEngine);

	}

	private static FreeMarkerEngine initFreeMarkerEngine() {
		FreeMarkerEngine freeMarkerEngine = new FreeMarkerEngine();
		Configuration configuration = new Configuration();
		configuration.setClassForTemplateLoading(WebApp.class, "/resources");
		freeMarkerEngine.setConfiguration(configuration);
		return freeMarkerEngine;
	}

}
