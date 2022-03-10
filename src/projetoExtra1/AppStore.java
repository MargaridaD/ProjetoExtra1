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

	
}
