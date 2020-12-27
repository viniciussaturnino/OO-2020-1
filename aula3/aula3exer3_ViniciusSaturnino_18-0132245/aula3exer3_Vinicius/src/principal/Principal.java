package principal;

public class Principal {

	public static void main(String[] args) {
		// Declarações
		Pessoa pessoa;
		char operacao;

		// Instruções
		do {
			pessoa = new Pessoa(Leitura.getNome(), Leitura.getIdade(), Leitura.getAltura());

			Servicos.limpaTela(30);
			Servicos.mostraDados(pessoa);
			operacao = Validacao.validaContinua();
		} while (operacao == 'S');

	}

}
