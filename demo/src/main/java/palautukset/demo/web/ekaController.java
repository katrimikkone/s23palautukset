package palautukset.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ekaController {
	
	@RequestMapping("/index")
	@ResponseBody
	public String showIndex() {
		return "This is the main page";
	}
	
	@RequestMapping("/contact")
	@ResponseBody
	public String showContact() {
		return "This is the contact page";
	}
	
	@RequestMapping("/hello")
	@ResponseBody
	public String sayHello(@RequestParam(name="location", required=false) String location,
			@RequestParam(name="name")String name) {
		return "Welcome to the " + location + " " + name;
	}
	
}
