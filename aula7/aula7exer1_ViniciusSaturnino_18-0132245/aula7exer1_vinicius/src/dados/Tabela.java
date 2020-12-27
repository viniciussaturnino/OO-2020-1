package dados;

import java.util.Vector;

public class Tabela {
	private Vector<Dados> dados;

	public Tabela() {
		dados = new Vector<Dados>();
	}

	public Vector<Dados> getDados() {
		return dados;
	}

	public Dados getDados(int i) {
		return dados.get(i);
	}

	public void setDados(Dados dados) {
		this.dados.add(dados);
	}

}
