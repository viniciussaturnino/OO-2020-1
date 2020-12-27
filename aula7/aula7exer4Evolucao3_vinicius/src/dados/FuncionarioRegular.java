package dados;

public class FuncionarioRegular {
	protected String nome;
	protected String cpf;
	protected StringBuilder dataNascimento;
	protected Float salario;

	public FuncionarioRegular(String nome, String cpf, StringBuilder dataNascimento) {
		this.setNome(nome);
		this.setCpf(cpf);
		this.setDataNascimento(dataNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public StringBuilder getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(StringBuilder dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Float getSalario() {
		return salario;
	}

	public void setSalario(Float salario) {
		this.salario = salario;
	}

	public float calculaSalario() {
		final float PISO = 232F;
		return ((PISO * 0.1F) + PISO);
	}

	public String toString() {
		String formato = "%-40s%-30s%-30s%-30s%-30s\n";
		return String.format(formato, this.getNome(), this.getCpf(), this.getDataNascimento(), "---", "---");
	}
}
