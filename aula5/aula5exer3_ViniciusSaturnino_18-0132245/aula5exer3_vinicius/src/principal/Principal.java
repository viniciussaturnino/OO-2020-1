package principal;

import java.util.Vector;

import dados.Pessoa;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	// Declaracoes
	private static final int MAXIMO = 1000;

	// Instrucoes
	public static void main(String[] args) {
		Vector<Pessoa> habitantes = new Vector<Pessoa>();
		int i = 0;
		do {
			Pessoa habitante = new Pessoa(Validacao.validaSalario(), Validacao.validaIdade(), Validacao.validaSexo(),
					Validacao.validaFilhos());
			habitantes.add(habitante);
			i++;
		} while (Validacao.validaContinua() && i <= MAXIMO);
		Saida.mostraDados(habitantes);
	}
}
