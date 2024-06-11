package java.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class prueba {

	@GetMapping("/")
	public String home() {
		return "index";
	}
}
