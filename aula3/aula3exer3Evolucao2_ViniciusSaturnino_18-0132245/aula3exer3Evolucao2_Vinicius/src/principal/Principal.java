package principal;

public class Principal {

	public static void main(String[] args) {
		// Declarações
		final int LIMITE = 50;
		int i = 0;
		Pessoa pessoa;
		char operacao;
		Grupo grupo = new Grupo(LIMITE);

		// Instruções
		do {
			pessoa = new Pessoa(Leitura.getNome(), Leitura.getIdade(), Leitura.getAltura());
			grupo.inserirPessoa(pessoa, i);

			Servicos.limpaTela(15);
			operacao = Validacao.validaContinua();
			i++;
		} while (operacao == 'S');

		Servicos.limpaTela(30);
		Servicos.mostraDados(grupo, i);

	}

}
