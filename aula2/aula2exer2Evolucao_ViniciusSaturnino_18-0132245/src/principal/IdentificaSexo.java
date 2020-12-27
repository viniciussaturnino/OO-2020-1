package principal;

import java.util.Scanner;

public class IdentificaSexo {

	public static void main(String[] args) {
		// Declarações
		char sexo;
		Scanner ler = new Scanner(System.in);

		// Instruções
		do {
			System.out.print("Digite o sexo: ");
			sexo = ler.next().toUpperCase().charAt(0);
			if (sexo != 'M' && sexo != 'F')
				System.out.println("Sexo inválido.\n");
		} while (sexo != 'M' && sexo != 'F');
		for (int i = 0; i < 3; i++)
			System.out.println();
		for (int i = 0; i < 8; i++)
			System.out.print("\t");
		System.out.println((sexo == 'M') ? "MASCULINO" : "FEMININO");
	}

}