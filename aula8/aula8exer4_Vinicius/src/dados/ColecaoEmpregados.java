package dados;

import java.util.ArrayList;

import interfaces.AnalisaDados;

public class ColecaoEmpregados implements AnalisaDados {
	private ArrayList<Empregado> empregados;

	public ColecaoEmpregados() {
		empregados = new ArrayList<Empregado>();
	}

	public ArrayList<Empregado> getEmpregados() {
		return empregados;
	}

	public Empregado getEmpregado(int index) {
		return empregados.get(index);
	}

	public void setEmpregado(Empregado empregado) {
		this.empregados.add(empregado);
	}

	public Float[] maxMin() {
		Float[] maxMin = { getEmpregado(0).getSalario(), getEmpregado(0).getSalario() };
		if (getEmpregados().isEmpty()) {
			maxMin[0] = 0f;
			maxMin[1] = 0f;
		} else {
			for (Empregado empregado : empregados) {
				if (empregado.getSalario() > maxMin[0])
					maxMin[0] = empregado.getSalario();
				if (empregado.getSalario() < maxMin[1])
					maxMin[1] = empregado.getSalario();
			}
		}
		return maxMin;
	}

	public Integer iguais(Integer valor) {
		int qtd = 0;
		for (Empregado empregado : getEmpregados()) {
			if (empregado.getMatricula() != valor)
				qtd++;
			else
				return qtd;
		}
		return qtd;
	}

	public Float somatorio(int opcao) {
		float soma = 0;
		for (Empregado empregado : empregados)
			soma += empregado.getSalario();
		return soma;
	}

	public Float media(int opcao) {
		float media = 0;
		media = somatorio(0) / empregados.size();
		return media;
	}

}
