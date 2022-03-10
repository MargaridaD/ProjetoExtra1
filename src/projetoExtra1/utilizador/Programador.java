package projetoExtra1.utilizador;

import java.util.ArrayList;

import projetoExtra1.Aplicacao;
import projetoExtra1.Compra;

public class Programador extends Utilizador{
	
	//Atributos
	private ArrayList<Aplicacao> aplicacoes;
	
	//Construtor
	public Programador(String aNome, int aIdade) {
		super(aNome, aIdade);
		aplicacoes = new ArrayList<Aplicacao>();
	}
	
	//Métodos
	public void adicionarAplicacao(Aplicacao aAplicacao) { 
		aplicacoes.add(aAplicacao);
		
	}
	
	public double calcularAvaliacaoMedia() {
		int sum = 0;
		for(Aplicacao i: aplicacoes) {
			sum += i.calcularAvaliacaoMedia();
		}
			return sum / aplicacoes.size();	
	}
	
	//Imprimir o valor total que o programador recebeu do conjunto das suas apps.
	public void imprimirValorVendasApps() {
		double valorTotal = 0;
		for(Aplicacao i: aplicacoes) {
			valorTotal += i.getPreco()*i.getUnidadesVendidas();
		}
		System.out.println("\nProgramador " + nome + ": " + valorTotal + "€.");
	}

	 //Getters e Setters
}
