package principal;

import dados.Aluno;
import dados.Turma;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		Turma turma = new Turma();
		do {
			Aluno aluno = new Aluno(Validacao.validaNome(), Validacao.validaMatricula(turma), Validacao.validaMedia());
			turma.setTurma(aluno);
		} while (Validacao.validaContinua());
		Saida.mostraDados(turma);
	}
}
