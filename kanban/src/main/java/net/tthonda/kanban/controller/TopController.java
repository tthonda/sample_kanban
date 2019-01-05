package net.tthonda.kanban.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TopController {

	@RequestMapping("/")
	public String top(Model model) {
		model.addAttribute("msg", "Hello! Thymleaf!!");
		return "top";
	}

}
