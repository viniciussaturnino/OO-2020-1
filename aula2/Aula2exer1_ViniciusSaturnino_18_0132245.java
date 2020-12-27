package principal;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula2exer1_ViniciusSaturnino_18_0132245 {

	public static void main(String[] args) {
		// Declarações
		final float PISO = 1000F;
		float percentual;
		float resultado;
		Scanner ler = new Scanner(System.in);
		
		// Instruções
		System.out.print("Digite o percentual a ser calculado: ");
		DecimalFormat mascara = new DecimalFormat("0.00");
		percentual = ler.nextFloat();
		resultado = (percentual / 100) * PISO;
		for (int i = 0; i < 7; i++)
			System.out.println();
		System.out.println(percentual + "% de R$" + PISO + " é igual a: R$" + mascara.format(resultado));
	}
}
