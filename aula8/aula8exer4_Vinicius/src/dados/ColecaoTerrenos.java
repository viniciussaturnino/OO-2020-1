package dados;

import java.util.ArrayList;

import interfaces.AnalisaDados;

public class ColecaoTerrenos implements AnalisaDados {
	private ArrayList<Terreno> terrenos;

	public ColecaoTerrenos() {
		terrenos = new ArrayList<Terreno>();
	}

	public ArrayList<Terreno> getTerrenos() {
		return terrenos;
	}

	public Terreno getTerreno(int index) {
		return terrenos.get(index);
	}

	public void setTerreno(Terreno terreno) {
		this.terrenos.add(terreno);
	}

	public Float[] maxMin() {
		Float[] maxMin = { getTerreno(0).getPreco(), getTerreno(0).getPreco() };
		if (getTerrenos().isEmpty()) {
			maxMin[0] = 0f;
			maxMin[1] = 0f;
		} else {
			for (Terreno terreno : terrenos) {
				if (terreno.getPreco() > maxMin[0])
					maxMin[0] = terreno.getPreco();
				if (terreno.getPreco() < maxMin[1])
					maxMin[1] = terreno.getPreco();
			}
		}
		return maxMin;
	}

	public Integer iguais(Integer valor) {
		int qtd = 0;
		for (Terreno terreno : getTerrenos()) {
			if (terreno.getArea().equals(valor))
				qtd++;
		}
		return qtd;
	}

	public Float somatorio(int opcao) {
		float soma = 0;
		switch (opcao) {
		case 0:
			for (Terreno terreno : terrenos)
				soma += terreno.getPreco();
			break;
		case 1:
			for (Terreno terreno : terrenos)
				soma += terreno.getArea();
		}
		return soma;
	}

	public Float media(int opcao) {
		float media = 0;
		switch (opcao) {
		case 0:
			media = somatorio(0) / terrenos.size();
			break;
		case 1:
			media = somatorio(1) / terrenos.size();
		}
		return media;
	}
}
