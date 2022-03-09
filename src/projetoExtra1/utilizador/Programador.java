package projetoExtra1.utilizador;

import java.util.ArrayList;

import projetoExtra1.Aplicacao;

public class Programador extends Utilizador{
	
	//Atributos
	private ArrayList<Aplicacao> aplicacoes;
	private double avaliacao;

	
	//Construtor
	public Programador(String aNome, int aIdade) {
		super(aNome, aIdade);
		aplicacoes = new ArrayList<Aplicacao>();
	}
	
	//Métodos
	public void criarAplicacao(Aplicacao aAplicacao) { 
		aplicacoes.add(aAplicacao);
		
	}
	
	public void calcularAvaliacaoMedia() {
		int sum = 0;
		for(Aplicacao i: aplicacoes) {
			sum += i.getAvaliacao();
		}
			avaliacao = sum / aplicacoes.size();	
	}
	 //Getters e Setters
}
