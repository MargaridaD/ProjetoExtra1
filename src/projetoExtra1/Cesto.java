package projetoExtra1;

import java.time.LocalDate;
import java.util.ArrayList;

import projetoExtra1.utilizador.Cliente;

public class Cesto {
	private double preco;
	private ArrayList<Aplicacao> aplicacoes;
	
	//Construtor
	public Cesto() {
		preco = 0;
		aplicacoes = new ArrayList <Aplicacao>();
	}	

	//Metodos
	public void adicionarAplicacao(Aplicacao aAplicacao) {
		aplicacoes.add(aAplicacao);
		preco += aAplicacao.getPreco();
	}

	//Getters e Setters
	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public ArrayList<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}

	public void setAplicacoes(ArrayList<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}
	

	

}
