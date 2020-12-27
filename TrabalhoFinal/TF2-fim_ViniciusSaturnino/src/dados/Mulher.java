package dados;

public class Mulher extends Pessoa {
	private String situacaoGestante;

	public Mulher(StringBuilder nome, String situacaoSaude, String situacaoGestante) {
		super(nome, situacaoSaude);
		this.setSituacaoGestante(situacaoGestante);
	}

	public Mulher(StringBuilder nome, String situacaoSaude, String situacaoGestante, Integer codigo) {
		super(nome, situacaoSaude, codigo);
		this.setSituacaoGestante(situacaoGestante);
	}

	public String getSituacaoGestante() {
		return situacaoGestante;
	}

	public void setSituacaoGestante(String situacaoGestante) {
		this.situacaoGestante = situacaoGestante;
	}

}
