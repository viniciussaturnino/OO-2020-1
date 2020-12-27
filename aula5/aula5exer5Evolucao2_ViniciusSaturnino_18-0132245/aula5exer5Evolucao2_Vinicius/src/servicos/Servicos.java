package servicos;

import dados.Aluno;
import dados.Turma;

public class Servicos {
	public static float calculaMedia(Turma turma) {
		float media = 0;
		for (int i = 0; i < turma.getTurma().size(); i++) {
			Aluno aluno = turma.getTurma(i);
			media += aluno.getMedia();
		}
		return media / turma.getTurma().size();
	}

	public static boolean buscaAluno(int matricula, Turma turma) {
		int i = 0;
		while (i < turma.getTurma().size()) {
			Aluno aluno = turma.getTurma(i);
			if (matricula == aluno.getMatricula())
				return true;
			i++;
		}
		return false;
	}
}
