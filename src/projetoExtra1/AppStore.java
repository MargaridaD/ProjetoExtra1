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
		for (Aplicacao i: aCompra.getAplicacoes()) {					//Atualizar o n�mero de unidadesVendidas de cada aplica��o
			i.setUnidadesVendidas(i.getUnidadesVendidas()+1);
		}
	}
	
	//Avaliar

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
	
	//Sair da aplica��o.

	
}
