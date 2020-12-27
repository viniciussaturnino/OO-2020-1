package dados;

import java.util.Vector;

public class Quadro {
	private Integer idQuadro;
	private Integer idPintor;
	private Float preco;
	private Integer ano;

	public Quadro(Integer idQuadro, Integer idPintor, Float preco, Integer ano) {
		this.setIdQuadro(idQuadro);
		this.setIdPintor(idPintor);
		this.setPreco(preco);
		this.setAno(ano);
	}

	public Integer getIdQuadro() {
		return idQuadro;
	}

	public void setIdQuadro(Integer idQuadro) {
		this.idQuadro = idQuadro;
	}

	public Integer getIdPintor() {
		return idPintor;
	}

	public void setIdPintor(Integer idPintor) {
		this.idPintor = idPintor;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public boolean buscaId(Vector<Quadro> quadros, int id) {
		int i = 0;
		while (i < quadros.size()) {
			if (quadros.get(i).getIdQuadro() == id)
				return true;
		}
		return false;
	}

}
