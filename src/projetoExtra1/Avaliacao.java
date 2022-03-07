package projetoExtra1;

import java.time.LocalDate;

public class Avaliacao {
	
	//Atributos
	private LocalDate data= LocalDate.now();
	private int numUtilizadorCliente;
	private int idAplicacao;
	private String comentario;
	
	//Construtor
	public Avaliacao(int aNumUtilizadorCliente, int aIdAplicacao) {
		numUtilizadorCliente = aNumUtilizadorCliente;
		idAplicacao = aIdAplicacao;
		}
	
	//Métodos
	public void atualizarAvProgramador() {
		
	}
	
	public void atualizarAvAplicacao() {
		
	}
	

}
