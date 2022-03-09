package projetoExtra1;

import java.time.LocalDate;
import java.util.ArrayList;

import projetoExtra1.utilizador.Cliente;



public class Compra {
	
	//Atributos
	private LocalDate data;
	private double preco;
	private Cliente cliente;
	private ArrayList<Aplicacao> aplicacoes;
	 
		
	//Construtor
	public Compra(Cliente aCliente, Cesto aCesto) {
		data = LocalDate.now();
		preco = aCesto.getPreco();
		cliente = aCliente;
		aplicacoes = aCesto.getAplicacoes();
	}


	
	//Getters e Setters
	
	public LocalDate getData() {
		return data;
	}


	public void setData(LocalDate data) {
		this.data = data;
	}


	public double getPreco() {
		return preco;
	}


	public void setPreco(double preco) {
		this.preco = preco;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public ArrayList<Aplicacao> getAplicacoes() {
		return aplicacoes;
	}


	public void setAplicacoes(ArrayList<Aplicacao> aplicacoes) {
		this.aplicacoes = aplicacoes;
	}	



}
