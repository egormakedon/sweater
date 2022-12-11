package by.makedon.sweater.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Yahor Makedon
 */
@Controller
public class MainController {
	@GetMapping
	public String main(Model model) {
		return "main";
	}
}
