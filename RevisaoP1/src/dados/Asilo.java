package dados;

import java.util.Vector;

public class Asilo {
	private StringBuilder nome;
	private Vector<Doacao> doacoes;

	public Asilo() {
		doacoes = new Vector<Doacao>();
	}

	public StringBuilder getNome() {
		return nome;
	}

	public void setNome(StringBuilder nome) {
		this.nome = nome;
	}

	public Vector<Doacao> getDoacoes() {
		return doacoes;
	}

	public int getDoacao(String busca) {
		int posicao = 0;
		for (int aux = 0; aux < doacoes.size(); aux++) {
			Doacao doacao = doacoes.get(aux);
			if (!doacao.getNomeItem().equals(busca))
				return -1;
			else
				posicao = aux;
		}
		return posicao;
	}

	public void setDoacao(Doacao doacao) {
		this.doacoes.add(doacao);
	}

}
