package dados;

import java.text.DecimalFormat;

public class Terreno {
	private StringBuilder endereco;
	private Integer area;
	private Float preco;

	public Terreno(StringBuilder endereco, Integer area, Float preco) {
		this.setEndereco(endereco);
		this.setArea(area);
		this.setPreco(preco);
	}

	public StringBuilder getEndereco() {
		return endereco;
	}

	public void setEndereco(StringBuilder endereco) {
		this.endereco = endereco;
	}

	public Integer getArea() {
		return area;
	}

	public void setArea(Integer area) {
		this.area = area;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String toString() {
		DecimalFormat mascara = new DecimalFormat("0.00");
		String formato = "%-40s%-30s%-30s\n";
		return String.format(formato, this.getEndereco(), this.getArea() + "m²",
				"R$ " + mascara.format(this.getPreco()));
	}

}
