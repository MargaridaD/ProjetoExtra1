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

	
	//Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getNumUtilizador() {
		return numUtilizador;
	}

	public String toString() {
		return "Nome:" + nome + "; idade:" + idade + "; Número de Utilizador: " + numUtilizador;
	}

	 

	

}
