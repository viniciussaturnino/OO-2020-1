package dados;

public class Aluno {
	private String nome;
	private int matricula;
	private float media;

	public Aluno(String nome, int matricula, float media) {
		this.setNome(nome);
		this.setMatricula(matricula);
		this.setMedia(media);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public float getMedia() {
		return media;
	}

	public void setMedia(float media) {
		this.media = media;
	}

}
