package projetoExtra1;

import java.time.LocalDate;

public class Avaliacao {
	
	//Atributos
	private LocalDate data;
	private int numUtilizadorCliente;
	private int idAplicacao;
	private String comentario;
	private int valor;
	
	//Construtor
	public Avaliacao(int aNumUtilizadorCliente, int aIdAplicacao, int aValor) {
		numUtilizadorCliente = aNumUtilizadorCliente;
		idAplicacao = aIdAplicacao;
		valor = aValor;
		data = LocalDate.now();
		}
	
	//Métodos
	
	
	//Getters e Setters	
	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}
	

}
