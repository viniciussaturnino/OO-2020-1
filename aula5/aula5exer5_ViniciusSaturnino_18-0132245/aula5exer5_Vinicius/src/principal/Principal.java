package principal;

import java.util.Vector;

import dados.Aluno;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		Vector<Aluno> alunos = new Vector<Aluno>();
		do {
			Aluno aluno = new Aluno(Validacao.validaNome(), Validacao.validaMatricula(alunos), Validacao.validaMedia());
			alunos.add(aluno);
		} while (Validacao.validaContinua());
		Saida.mostraDados(alunos);
	}
}
