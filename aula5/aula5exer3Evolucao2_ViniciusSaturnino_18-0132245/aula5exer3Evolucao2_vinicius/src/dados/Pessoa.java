package dados;

public class Pessoa {
	private Float salario;
	private Integer idade;
	private Character sexo;
	private Integer numeroFilhos;

	public Pessoa(float salario, int idade, char sexo, int numeroFilhos) {
		setSalario(salario);
		setIdade(idade);
		setSexo(sexo);
		setNumeroFilhos(numeroFilhos);
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public Integer getNumeroFilhos() {
		return numeroFilhos;
	}

	public void setNumeroFilhos(int numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
	}
}
