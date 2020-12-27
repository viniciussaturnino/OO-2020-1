package dados;

public class Homem extends Pessoa {
	private Integer idade;

	public Homem(StringBuilder nome, String situacaoSaude, Integer idade) {
		super(nome, situacaoSaude);
		this.setIdade(idade);
	}

	public Homem(StringBuilder nome, String situacaoSaude, Integer idade, Integer codigo) {
		super(nome, situacaoSaude, codigo);
		this.setIdade(idade);
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}
}
