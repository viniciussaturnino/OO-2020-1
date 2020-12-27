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

}
