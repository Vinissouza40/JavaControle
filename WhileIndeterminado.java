package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		String valor = "";

		while(!valor.equalsIgnoreCase("Sair")){
			System.out.print("Voce Diz");
			valor = teclado.nextLine();
		}
		teclado.close();
	}
}
