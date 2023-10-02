package com.mx.CrudManuel.Servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.CrudManuel.Dao.ClientesDao;
import com.mx.CrudManuel.Dominio.Clientes;

@Service
public class ClientesServImp implements ClientesServicios{
	
	@Autowired
	ClientesDao clientesDao;

	@Override
	public void guardar(Clientes clientes) {
		clientesDao.save(clientes);
		
	}

	@Override
	public void editar(Clientes clientes) {
		clientesDao.save(clientes);
		
	}

	@Override
	public void eliminar(Clientes clientes) {
		clientesDao.delete(clientes);
		
	}

	@Override
	public Clientes buscar(Clientes clientes) {
		return clientesDao.findById(clientes.getIdCliente()).orElse(null);
	}

	@Override
	public List<Clientes> listar() {
		return (List<Clientes>) clientesDao.findAll();
	}
}
