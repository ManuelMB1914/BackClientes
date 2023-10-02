package com.mx.CrudManuel.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.mx.CrudManuel.Dominio.Clientes;
import com.mx.CrudManuel.Servicio.ClientesServicios;

@Controller
@RequestMapping("ctrl/clientes")
public class ClientesCtrl {
	
	@Autowired
	ClientesServicios clientesServ;
	
	@GetMapping("inicio")
	public String inicio(Model model) {
		var lista = clientesServ.listar();
		model.addAttribute("listaV", lista);
		return "index";
	}
	
	@GetMapping("abrirguardar")
	public String abrirguardar(Clientes clientes) {
		 return "guardar";
	 }
	 
	@PostMapping("guardar")
	public String guardar(Clientes clientes) {
		 clientesServ.guardar(clientes);
		 return "redirect:/ctrl/consola/inicio";
	 }

}
