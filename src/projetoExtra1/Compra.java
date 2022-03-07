package projetoExtra1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import projetoExtra1.utilizador.Cliente;


public class Compra {
	
	//Atributos
	private LocalDate data= LocalDate.now();
	private double preco;
	private Cliente cliente;
	private List<Aplicacao> aplicacoes;
	 
		
	//Construtor
	public Compra() {
		aplicacoes = new ArrayList <Aplicacao>();
	}
	
	
	//Getters e Setters
	
	public List<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}


	
	
	
	

}
