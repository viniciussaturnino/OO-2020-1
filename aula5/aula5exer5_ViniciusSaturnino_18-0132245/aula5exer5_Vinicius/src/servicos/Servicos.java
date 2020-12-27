package servicos;

import java.util.Vector;

import dados.Aluno;

public class Servicos {
	public static float calculaMedia(Vector<Aluno> alunos) {
		float media = 0;
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			media += aluno.getMedia();
		}
		return media / alunos.size();
	}

	public static boolean buscaAluno(int matricula, Vector<Aluno> alunos) {
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			if (matricula == aluno.getMatricula())
				return true;
		}
		return false;
	}
}
