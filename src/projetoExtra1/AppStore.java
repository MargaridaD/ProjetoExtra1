package projetoExtra1;

import java.util.ArrayList;
import java.util.List;
import projetoExtra1.utilizador.Cliente;
import projetoExtra1.utilizador.Programador;


public class AppStore {
	
	
	//Atributos
	private int id;
	private static int counter = 0;
	private List<Programador> programadores;
	private List<Aplicacao> aplicacoes;
	private List<Cliente> clientes;
	private List<Compra> compras;
	
	//Construtor	
	public AppStore() {
		id = counter;
		programadores = new ArrayList <Programador>();
		clientes = new ArrayList <Cliente>();
		compras = new ArrayList <Compra>();
		counter++;
	}
	
	//Metodos

	private void criarProgramador() {
		
	}
	
	private void criarCliente() {
		
	}
	
	private void criarCompra() {
		
	}
}
