package projetoExtra1;

import java.time.LocalDate;

import projetoExtra1.utilizador.Cliente;

public class Avaliacao {
	
	//Atributos
	private LocalDate data;
	private Cliente cliente;
	private Aplicacao aplicacao;
	private String comentario;
	private int valor;
	
	//Construtor
	public Avaliacao(Cliente aCliente, Aplicacao aAplicacao, int aValor) {
		cliente = aCliente;
		aplicacao = aAplicacao;
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
