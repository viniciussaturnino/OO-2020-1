package dados;

public class Doacao {
	private String nomeItem;
	private Integer codigo;

	public Doacao(String nomeItem, Integer codigo) {
		this.setNomeItem(nomeItem);
		this.setCodigo(codigo);
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

}
