package projetoExtra1;

import java.util.ArrayList;
import java.util.List;
import projetoExtra1.utilizador.Programador;

public class Aplicacao {
	//Atributos
	private String nome;
	private double preco;
	private ArrayList<Avaliacao> avaliacoes;
	private int id;
	private static int counter = 0;
	private Programador programador;
	private TipoAplicacao tipo;
	private int unidadesVendidas;
	
	//Construtor
	public Aplicacao(String aNome, double aPreco,
			Programador aProgramador, TipoAplicacao aTipo) {
		nome = aNome;
		preco = aPreco;
		id = counter;
		counter++;
		programador = aProgramador;
		tipo = aTipo;
		avaliacoes = new ArrayList<Avaliacao>();
		unidadesVendidas = 0;
	}
	
	//Métodos

	
	public double calcularAvaliacaoMedia() {
		int sum = 0;

		for (Avaliacao i: avaliacoes) {
			sum += i.getValor();
		}
		return sum / avaliacoes.size();
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


	public int getUnidadesVendidas() {
		return unidadesVendidas;
	}

	public void setUnidadesVendidas(int unidadesVendidas) {
		this.unidadesVendidas = unidadesVendidas;
	}

	public Programador getProgramador() {
		return programador;
	}

	public void setProgramador(Programador programador) {
		this.programador = programador;
	}
	
		

}
