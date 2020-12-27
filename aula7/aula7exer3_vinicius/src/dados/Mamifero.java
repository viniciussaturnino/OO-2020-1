package dados;

import java.text.DecimalFormat;

public class Mamifero {
	private Integer idadeAmamentacao;
	private Integer idadeVida;
	private String descricaoEspecie;
	private Float tamanhoAdulto;

	public Mamifero(Integer idadeAmamentacao, Integer idadeVida, String descricaoEspecie, Float tamanhoAdulto) {
		this.setIdadeAmamentacao(idadeAmamentacao);
		this.setIdadeVida(idadeVida);
		this.setDescricaoEspecie(descricaoEspecie);
		this.setTamanhoAdulto(tamanhoAdulto);
	}

	public Integer getIdadeAmamentacao() {
		return idadeAmamentacao;
	}

	public void setIdadeAmamentacao(Integer idadeAmamentacao) {
		this.idadeAmamentacao = idadeAmamentacao;
	}

	public Integer getIdadeVida() {
		return idadeVida;
	}

	public void setIdadeVida(Integer idadeVida) {
		this.idadeVida = idadeVida;
	}

	public String getDescricaoEspecie() {
		return descricaoEspecie;
	}

	public void setDescricaoEspecie(String descricaoEspecie) {
		this.descricaoEspecie = descricaoEspecie;
	}

	public Float getTamanhoAdulto() {
		return tamanhoAdulto;
	}

	public void setTamanhoAdulto(Float tamanhoAdulto) {
		this.tamanhoAdulto = tamanhoAdulto;
	}

	public String toString() {
		DecimalFormat mascara = new DecimalFormat("0.00");
		return (this.getIdadeAmamentacao() + " ano(s)\t\t\t\t\t\t\t|\t" + this.getIdadeVida() + " ano(s)\t\t\t\t\t|\t"
				+ this.getDescricaoEspecie() + "\t\t\t|\t" + mascara.format(this.getTamanhoAdulto()) + "m\t\t\t|\t");
	}
}
