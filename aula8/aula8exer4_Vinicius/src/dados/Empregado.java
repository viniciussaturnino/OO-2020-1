package dados;

import java.text.DecimalFormat;

public class Empregado {
	private Integer matricula;
	private StringBuilder nome;
	private Float salario;

	public Empregado(Integer matricula, StringBuilder nome, Float salario) {
		this.setMatricula(matricula);
		this.setNome(nome);
		this.setSalario(salario);
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}

	public StringBuilder getNome() {
		return nome;
	}

	public void setNome(StringBuilder nome) {
		this.nome = nome;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public String toString() {
		DecimalFormat mascara = new DecimalFormat("0.00");
		String formato = "%-40s%-30s%-30s\n";
		return String.format(formato, this.getMatricula(), this.getNome(), "R$ " + mascara.format(this.getSalario()));
	}
}
