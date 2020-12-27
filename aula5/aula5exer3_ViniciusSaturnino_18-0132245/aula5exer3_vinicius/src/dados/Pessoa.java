package dados;

public class Pessoa {
	private float salario;
	private int idade;
	private char sexo;
	private int numeroFilhos;

	public Pessoa(float salario, int idade, char sexo, int numeroFilhos) {
		this.setSalario(salario);
		this.setIdade(idade);
		this.setSexo(sexo);
		this.setNumeroFilhos(numeroFilhos);
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public int getNumeroFilhos() {
		return numeroFilhos;
	}

	public void setNumeroFilhos(int numeroFilhos) {
		this.numeroFilhos = numeroFilhos;
	}
}
