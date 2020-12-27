package dados;

import java.text.DecimalFormat;

public class Aluno {
	private String nome;
	private Integer matricula;
	private Float media;

	public Aluno(String nome, int matricula, float media) {
		setNome(nome);
		setMatricula(matricula);
		setMedia(media);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public Float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

	public String toString() {
		DecimalFormat mascara = new DecimalFormat("0.00");
		return (this.getMatricula() + "\t\t\t\t\t|\t" + this.getNome() + "\t\t\t\t|\t"
				+ mascara.format(this.getMedia()));
	}
}
