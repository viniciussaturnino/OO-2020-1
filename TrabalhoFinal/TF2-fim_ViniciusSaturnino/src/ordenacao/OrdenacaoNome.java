package ordenacao;

import java.util.Comparator;

import dados.Pessoa;

public class OrdenacaoNome implements Comparator<Pessoa> {
	public int compare(Pessoa p1, Pessoa p2) {
		return (p1.getNome().compareTo(p2.getNome()));
	}
}
