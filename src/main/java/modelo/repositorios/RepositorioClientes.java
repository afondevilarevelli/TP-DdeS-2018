package modelo.repositorios;

import java.util.List;

import modelo.Cliente;

public class RepositorioClientes {
	
	private static RepositorioClientes instancia;
	public static List<Cliente> clientes;
	
	public static RepositorioClientes getInstancia() {
		if (instancia == null) {
			instancia = new RepositorioClientes();
		}
		return instancia;
		
	}

	public static List<Cliente> getClientes() {
		return clientes;
	}

	public static void addCliente(Cliente cliente) {
		RepositorioClientes.clientes.add(cliente);
	}


	
	
}