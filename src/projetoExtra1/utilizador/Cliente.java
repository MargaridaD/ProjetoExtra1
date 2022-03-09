package projetoExtra1.utilizador;

import java.util.ArrayList;
import java.util.List;

import projetoExtra1.Aplicacao;
import projetoExtra1.Avaliacao;
import projetoExtra1.Cesto;
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
	
	//Gerar compra / adicionar compra ao ArrayList compras do cliente / atualizar lista das aplicações do cliente / atualizar número de vendas de cada aplicação / atualizar ArrayList vendas da appStore
	public void comprar(Cesto aCesto) {
		Compra compra = new Compra(this, aCesto);
		compras.add(compra);
		for (Aplicacao i: compra.getAplicacoes()) {
			if(!comprouAplicacao(i)) {
			aplicacoesNaoAvaliadas.add(i);
			}
		}
		for (Aplicacao i: compra.getAplicacoes()) {
			int numeroVendas = i.getNumeroVendas();
			numeroVendas += 1;
			i.setNumeroVendas(numeroVendas);
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
			Avaliacao avaliacao = new Avaliacao(this,aAplicacao,aValor);
			aplicacoesNaoAvaliadas.remove(aAplicacao);
			aplicacoesAvaliadas.add(aAplicacao);
			aAplicacao.getAvaliacoes().add(avaliacao);
	}
	//Getters e Setters
	
}
