package dados;

import java.util.Vector;

public class Pintor {
	private String nome;
	private Integer idPintor;
	private Integer anoNascimento;

	public Pintor(String nome, Integer idPintor, Integer anoNascimento) {
		this.setNome(nome);
		this.setIdPintor(idPintor);
		this.setAnoNascimento(anoNascimento);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdPintor() {
		return idPintor;
	}

	public void setIdPintor(Integer idPintor) {
		this.idPintor = idPintor;
	}

	public Integer getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

	public boolean buscaId(Vector<Pintor> pintores, int id) {
		int i = 0;
		while (i < pintores.size()) {
			if (pintores.get(i).getIdPintor() == id)
				return true;
		}
		return false;
	}

}
