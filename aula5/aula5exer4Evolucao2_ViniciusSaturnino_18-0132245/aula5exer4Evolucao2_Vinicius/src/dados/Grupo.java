package dados;

import java.util.Vector;

public class Grupo {
	private Vector<String> nomes;

	public Grupo() {
		nomes = new Vector<String>();
	}

	public Vector<String> getNomes() {
		return nomes;
	}

	public void setNome(String nome) {
		this.nomes.add(nome);
	}

}
