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
		//Instanciar Programadores e acrescentar � lista da AppStore
		Programador programador1 = new Programador("A",20);
		Programador programador2 = new Programador("B",30);
		Programador programador3 = new Programador("C",40);
		adicionarProgramador(programador1);
		adicionarProgramador(programador2);
		adicionarProgramador(programador3);

		
		//Instanciar Aplica��es e acrescentar �s listas da AppStore e do programador
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
		
		//Instanciar Clientes e acrescentar � lista da AppStore
		Cliente cliente1 = new Cliente("D",11);
		Cliente cliente2 = new Cliente("E",21);
		Cliente cliente3 = new Cliente("F",31);
		
		adicionarCliente(cliente1);
		adicionarCliente(cliente2);
		adicionarCliente(cliente3);
	}
	//Metodos
	public void carregar() {
		//Instanciar Programadores e acrescentar � lista da AppStore
		Programador programador1 = new Programador("A",20);
		Programador programador2 = new Programador("B",30);
		Programador programador3 = new Programador("C",40);
		adicionarProgramador(programador1);
		adicionarProgramador(programador2);
		adicionarProgramador(programador3);

		
		//Instanciar Aplica��es e acrescentar �s listas da AppStore e do programador
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
		
		//Instanciar Clientes e acrescentar � lista da AppStore
		Cliente cliente1 = new Cliente("D",11);
		Cliente cliente2 = new Cliente("E",21);
		Cliente cliente3 = new Cliente("F",31);
		Cliente cliente4 = new Cliente("G",41);
		
		adicionarCliente(cliente1);
		adicionarCliente(cliente2);
		adicionarCliente(cliente3);
		adicionarCliente(cliente4);
	}
	
	
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
		compras.add(aCompra);											//Adicionar compra na lista compras da AppStore
		aCompra.getCliente().adicionarCompra(aCompra);					//Adicionar compra na lista compras do cliente
		for (Aplicacao i: aCompra.getAplicacoes()) {					//Atualizar o n�mero de unidadesVendidas de cada aplica��o
			i.setUnidadesVendidas(i.getUnidadesVendidas()+1);
		}
	}
	
	//Encontrar Programador ou Cliente ou Aplicacao  ou Compra a partir do id
	public Utilizador converterNumUtilizadorEmUtilizador(int aNumUtilizador) {
		for(Programador i: programadores) {
			if(i.getNumUtilizador() == aNumUtilizador) {
			return i;
			}
		}
		for(Cliente i: clientes) {
			if(i.getNumUtilizador() == aNumUtilizador) {
			return i;
			}
		}
		return null;
	}
	
	public Aplicacao converterIdEmAplicacao(int aId) {
		for(Aplicacao i: aplicacoes) {
			if(i.getId() == aId) {
			return i;
			}
		}
		return null;
	}
	
	public Compra converterIdEmCompra(int aId) {
		for(Compra i: compras) {
			if(i.getId() == aId) {
			return i;
			}
		}
		return null;
	}
	
	
	
  

	//Listar todos os utilizadores da App Store. Para cada utilizador � mostrado o nome, idade e n�mero de utilizador.
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
	
	//Fazer listagens seletivas das apps por categoria e por classifica��o dos utilizadores.
	public void listarAppsPorCategoria(TipoAplicacao aTipo) {
		String listaApliacacoes = "";
		for(Aplicacao i: aplicacoes)
		if(aTipo.equals(i.getTipo())) {
			listaApliacacoes += "\n" + i.getNome();
		}
	}
	
	public void listarAppsPorClassificacao(String opcao) {
		String listaApliacacoes = "";
	 	switch(opcao) {
		  case "a":
				for(Aplicacao i: aplicacoes)
				if(i.calcularAvaliacaoMedia() >= 0 && i.calcularAvaliacaoMedia() <= 1) {
					listaApliacacoes += "\n" + i.getNome();
				}
			  break;
		  case "b":
				for(Aplicacao i: aplicacoes)
				if(i.calcularAvaliacaoMedia() > 1 && i.calcularAvaliacaoMedia() <= 2) {
					listaApliacacoes += "\n" + i.getNome();
				}
			  break;
		  case "c":
				for(Aplicacao i: aplicacoes)
				if(i.calcularAvaliacaoMedia() > 2 && i.calcularAvaliacaoMedia() <= 3) {
					listaApliacacoes += "\n" + i.getNome();
				}	
			  break;
		  case "d":
				for(Aplicacao i: aplicacoes)
				if(i.calcularAvaliacaoMedia() > 3 && i.calcularAvaliacaoMedia() <= 4) {
					listaApliacacoes += "\n" + i.getNome();
				}
			  break;
		  case "e":
				for(Aplicacao i: aplicacoes)
				if(i.calcularAvaliacaoMedia() > 4  && i.calcularAvaliacaoMedia() <= 5) {
					listaApliacacoes += "\n" + i.getNome();
				}
			  break;
		}
	}
	
	//Fazer listagens ordenadas das apps por nome, por n�mero de vendas e por classifica��o dos utilizadores.

	//Listar as classifica��es e coment�rios (se houver) de uma aplica��o em concreto.
	//Listar as aplica��es de um utilizador em concreto (independentemente de ser cliente ou programador).
	//Imprimir o valor total que a App Store recebeu do conjunto dos seus utilizadores.
	public void imprimirValorVendasAppStore() {
		double valorTotal = 0;
		for(Compra i: compras) {
			valorTotal += i.getPreco();
		}
		System.out.println("\nValor total que a AppStore fez com vendas de aplica��es: " + valorTotal);
	}
	
	//Imprimir o valor total que cada programador recebeu do conjunto das suas apps.
	public void imprimirValorVendasAppStorePorProgramador() {
		System.out.println("\nValor gerado com a venda de aplica��es de cada programador: ");
		for(Programador i: programadores) {
			i.imprimirValorVendasApps();
		}
		
	}

	public ArrayList<Programador> getProgramadores() {
		return programadores;
	}

	public void setProgramadores(ArrayList<Programador> programadores) {
		this.programadores = programadores;
	}

	public ArrayList<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacoes(ArrayList<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}

	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}

	public ArrayList<Compra> getCompras() {
		return compras;
	}

	public void setCompras(ArrayList<Compra> compras) {
		this.compras = compras;
	}
	

	
}
