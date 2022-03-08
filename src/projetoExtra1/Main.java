package projetoExtra1;

import java.util.Arrays;

import projetoExtra1.utilizador.Cliente;
import projetoExtra1.utilizador.Programador;

public class Main {
	
	public static void main(String[] args) {
	/*Menu

	1 - Novo Programador
	2 - Nova aplicação
	3 - Novo Cliente
	4 - Comprar
	5 - Avaliar
	
	
	
	*/
	
	//Instanciar AppStore
	AppStore appStore1 = new AppStore();
		
	//Instanciar Programadores e acrescentar a lista da AppStore
	Programador programador1 = new Programador("João", 30);
	Programador programador2 = new Programador("Ricardo", 55);
	
	appStore1.criarProgramador(programador1);
	appStore1.criarProgramador(programador2);

	
	//Instanciar Aplicações e acrescentar a lista da AppStore e do programador
	Aplicacao aplicacao1 = new Aplicacao ("aaa", 20, programador1, TipoAplicacao.GAMES);
	Aplicacao aplicacao2 = new Aplicacao ("bbb", 5.6, programador1, TipoAplicacao.BUSINESS);
	
	appStore1.criarAplicacao(aplicacao1);
	appStore1.criarAplicacao(aplicacao2);
	programador1.criarAplicacao(aplicacao1);
	programador1.criarAplicacao(aplicacao2);
	
	//Instanciar Clientes e acrescentar a lista da AppStore
	Cliente cliente1 = new Cliente("Joana",18);
	Cliente cliente2 = new Cliente("Pedro",47);
	
	appStore1.criarCliente(cliente1);
	appStore1.criarCliente(cliente2);
	
	//Instanciar 1º cesto de compras
	Cesto cesto1 = new Cesto();
	
	//Encher cesto
	cesto1.adicionarAplicacao(aplicacao1);
	cesto1.adicionarAplicacao(aplicacao2);
	
	//Instanciar 1ª compra (Associada ao 1º Cesto)
	Compra compra1 = new Compra (cliente2, cesto1);
	
	//Associar compra a cliente
	cliente2.comprar(compra1);
	
	System.out.println("Cliente: " + compra1.getCliente() + "\nCesto: " + "\nValor: " + compra1.getPreco() +"\nData: " + compra1.getData());
	
	//Avaliar Aplicacao
	
	//Obter avaliação de aplicação
	
	//Obter avaliação de programador
	

	}	

	
}
