package principal;

import java.util.Scanner;

public class Aula2exer3_ViniciusSaturnino_18_0132245 {

	public static void main(String[] args) {
		// Declarações
		int ddd;
		Scanner ler = new Scanner(System.in);

		// Instruções
		System.out.print("Digite o DDD: ");
		do {
			ddd = ler.nextInt();
			if (ddd <= 10 || ddd >= 100)
				System.out.print("DDD inválido. Informe novamente: ");
		} while (ddd <= 10 || ddd >= 100);
		for (int i = 0; i < 30; i++)
			System.out.println();
		if (ddd != 61 && ddd != 62 && ddd != 65 && ddd != 67)
			System.out.println("DDD não pertence a capital do centro-oeste brasileiro");
		else if (ddd == 61)
			System.out.println("DDD pertencente a Brasília!");
		else if (ddd == 62)
			System.out.println("DDD pertencente a Goiânia!");
		else if (ddd == 65)
			System.out.println("DDD pertencente a Cuiabá!");
		else if (ddd == 67)
			System.out.println("DDD pertencente a Campo Grande!");
	}

}
