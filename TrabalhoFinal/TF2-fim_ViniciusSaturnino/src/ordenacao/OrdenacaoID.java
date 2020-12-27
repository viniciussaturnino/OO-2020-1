package ordenacao;

import java.util.Comparator;

import dados.Pessoa;

public class OrdenacaoID implements Comparator<Pessoa> {
	public int compare(Pessoa p1, Pessoa p2) {
		return (p1.getCodigo().compareTo(p2.getCodigo()));
	}
}
