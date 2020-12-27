package dados;

import java.util.ArrayList;

public class Turma {
	private ArrayList<Aluno> turma;
	
	public Turma() {
		turma = new ArrayList<Aluno>();
	}
	
	public ArrayList<Aluno> getTurma() {
		return this.turma;
	}
	
	public Aluno getTurma(int i) {
		return turma.get(i);
	}
	
	public void setTurma(Aluno aluno) {
		this.turma.add(aluno);
	}
}
