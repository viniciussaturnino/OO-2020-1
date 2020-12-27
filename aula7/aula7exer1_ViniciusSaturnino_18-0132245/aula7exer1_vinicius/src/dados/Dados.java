package dados;

public class Dados {
	private Integer ano;
	private String evento;
	private String presidente;

	public Dados(Integer ano, String evento, String presidente) {
		setAno(ano);
		setEvento(evento);
		setPresidente(presidente);
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getEvento() {
		return evento;
	}

	public void setEvento(String evento) {
		this.evento = evento;
	}

	public String getPresidente() {
		return presidente;
	}

	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	public String toString() {
		return (this.getAno() + "\t\t\t|\t" + this.getEvento() + "\t\t\t\t\t|\t" + this.getPresidente());
	}

}
