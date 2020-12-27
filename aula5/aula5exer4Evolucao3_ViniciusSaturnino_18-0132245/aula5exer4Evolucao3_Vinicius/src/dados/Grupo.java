package dados;

import java.util.Vector;

public class Grupo {
	private Vector<Pessoa> nomes;

	public Grupo() {
		this.nomes = new Vector<Pessoa>();
	}

	public Vector<Pessoa> getNomes() {
		return nomes;
	}

	public void setNome(Pessoa nome) {
		this.nomes.add(nome);
	}

}
