package principal;

public class Validacao {
	public static boolean validaNome(String nome) {
		if (nome.length() < 3) {
			System.out.println("Nome inválido (deverá ter mais do que 3 caracteres).");
			return false;
		} else
			return true;
	}

	public static boolean validaIdade(int idade) {
		if (idade < 0 || idade > 151) {
			System.out.println("Idade inválida (digite uma idade entre 0 e 151 anos).");
			return false;
		} else
			return true;
	}

	public static boolean validaAltura(float altura) {
		if (altura < 0.4 || altura > 2.6) {
			System.out.println("Altura inválida (digite uma altura entre 0,4m e 2,6m).");
			return false;
		} else
			return true;
	}

	public static char validaContinua() {
		char operacao;
		do {
			operacao = Leitura.getValidacao();
			if (operacao != 'S' && operacao != 'N')
				System.out.println("Operação invalida, tente novamente!");
		} while (operacao != 'S' && operacao != 'N');
		if (operacao == 'S')
			Servicos.limpaTela(40);
		else if (operacao == 'N') {
			for (int i = 0; i < 8; i++)
				System.out.print("\t");
			System.out.println("Programa finalizado!");
		}
		return operacao;
	}
}
