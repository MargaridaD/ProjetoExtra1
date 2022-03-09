package projetoExtra1.utilizador;

import java.util.ArrayList;
import java.util.List;

import projetoExtra1.Aplicacao;
import projetoExtra1.Avaliacao;
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
	
	//Verificar se utilizador tem aplicação
	public boolean comprouAplicacao(Aplicacao aAplicacao) {
		if(aplicacoesNaoAvaliadas.contains(aAplicacao)||aplicacoesAvaliadas.contains(aAplicacao)) {
			return true;
		}else {
			return false;	
		}
	}
	
	//Adicionar compra ao ArrayList compras e atualizar lista das aplicações do utilizador
	public void comprar(Compra aCompra) {  
		compras.add(aCompra);
		for (Aplicacao i: aCompra.getAplicacoes()) {
			if(!comprouAplicacao(i)) {
			aplicacoesNaoAvaliadas.add(i);
			}
		}	
	}
	

	//Verificar se utilizador ainda não avaliou 
	//Fazer avaliação / atualizar listas aplicacoesNaoAvaliadas e aplicacoesAvaliadas do cliente / adicionar avaliacao à lista avaliacoes da aplicacao
	public boolean avaliouAplicacao(Aplicacao aAplicacao) {
		if(aplicacoesAvaliadas.contains(aAplicacao)) {
			return true;
		}else {
			return false;	
		}
	}

	public void avaliar(Aplicacao aAplicacao, int aValor, String aComentario) { 
			Avaliacao avaliacao = new Avaliacao(3,2,5);
			aplicacoesNaoAvaliadas.remove(aAplicacao);
			aplicacoesAvaliadas.add(aAplicacao);
			aAplicacao.getAvaliacoes().add(avaliacao);
	}
	
}
