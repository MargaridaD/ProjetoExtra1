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
	public void determinarValorTotal() {
		double valorTotal = 0;
		for(Compra i: compras) {
			valorTotal += i.getPreco();
		}
		System.out.println("Valor total que a AppStore fez com vendas de aplica��es: " + valorTotal);
	}
	//Imprimir o valor total que cada programador recebeu do conjunto das suas apps.
	
	
	//Sair da aplica��o.

	
}
