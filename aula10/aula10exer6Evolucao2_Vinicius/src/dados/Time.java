package dados;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private StringBuilder nome;
	private List<Integer> anoTitulo;

	public Time(StringBuilder nome) {
		this.nome = nome;
		anoTitulo = new ArrayList<Integer>();
	}

	public StringBuilder getNome() {
		return nome;
	}

	public void setNome(StringBuilder nome) {
		this.nome = nome;
	}

	public List<Integer> getAnosTitulo() {
		return anoTitulo;
	}

	public Integer getAnoTitulo(int index) {
		return anoTitulo.get(index);
	}

	public void setAnoTitulo(Integer anoTitulo) {
		this.anoTitulo.add(anoTitulo);
	}

	public String toString() {
		String formato = "%-30s%-20s\n";
		if (this.getAnosTitulo().isEmpty())
			return String.format(formato, this.getNome(), "AINDA NAO FOI CAMPEAO");
		else {
			String titulos = "";
			for (Integer titulo : this.getAnosTitulo()) {
				titulos += titulo + " ";
			}
			return String.format(formato, this.getNome(), titulos);
		}
	}
}
