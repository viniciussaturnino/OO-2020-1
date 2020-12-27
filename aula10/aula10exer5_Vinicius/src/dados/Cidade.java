package dados;

public class Cidade implements Comparable<Object> {
	private String nome;
	private Integer DDD;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getDDD() {
		return DDD;
	}

	public void setDDD(Integer DDD) {
		this.DDD = DDD;
	}

	public String toString() {
		String formato = "%-20s%-30s\n";
		return String.format(formato, this.getDDD(), this.getNome());
	}

	public int compareTo(Object objeto) {
		Cidade cidadeParametro = (Cidade) objeto;
		if (this.getDDD() > cidadeParametro.getDDD())
			return 1;
		else if (this.getDDD() < cidadeParametro.getDDD())
			return -1;
		else
			return 0;
	}

	public boolean equals(Object obj) {
		Cidade cidade = (Cidade) obj;
		if (cidade.nome.equals(this.getNome()) || cidade.DDD.equals(this.getDDD()))
			return true;
		return false;
	}
}