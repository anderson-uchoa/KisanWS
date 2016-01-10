package br.com.kisan.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import br.com.kisan.controller.ClienteController;
import br.com.kisan.model.Cliente;


@Path("/cliente")
public class ClienteResource {

	@GET
	@Path("/listarTodos")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Cliente> listarTodos(){
		return new ClienteController().listarTodos();
	}
}
