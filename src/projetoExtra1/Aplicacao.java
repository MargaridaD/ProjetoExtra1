package projetoExtra1;

import java.util.ArrayList;
import java.util.List;
import projetoExtra1.utilizador.Programador;

public class Aplicacao {
	//Atributos
	private String nome;
	private double preco;
	private ArrayList<Avaliacao> avaliacoes;
	private double avaliacao;
	private int id;
	private static int counter = 0;
	private Programador programador;
	private TipoAplicacao tipo;
	private int numeroVendas;
	
	//Construtor
	public Aplicacao(String nome, double preco,
			Programador programador, TipoAplicacao tipo) {
		this.nome = nome;
		this.preco = preco;
		this.id = counter;
		counter++;
		this.programador = programador;
		this.tipo = tipo;
		avaliacoes = new ArrayList<Avaliacao>();
		numeroVendas = 0;
	}
	
	//Métodos
	
	public void criarAvaliacao(Avaliacao aAvaliacao) {
		avaliacoes.add(aAvaliacao);
	}

	public void calcularAvaliacaoMedia() {
		int sum = 0;
		double media;
		for (Avaliacao i: avaliacoes) {
			sum += i.getValor();
		}
		avaliacao = sum / avaliacoes.size();
	}
	
	//

	//Getters e Setters
	public int getId() {
		return id;
	}

	public ArrayList<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}

	public void setAvaliacoes(ArrayList<Avaliacao> avaliacoes) {
		this.avaliacoes = avaliacoes;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(double avaliacao) {
		this.avaliacao = avaliacao;
	}

	public int getNumeroVendas() {
		return numeroVendas;
	}

	public void setNumeroVendas(int numeroVendas) {
		this.numeroVendas = numeroVendas;
	}
		

}
