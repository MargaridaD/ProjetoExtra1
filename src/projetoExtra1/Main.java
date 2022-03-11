package projetoExtra1;

import java.util.Arrays;

import projetoExtra1.utilizador.Cliente;
import projetoExtra1.utilizador.Programador;

public class Main {
	
	public static void main(String[] args) {
	
	//Instanciar AppStore
	AppStore appStore1 = new AppStore();
		

	
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
