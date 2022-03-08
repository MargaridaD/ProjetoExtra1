package projetoExtra1.utilizador;

import java.util.ArrayList;
import java.util.List;

import projetoExtra1.Aplicacao;
import projetoExtra1.Compra;

public class Programador extends Utilizador{
	
	//Atributos
	private ArrayList<Aplicacao> aplicacoesProgramador;
	private double avaliacao;
	
	
	//Construtor
	public Programador(String aNome, int aIdade) {
		super(aNome, aIdade);
		aplicacoesProgramador = new ArrayList<Aplicacao>();
	}
	
	//Métodos
	public void criarAplicacao(Aplicacao aAplicacao) { 
		aplicacoesProgramador.add(aAplicacao);
		
	}
	
	public void calcularAvaliacaoMedia() {
		
	}
	
	

}
