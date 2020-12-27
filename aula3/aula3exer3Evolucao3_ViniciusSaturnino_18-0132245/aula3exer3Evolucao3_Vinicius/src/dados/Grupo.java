package dados;

//import java.util.ArrayList;

public class Grupo {
	protected Pessoa pessoas[];

	public Grupo(final int LIMITE) {
		this.pessoas = new Pessoa[LIMITE];
	}

	public Pessoa[] getGrupo() {
		return pessoas;
	}

	public void setGrupo(Pessoa[] grupo) {
		this.pessoas = grupo;
	}

	public void inserePessoa(Pessoa pessoa, int i) {
		this.pessoas[i] = pessoa;
	}
}
