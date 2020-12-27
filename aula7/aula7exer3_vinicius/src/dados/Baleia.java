package dados;

import java.text.DecimalFormat;

public class Baleia extends Mamifero {
	private Float peso;

	public Baleia(Integer idadeAmamentacao, Integer idadeVida, String descricaoEspecie, Float tamanhoAdulto,
			Float peso) {
		super(idadeAmamentacao, idadeVida, descricaoEspecie, tamanhoAdulto);
		this.setPeso(peso);
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public String toString() {
		DecimalFormat mascara = new DecimalFormat("0.00");
		return (super.toString() + mascara.format(this.getPeso()) + "kg");
	}
}
