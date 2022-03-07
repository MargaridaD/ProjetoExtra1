package projetoExtra1.utilizador;

public abstract class Utilizador {
	
	//Atributos
	protected String nome;
	protected int idade;
	protected int numUtilizador;
	protected static int counter = 0;
	
	//Construtor
	public Utilizador (String aNome, int aIdade) {
		nome = aNome;
		idade = aIdade;
		numUtilizador = counter;
		counter++;
	}
	

}
