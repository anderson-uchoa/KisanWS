package br.com.kisan.controller;


import java.util.List;

import br.com.kisan.dao.impl.ClienteJPADAO;
import br.com.kisan.model.Cliente;


public class ClienteController {
	
	public List<Cliente> listarTodos(){
		System.out.println("Enviando para o GIT");
		return ClienteJPADAO.getInstance().listarTodos();
	}
	
}
