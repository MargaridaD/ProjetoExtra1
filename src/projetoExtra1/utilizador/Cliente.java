package projetoExtra1.utilizador;

import java.util.ArrayList;

import projetoExtra1.Aplicacao;
import projetoExtra1.Avaliacao;
import projetoExtra1.Cesto;
import projetoExtra1.Compra;

public class Cliente extends Utilizador {

	//Atributos
	private ArrayList<Compra> compras;   //ArrayList com compras do cliente
	private ArrayList<Aplicacao> aplicacoesNaoAvaliadas; //ArrayList as aplica��es do cliente
	private ArrayList<Aplicacao> aplicacoesAvaliadas; //ArrayList as aplica��es do cliente
	
	
	//Construtor
	public Cliente(String aNome, int aIdade) {
		super(aNome, aIdade);
		compras = new ArrayList <Compra>();
		aplicacoesNaoAvaliadas = new ArrayList <Aplicacao>();
		aplicacoesAvaliadas = new ArrayList <Aplicacao>();
	}
	
	//M�todos
	
	//Verificar se utilizador tem aplica��o
	public boolean comprouAplicacao(Aplicacao aAplicacao) {
		if(aplicacoesNaoAvaliadas.contains(aAplicacao)||aplicacoesAvaliadas.contains(aAplicacao)) {
			return true;
		}else {
			return false;	
		}
	}
	
	//Adicionar compra ao ArrayList compras do cliente / atualizar lista das aplica��es do cliente 
	public void adicionarCompra(Compra aCompra) {
		compras.add(aCompra);
		for (Aplicacao i: aCompra.getAplicacoes()) {
			if(!comprouAplicacao(i)) {
			aplicacoesNaoAvaliadas.add(i);
			}
		}
	}
		
		
	//Verificar se utilizador ainda n�o avaliou 
	//Fazer avalia��o / atualizar listas aplicacoesNaoAvaliadas e aplicacoesAvaliadas do cliente / adicionar avaliacao � lista avaliacoes da aplicacao
	public boolean avaliouAplicacao(Aplicacao aAplicacao) {
		if(aplicacoesAvaliadas.contains(aAplicacao)) {
			return true;
		}else {
			return false;	
		}
	}

	public void avaliar(Aplicacao aAplicacao, int aValor, String aComentario) {	
			Avaliacao avaliacao = new Avaliacao(this,aAplicacao,aValor);
			aplicacoesNaoAvaliadas.remove(aAplicacao);
			aplicacoesAvaliadas.add(aAplicacao);
			aAplicacao.getAvaliacoes().add(avaliacao);
	}
	

	
	//Getters e Setters
	
}
