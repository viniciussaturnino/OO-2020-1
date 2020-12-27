package dados;

public class Cidade {
	private String nome;
	private String uf;
	private Integer quantidadeContaminados;
	private Integer quantidadeMortos;

	public Cidade(String nome, String uf, Integer quantidadeContaminados, Integer quantidadeMortos) {
		this.setNome(nome);
		this.setUf(uf);
		this.setQuantidadeContaminados(quantidadeContaminados);
		this.setQuantidadeMortos(quantidadeMortos);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public Integer getQuantidadeContaminados() {
		return quantidadeContaminados;
	}

	public void setQuantidadeContaminados(Integer quantidadeContaminados) {
		this.quantidadeContaminados = quantidadeContaminados;
	}

	public Integer getQuantidadeMortos() {
		return quantidadeMortos;
	}

	public void setQuantidadeMortos(Integer quantidadeMortos) {
		this.quantidadeMortos = quantidadeMortos;
	}

	public String toString() {
		String formato = "%-30s%-20s%-30s%-30s\n";
		return String.format(formato, this.getNome(), this.getUf(), this.getQuantidadeContaminados(),
				this.getQuantidadeMortos());
	}

	public boolean equals(Cidade cidade, int maximo) {
		if (cidade.getQuantidadeContaminados().equals(maximo))
			return true;
		else
			return false;
	}
}
