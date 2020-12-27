package principal;

import dados.Habitantes;
import dados.Pessoa;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	private static final int MAXIMO = 1000;

	public static void main(String[] args) {
		Habitantes habitantes = new Habitantes();
		int i = 0;
		do {
			Pessoa habitante = new Pessoa(Validacao.validaSalario(), Validacao.validaIdade(), Validacao.validaSexo(),
					Validacao.validaFilhos());
			habitantes.setHabitantes(habitante);
			i++;
		} while (Validacao.validaContinua() && i <= MAXIMO);
		Saida.mostraDados(habitantes);
	}
}
