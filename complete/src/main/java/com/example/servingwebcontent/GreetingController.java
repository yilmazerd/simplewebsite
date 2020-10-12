package com.example.servingwebcontent;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.logging.Level;
import java.util.logging.Logger;

@Controller
public class GreetingController {

	private final static Logger LOGGER = Logger.getLogger(GreetingController.class.getName());
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);

		LOGGER.setLevel(Level.INFO);
		LOGGER.severe("Info Log #1");
		LOGGER.warning("Info Log #2");
		LOGGER.info("Info Log #3" );

		return "greeting";
	}

	@PostMapping("/greeting")
	public String greetingPost(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);

		LOGGER.setLevel(Level.INFO);
		LOGGER.severe("Info Log #1");
		LOGGER.warning("Info Log #2");
		LOGGER.info("Info Log #3" );

		return "greeting";
	}

}
