package projetoExtra1.utilizador;

import java.util.ArrayList;
import java.util.List;

import projetoExtra1.Aplicacao;
import projetoExtra1.Compra;

public class Cliente extends Utilizador {

	//Atributos
	private List<Compra> compras;   //ArrayList com compras do cliente
	private List<Aplicacao> aplicacoesNaoAvaliadas; //ArrayList as aplicações do cliente
	private List<Aplicacao> aplicacoesAvaliadas; //ArrayList as aplicações do cliente
	
	
	//Construtor
	public Cliente(String aNome, int aIdade) {
		super(aNome, aIdade);
		compras = new ArrayList <Compra>();
		aplicacoesNaoAvaliadas = new ArrayList <Aplicacao>();
		aplicacoesAvaliadas = new ArrayList <Aplicacao>();
	}
	
	//Métodos
	public void comprar(Compra aCompra) {  /*adiciona compras ao ArrayList com compras do cliente e atualiza
											lista das aplicações do utilizador*/
		compras.add(aCompra);
		for (Aplicacao i: aCompra.getAplicacoes()) {
			
		
			
			
		}

			
		}
		
		
	public void avaliar(int aIdAplicacao, int aNumUtilizador) {   /* Verificar se utilizador tem aplicação
																	Verificar se utilizador já avaliou aplicação
																	Guardar avaliação
																	Guardar comentário
																	Forçar avaliação aplicação
																	Forçar avaliacao do programador*/
}

}
