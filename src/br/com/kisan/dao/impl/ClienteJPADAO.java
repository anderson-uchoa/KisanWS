package br.com.kisan.dao.impl;

import java.util.List;

import br.com.kisan.dao.ClienteRepositoriy;
import br.com.kisan.model.Cliente;

public class ClienteJPADAO extends GenericJPADAO<Cliente> implements ClienteRepositoriy {
	
	private static ClienteJPADAO instance;
	
	
	public static ClienteJPADAO getInstance() {
		if (instance == null) {
			instance = new ClienteJPADAO();
		}
		return instance;
	}
	
	public ClienteJPADAO() {
		super();
		this.persistentClass = Cliente.class;
	}
	
	
	@Override
	public List<Cliente> listarTodos() {
		beginTransaction();
		try {
			return find();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		return null;
	}

}
