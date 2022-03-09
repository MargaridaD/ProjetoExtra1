package projetoExtra1;

import java.util.Arrays;

import projetoExtra1.utilizador.Cliente;
import projetoExtra1.utilizador.Programador;

public class Main {
	
	public static void main(String[] args) {
	/*
	Menu
	1 - Novo Programador
	2 - Nova aplicação
	3 - Novo Cliente
	4 - Comprar
	5 - Avaliar
	*/
	
	//Instanciar AppStore
	AppStore appStore1 = new AppStore();
		
	//Instanciar Programadores e acrescentar à lista da AppStore
	Programador programador1 = new Programador("João", 30);
	Programador programador2 = new Programador("Ricardo", 55);
	
	appStore1.criarProgramador(programador1);
	appStore1.criarProgramador(programador2);

	
	//Instanciar Aplicações e acrescentar às listas da AppStore e do programador
	Aplicacao aplicacao1 = new Aplicacao ("aaa", 20, programador1, TipoAplicacao.GAMES);
	Aplicacao aplicacao2 = new Aplicacao ("bbb", 5.6, programador1, TipoAplicacao.BUSINESS);
	
	appStore1.criarAplicacao(aplicacao1);
	appStore1.criarAplicacao(aplicacao2);
	programador1.criarAplicacao(aplicacao1);
	programador1.criarAplicacao(aplicacao2);
	
	//Instanciar Clientes e acrescentar à lista da AppStore
	Cliente cliente1 = new Cliente("Joana",18);
	Cliente cliente2 = new Cliente("Pedro",47);
	
	appStore1.criarCliente(cliente1);
	appStore1.criarCliente(cliente2);
	
	//Instanciar 1º cesto de compras
	Cesto cesto1 = new Cesto();
	
	//Encher cesto
	cesto1.adicionarAplicacao(aplicacao1);
	cesto1.adicionarAplicacao(aplicacao2);
	
	//Gerar compra / adicionar compra a lista compras do cliente e aplicações compradas a lista aplicoes do cliente
	cliente2.comprar(cesto1);
	
//System.out.println("Cliente: " + compra1.getCliente().getNome() + "\nCesto: " + "\nValor: " + compra1.getPreco() +"\nData: " + compra1.getData());
	
	//Avaliar Aplicacao
	System.out.println(cliente2.getNome() +" comprou aplicação " + aplicacao2.getNome() +": " + cliente2.comprouAplicacao(aplicacao2));
	System.out.println(cliente2.getNome() +" avaliou aplicação " + aplicacao2.getNome() +": " + cliente2.avaliouAplicacao(aplicacao2));	
	
	cliente2.avaliar(aplicacao2, 3, "Razoável!");
	
	//Obter avaliação de aplicação
	aplicacao2.calcularAvaliacaoMedia();
	System.out.println("Avaliação da aplicação " + aplicacao2.getNome() + ": " + aplicacao2.getAvaliacao());
	
	//Obter avaliação de programador
	
	System.out.println(cliente2.toString());
	
	System.out.println(appStore1.listarUtilizadores());

	}	

	
}
