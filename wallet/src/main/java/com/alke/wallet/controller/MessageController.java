package com.alke.wallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {
	
	@GetMapping("/mensaje")
	public String mostrarMensaje(Model model) {
		model.addAttribute("mensaje", "¡Hola mundo desde spring boot jsp!");
		return "message";
	}
}	
