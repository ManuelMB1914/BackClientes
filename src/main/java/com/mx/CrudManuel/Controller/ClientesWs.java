package com.mx.CrudManuel.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.mx.CrudManuel.Dominio.Clientes;
import com.mx.CrudManuel.Servicio.ClientesServicios;

@RestController
@RequestMapping("ClientesWs")
@CrossOrigin
public class ClientesWs {
	
	@Autowired
	ClientesServicios clientesServ;
	
	@GetMapping("listar")
	public List<Clientes> listar() {
		var lista = clientesServ.listar();
		System.out.println("Listar-->" + lista);
		return lista;
	}
	
	@PostMapping("guardar")
	public void guardar(@RequestBody Clientes clientes) {
		clientesServ.guardar(clientes);
	}
	// http://localhost:7500/ConsolaWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Clientes clientes) {
		clientesServ.eliminar(clientes);
	}
	// http://localhost:7500/ConsolaWs//buscar
	@PostMapping("buscar")
	public Clientes buscar(@RequestBody Clientes clientes) {
		return clientesServ.buscar(clientes);
	}
	// http://localhost:7500/ConsolaWs//editar
	@PostMapping("editar")
	public void editar(@RequestBody Clientes clientes) {
		clientesServ.editar(clientes);
	}

}
