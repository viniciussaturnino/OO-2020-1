package dados;

public class PrestadorServicos extends FuncionarioRegular {
	private Integer horasTrabalhadas;

	public PrestadorServicos(String nome, String cpf, StringBuilder dataNascimento, Integer horasTrabalhadas) {
		super(nome, cpf, dataNascimento);
		this.setHorasTrabalhadas(horasTrabalhadas);
	}

	public Integer getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(Integer horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public float calculaSalario() {
		final float PISO = 232F;
		return ((this.horasTrabalhadas * 2) + PISO);
	}

	public String toString() {
		String formato = "%-20s%-20s%-30s%-20s%-20s\n";

		return String.format(formato, this.getNome(), this.getCpf(), this.getDataNascimento(),
				this.getHorasTrabalhadas(), "---");
	}

}
