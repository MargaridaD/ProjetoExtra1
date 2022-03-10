package projetoExtra1;

import java.util.ArrayList;
import java.util.List;
import projetoExtra1.utilizador.Cliente;
import projetoExtra1.utilizador.Programador;
import projetoExtra1.utilizador.Utilizador;


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
		carregar();
		
	}
	
	private void carregar() {
		//Instanciar Programadores e acrescentar à lista da AppStore
		Programador programador1 = new Programador("A",20);
		Programador programador2 = new Programador("B",30);
		Programador programador3 = new Programador("C",40);
		adicionarProgramador(programador1);
		adicionarProgramador(programador2);
		adicionarProgramador(programador3);

		
		//Instanciar Aplicações e acrescentar às listas da AppStore e do programador
		Aplicacao aplicacao1 = new Aplicacao("A1", 5, programador1, TipoAplicacao.GAMES);
		Aplicacao aplicacao2 = new Aplicacao("A2", 10, programador1, TipoAplicacao.BUSINESS);
		Aplicacao aplicacao3 = new Aplicacao("A3", 15, programador1, TipoAplicacao.GAMES);
		Aplicacao aplicacao4 = new Aplicacao("A4", 20, programador1, TipoAplicacao.EDUCATION);
		Aplicacao aplicacao5 = new Aplicacao("B1", 7, programador2, TipoAplicacao.GAMES);
		Aplicacao aplicacao6 = new Aplicacao("B2", 17, programador2, TipoAplicacao.EDUCATION);
		Aplicacao aplicacao7 = new Aplicacao("B3", 27, programador2, TipoAplicacao.GAMES);
		Aplicacao aplicacao8 = new Aplicacao("C1", 4, programador3, TipoAplicacao.GAMES);
		Aplicacao aplicacao9 = new Aplicacao("C2", 8, programador3, TipoAplicacao.GAMES);
		Aplicacao aplicacao10 = new Aplicacao("C3", 12, programador3, TipoAplicacao.TRAVEL);
		Aplicacao aplicacao11 = new Aplicacao("C4", 16, programador3, TipoAplicacao.TRAVEL);
		Aplicacao aplicacao12 = new Aplicacao("C5", 20, programador3, TipoAplicacao.EDUCATION);

		adicionarAplicacao(aplicacao1);
		adicionarAplicacao(aplicacao2);
		adicionarAplicacao(aplicacao3);
		adicionarAplicacao(aplicacao4);
		adicionarAplicacao(aplicacao5);
		adicionarAplicacao(aplicacao6);
		adicionarAplicacao(aplicacao7);
		adicionarAplicacao(aplicacao8);
		adicionarAplicacao(aplicacao9);
		adicionarAplicacao(aplicacao10);
		adicionarAplicacao(aplicacao11);
		adicionarAplicacao(aplicacao12);
		
		//Instanciar Clientes e acrescentar à lista da AppStore
		Cliente cliente1 = new Cliente("D",11);
		Cliente cliente2 = new Cliente("E",21);
		Cliente cliente3 = new Cliente("F",31);
		
		adicionarCliente(cliente1);
		adicionarCliente(cliente2);
		adicionarCliente(cliente3);
	}
	//Metodos
	public void adicionarProgramador(Programador aProgramador) {
		programadores.add(aProgramador);
	}
	
	public void adicionarAplicacao(Aplicacao aAplicacao) {
		aplicacoes.add(aAplicacao);
		aAplicacao.getProgramador().adicionarAplicacao(aAplicacao);
	}
	
	public void adicionarCliente(Cliente aCliente) {
		clientes.add(aCliente);
	}
	
	public void adicionarCompra(Compra aCompra) {
		compras.add(aCompra);
		aCompra.getCliente().adicionarCompra(aCompra);					//Adicionar compra na lista compras do cliente
		for (Aplicacao i: aCompra.getAplicacoes()) {					//Atualizar o número de unidadesVendidas de cada aplicação
			i.setUnidadesVendidas(i.getUnidadesVendidas()+1);
		}
	}
	
	//Avaliar

	//Listar todos os utilizadores da App Store. Para cada utilizador é mostrado o nome, idade e número de utilizador.
	public String listarUtilizadores() {
		String listaUtilizadores = "";
		for(Utilizador i: clientes) {
			listaUtilizadores+=i.toString()+"\n";
		}
		for(Utilizador i: programadores) {
			listaUtilizadores+=i.toString()+"\n";
		}
		return listaUtilizadores;
	}
	
	//Fazer listagens seletivas das apps por categoria e por classificação dos utilizadores.
	
	
	//Fazer listagens ordenadas das apps por nome, por número de vendas e por classificação dos utilizadores.
	//Listar as classificações e comentários (se houver) de uma aplicação em concreto.
	//Listar as aplicações de um utilizador em concreto (independentemente de ser cliente ou programador).
	//Imprimir o valor total que a App Store recebeu do conjunto dos seus utilizadores.
	public void imprimirValorVendasAppStore() {
		double valorTotal = 0;
		for(Compra i: compras) {
			valorTotal += i.getPreco();
		}
		System.out.println("\nValor total que a AppStore fez com vendas de aplicações: " + valorTotal);
	}
	
	//Imprimir o valor total que cada programador recebeu do conjunto das suas apps.
	public void imprimirValorVendasAppStorePorProgramador() {
		System.out.println("\nValor gerado com a venda de aplicações de cada programador: ");
		for(Programador i: programadores) {
			i.imprimirValorVendasApps();
		}
		
	}
		//Sair da aplicação.

	public ArrayList<Programador> getProgramadores() {
		return programadores;
	}



	public ArrayList<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}


	public ArrayList<Cliente> getClientes() {
		return clientes;
	}



	public ArrayList<Compra> getCompras() {
		return compras;
	}


	

	
}
