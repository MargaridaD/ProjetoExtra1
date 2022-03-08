package projetoExtra1;

import java.util.ArrayList;
import java.util.List;
import projetoExtra1.utilizador.Cliente;
import projetoExtra1.utilizador.Programador;


public class AppStore {
	
	
	//Atributos
	private ArrayList<Programador> programadores;
	private ArrayList<Aplicacao> aplicacoes;
	private ArrayList<Cliente> clientes;
	private ArrayList<Compra> compras;
	

	//Construtor	
	public AppStore() {
		programadores = new ArrayList<Programador>();
		aplicacoes = new ArrayList<Aplicacao>();
		clientes = new ArrayList<Cliente>();
		compras = new ArrayList<Compra>();
	}
	
	//Metodos
	public void criarProgramador(Programador aProgramador) {
		programadores.add(aProgramador);
	}
	
	public void criarAplicacao(Aplicacao aAplicacao) {
		aplicacoes.add(aAplicacao);
	}
	
	public void criarCliente(Cliente aClientes) {
		clientes.add(aClientes);
			}
	
	public  void criarCompra(Compra aCompra) {
		compras.add(aCompra);
	}
}
