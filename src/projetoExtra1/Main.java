package projetoExtra1;

import java.util.Arrays;

import projetoExtra1.utilizador.Cliente;
import projetoExtra1.utilizador.Programador;

public class Main {
	
	public static void main(String[] args) {
	
	//Instanciar AppStore
	AppStore appStore1 = new AppStore();
		
	//Instanciar Programadores e acrescentar à lista da AppStore
	Programador programador1 = new Programador("A",20);
	Programador programador2 = new Programador("B",30);
	Programador programador3 = new Programador("C",40);
	appStore1.adicionarProgramador(programador1);
	appStore1.adicionarProgramador(programador2);
	appStore1.adicionarProgramador(programador3);

	
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

	appStore1.adicionarAplicacao(aplicacao1);
	appStore1.adicionarAplicacao(aplicacao2);
	appStore1.adicionarAplicacao(aplicacao3);
	appStore1.adicionarAplicacao(aplicacao4);
	appStore1.adicionarAplicacao(aplicacao5);
	appStore1.adicionarAplicacao(aplicacao6);
	appStore1.adicionarAplicacao(aplicacao7);
	appStore1.adicionarAplicacao(aplicacao8);
	appStore1.adicionarAplicacao(aplicacao9);
	appStore1.adicionarAplicacao(aplicacao10);
	appStore1.adicionarAplicacao(aplicacao11);
	appStore1.adicionarAplicacao(aplicacao12);
	
	//Instanciar Clientes e acrescentar à lista da AppStore
	Cliente cliente1 = new Cliente("D",11);
	Cliente cliente2 = new Cliente("E",21);
	Cliente cliente3 = new Cliente("F",31);
	
	appStore1.adicionarCliente(cliente1);
	appStore1.adicionarCliente(cliente2);
	appStore1.adicionarCliente(cliente3);
	
	//Instanciar 1º cesto de compras
	Cesto cesto1 = new Cesto();
	
	//Encher cesto
	cesto1.adicionarAplicacao(aplicacao1);
	cesto1.adicionarAplicacao(aplicacao2);
	cesto1.adicionarAplicacao(aplicacao5);
	
	//Gerar compra 
	Compra compra1 = new Compra(cliente1, cesto1);
	
	// adicionar compra a lista compras da AsppStore / adicionar compra a listas compras  e aplicaçõesNaoAvaliadas do cliente / Atualizar nº de vendas de cada aplicacao
	appStore1.adicionarCompra(compra1);
	
	//Avaliar Aplicacao
	System.out.println(cliente2.getNome() +" comprou aplicação " + aplicacao2.getNome() +": " + cliente2.comprouAplicacao(aplicacao2));
	System.out.println(cliente2.getNome() +" avaliou aplicação " + aplicacao2.getNome() +": " + cliente2.avaliouAplicacao(aplicacao2));	
	
	cliente2.avaliar(aplicacao2, 3, "Razoável!");
	
	//Obter avaliação de aplicação
	System.out.println("Avaliação da aplicação " + aplicacao2.getNome() + ": " + aplicacao2.calcularAvaliacaoMedia());
	
	//Obter avaliação de programador


	System.out.println(appStore1.listarUtilizadores());
	
	appStore1.imprimirValorVendasAppStore();

	appStore1.imprimirValorVendasAppStorePorProgramador();
	
	}
	
}
