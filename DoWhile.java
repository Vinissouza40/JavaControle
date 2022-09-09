package controle;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		String texto = "por favor";
		
		do {
			System.out.println("Voce Precisa falar as palavras magicas");
			
			System.out.println("Quer Sair?");
			texto = teclado.nextLine();
			
		}while(!texto.equalsIgnoreCase("por favor"));
		
		System.out.println("Obrigado!!");
		teclado.close();
	}

}
