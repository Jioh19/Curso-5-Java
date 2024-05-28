package com.alke.wallet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.alke.wallet.model.Cuenta;

@Controller
public class CuentaController {
	
	@GetMapping("/cuenta/{accion}")
	public String cuenta(@PathVariable("accion") String accion, Model model) {
		
		Cuenta cuenta = new Cuenta();
		cuenta.setSaldoActual(2000000);
		
		if("verSaldo".equals(accion)) {
			System.out.println(cuenta.getSaldoActual());
			model.addAttribute("saldo", cuenta.getSaldoActual());
			
		}
		return "cuenta";
	}
}
