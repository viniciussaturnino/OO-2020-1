package dados;

import java.util.Vector;

public class Galeria {
	private Vector<Quadro> quadros;
	private Vector<Pintor> pintores;

	public Galeria() {
		this.quadros = new Vector<Quadro>();
		this.pintores = new Vector<Pintor>();
	}

	public Vector<Quadro> getQuadros() {
		return this.quadros;
	}

	public Quadro getQuadro(int i) {
		return this.quadros.get(i);
	}

	public void setQuadro(Quadro quadro) {
		this.quadros.add(quadro);
	}

	public Vector<Pintor> getPintores() {
		return pintores;
	}

	public Pintor getPintores(int i) {
		return this.pintores.get(i);
	}

	public void setPintores(Pintor pintor) {
		this.pintores.add(pintor);
	}

	public boolean buscaPintor(Vector<Pintor> pintores, int idPintor) {
		int i = 0;
		if (pintores.size() == 0)
			return false;
		while (i < pintores.size()) {
			if (pintores.get(i).getIdPintor() == idPintor)
				return true;
			i++;
		}
		return false;
	}
}
