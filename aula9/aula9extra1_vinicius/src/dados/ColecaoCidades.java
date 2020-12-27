package dados;

import java.util.ArrayList;

import saida.Saida;
import validacao.Validacao;

public class ColecaoCidades {
	private ArrayList<Cidade> cidades;

	public ColecaoCidades() {
		cidades = new ArrayList<Cidade>();
	}

	public ArrayList<Cidade> getCidades() {
		return cidades;
	}

	public Cidade getCidade(int index) {
		return cidades.get(index);
	}

	public void setCidade(Cidade cidade) {
		this.cidades.add(cidade);
	}

	public boolean equals(Cidade cidade, int maximo) {
		if (cidade.getQuantidadeContaminados().equals(maximo))
			return true;
		return false;
	}

	public void mostraContaminados(ArrayList<Cidade> cidades, int maximo) {
		int aux = 0;
		Saida.limpaTela(50);
		String formato = "%-30s%-20s%-30s%-30s\n";
		System.out.println("\t===================== RESULTADO DA PESQUISA =====================");
		Saida.limpaTela(1);
		System.out.format(formato, "NOME", "UF", "QUANTIDADE DE CONTAMINADOS", "QUANTIDADE DE MORTOS");
		System.out.println(
				"----------------------------------------------------------------------------------------------------------");
		for (Cidade cidade : cidades) {
			if (Validacao.encontraCidade(cidade, maximo)) {
				aux++;
				System.out.println(cidade);
			}
		}
		if (aux == 0) {
			Saida.limpaTela(50);
			System.out.println("NAO EXISTEM CIDADES CADASTRADAS COM ESSA QUANTIDADE DE CONTAMINADOS");
		}
	}

}
