package cl.edutecno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import cl.edutecno.service.PetService;

@Controller
public class FrontController {
	
	@Autowired
	private PetService petService;
	
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.addObject("pet", petService.findAll());
		modelAndView.setViewName("index");
		return modelAndView;
	}
	

}
