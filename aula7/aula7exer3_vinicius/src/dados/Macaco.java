package dados;

public class Macaco extends Mamifero {
	private String porte;

	public Macaco(Integer idadeAmamentacao, Integer idadeVida, String descricaoEspecie, Float tamanhoAdulto,
			String porte) {
		super(idadeAmamentacao, idadeVida, descricaoEspecie, tamanhoAdulto);
		this.setPorte(porte);
	}

	public String getPorte() {
		return porte;
	}

	public void setPorte(String porte) {
		this.porte = porte;
	}

	public String toString() {
		return (super.toString() + this.getPorte());
	}
}
