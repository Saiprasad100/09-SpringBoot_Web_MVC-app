package in.sai.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MsgController {
	
	@GetMapping("/question")
	public ModelAndView getWelcomeMsg() {
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("msg","Hii...What is your name ?");
		mav.setViewName("message");
		
		return mav;
		
	}
	
	@GetMapping("/hii")
	public ModelAndView getHiMsg() {
		ModelAndView mav= new ModelAndView();
		
		mav.addObject("grt","Namste.... ");
		mav.setViewName("greet");
		
		
		return mav;
	}
	
	
	

}
