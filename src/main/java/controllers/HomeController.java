package controllers;

import spark.ModelAndView;
import spark.Request;
import spark.Response;

public class HomeController {
	public static ModelAndView home(Request req, Response res){
		return new ModelAndView(null,"index.hbs");
	}
	
	public static ModelAndView contacto(Request req, Response res){
		return new ModelAndView(null,"contacto.hbs");
	}

}
