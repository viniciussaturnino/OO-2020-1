package dados;

public class GerenteEquipe extends FuncionarioRegular {
	private Integer qtdProjetos;

	public GerenteEquipe(String nome, String cpf, StringBuilder dataNascimento, Integer qtdProjetos) {
		super(nome, cpf, dataNascimento);
		this.setQtdProjetos(qtdProjetos);
	}

	public Integer getQtdProjetos() {
		return qtdProjetos;
	}

	public void setQtdProjetos(Integer qtdProjetos) {
		this.qtdProjetos = qtdProjetos;
	}

	public float calculaSalario() {
		final float PISO = 232F;
		return (0.5f * PISO * this.qtdProjetos) + PISO;
	}

	public String toString() {
		String formato = "%-20s%-20s%-30s%-20s%-20s\n";
		return String.format(formato, this.getNome(), this.getCpf(), this.getDataNascimento(), "---",
				this.getQtdProjetos());
	}

}
