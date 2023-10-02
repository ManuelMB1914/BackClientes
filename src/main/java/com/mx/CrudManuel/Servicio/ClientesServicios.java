package com.mx.CrudManuel.Servicio;

import java.util.List;

import com.mx.CrudManuel.Dominio.Clientes;

public interface ClientesServicios {
	
	public void guardar(Clientes clientes);

	public void editar(Clientes clientes);

	public void eliminar(Clientes clientes);

	public Clientes buscar(Clientes clientes);

	public List<Clientes> listar();
}
