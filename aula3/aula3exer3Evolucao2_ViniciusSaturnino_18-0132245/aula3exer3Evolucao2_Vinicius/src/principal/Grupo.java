package principal;

public class Grupo {
	protected Pessoa pessoa[];

	public Grupo(final int LIMITE) {
		this.pessoa = new Pessoa[LIMITE];
	}

	public Pessoa[] getGrupo() {
		return pessoa;
	}

	public void setGrupo(Pessoa[] grupo) {
		this.pessoa = grupo;
	}

	public void inserirPessoa(Pessoa pessoa, int i) {
		this.pessoa[i] = pessoa;
	}
}
