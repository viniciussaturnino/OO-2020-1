package dados;

import java.text.DecimalFormat;

public class Elefante extends Mamifero {
	private Float peso;
	private String descricaoHabitat;

	public Elefante(Integer idadeAmamentacao, Integer idadeVida, String descricaoEspecie, Float tamanhoAdulto,
			Float peso, String descricaoHabitat) {
		super(idadeAmamentacao, idadeVida, descricaoEspecie, tamanhoAdulto);
		this.setPeso(peso);
		this.setDescricaoHabitat(descricaoHabitat);
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String getDescricaoHabitat() {
		return descricaoHabitat;
	}

	public void setDescricaoHabitat(String descricaoHabitat) {
		this.descricaoHabitat = descricaoHabitat;
	}

	public String toString() {
		DecimalFormat mascara = new DecimalFormat("0.00");
		return (super.toString() + mascara.format(this.getPeso()) + "kg\t\t\t|\t" + this.getDescricaoHabitat());
	}
}
