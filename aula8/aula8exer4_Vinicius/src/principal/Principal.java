package principal;

import dados.*;
import saida.Saida;
import validacao.Validacao;

public class Principal {

	public static void main(String[] args) {
		ColecaoEmpregados empregados = new ColecaoEmpregados();
		ColecaoTerrenos terrenos = new ColecaoTerrenos();
		int opcao = -1;
		do {
			opcao = Saida.menuPrincipal();
			switch (opcao) {
			case 0:
				do {
					if (empregados.getEmpregados().isEmpty()) {
						cadastraEmpregado(empregados);
						opcao = -1;
					} else {
						opcao = Saida.menuEmpregado();
						switch (opcao) {
						case 0:
							cadastraEmpregado(empregados);
							break;
						case 1:
							Saida.maxMinEmpregado(empregados);
							break;
						case 2:
							Saida.pesquisaEmpregado(empregados);
							break;
						case 3:
							Saida.somaSalarios(empregados);
							break;
						case 4:
							Saida.mediaSalarios(empregados);
						}
					}
				} while (opcao != 5);
				break;
			case 1:
				do {
					if (terrenos.getTerrenos().isEmpty()) {
						cadastraTerreno(terrenos);
						opcao = -1;
					} else {
						opcao = Saida.menuTerreno();
						switch (opcao) {
						case 0:
							cadastraTerreno(terrenos);
							break;
						case 1:
							Saida.maxMinTerreno(terrenos);
							break;
						case 2:
							Saida.pesquisaTerreno(terrenos);
							break;
						case 3:
							Saida.somaTerreno(terrenos);
							break;
						case 4:
							Saida.mediaTerreno(terrenos);
						}
					}
				} while (opcao != 5);
				break;
			}
		} while (opcao != 2);
		Saida.limpaTela(50);
		Saida.mostraDados(empregados, terrenos);
	}

	// ============= METODOS DE CADASTRO =============
	private static void cadastraTerreno(ColecaoTerrenos terrenos) {
		String titulo = "Novo terreno";
		terrenos.setTerreno(new Terreno(Validacao.leString(titulo, "Endereco completo do terreno"),
				Validacao.leInt(titulo, "Area do terreno", 10000, 10),
				Validacao.leFloat(titulo, "Valor atual (em reais) do terreno", 10000000, 1000)));
	}

	private static void cadastraEmpregado(ColecaoEmpregados empregados) {
		String titulo = "Novo empregado";
		empregados.setEmpregado(
				new Empregado(Validacao.leMatricula(titulo, "Matricula do empregado", 100000, 1, empregados),
						Validacao.leString(titulo, "Nome do empregado"),
						Validacao.leFloat(titulo, "Salario (em reais) do empregado", 100000, 10)));
	}

}
