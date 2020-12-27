package validacao;

import java.util.InputMismatchException;

import leitura.Leitura;

public class Validacao {
	public static int validaQuantidadeVendas(int semana) {
		int valor = 0;
		try {
			do {
				System.out.print("Digite a quantidade de vendas da semana " + (semana + 1) + ": ");
				valor = Leitura.getInt();
				if(valor < 0)
					System.out.println("Valor inválido, tente novamente.");
			} while(valor < 0);
		} catch(InputMismatchException excecao) {
			System.out.println("Houve um erro.");
		}
		return valor;
	}
	
	public static int validaSemanas() {
		int semanas = 0;
		try {
			do {
				System.out.print("Digite a quantidade de semanas: ");
				semanas = Leitura.getInt();
				if(semanas < 3 || semanas > 4)
					System.out.println("Quantidade inválida, os valores possíveis são 3 ou 4 semanas");
			} while(semanas < 3 || semanas > 4);
		} catch(InputMismatchException excecao) {
			System.out.println("Houve um erro.");
		}
		return semanas;
	}
}
