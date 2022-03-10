package projetoExtra1;

import java.util.Scanner;

public class Menu {
	static Scanner in = new Scanner(System.in);

	 public static void menuPrincipal() {										
	 	System.out.println("\n-- Menu --");
	 	System.out.println("1 - Novo programador");
	 	System.out.println("2 - Novo cliente");
	 	System.out.println("3 - Nova aplicação");
	 	System.out.println("4 - Venda");
	 	System.out.println("5 - Avaliar");
	 	System.out.println("6 - Imprimir Informação");	
	 	System.out.println("7 - Sair");
		
	 	int opcao = in.nextInt();
		
	 	switch(opcao) {
		  case 1:
			  menuNovoProgramador();
			  break;
		  case 2:
		    // code block
			  break;
		  case 3:
			    // code block	
			  break;
		  case 4:
			    // code block
			  break;
		  case 5:
			    // code block
			  break;
		  case 6:
			  menuImprimirInformacao();
			  break;
		  case 7:
				    // code block
			  break;
		  default:
		 		System.out.println("\nIntroduza um valor entre 1 e 7");
		}
	 }
	 	
	 public static void menuNovoProgramador() {	
	 		System.out.println("1 - Novo programador");
	 }
	 
	 public static void menuImprimirInformacao() {	
	 		System.out.println("1 - Novo programador");
	 }
	
	 
}

