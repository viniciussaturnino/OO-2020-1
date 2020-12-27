package saida;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import dados.ColecaoEmpregados;
import dados.ColecaoTerrenos;
import dados.Empregado;
import dados.Terreno;
import leitura.Leitura;
import validacao.Validacao;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

	public static int menu(String mensagem, String[] botoes) {
		int opcao = -1;
		boolean erro = false;
		do {
			try {
				erro = false;
				int resposta = Leitura.getBotao(mensagem, botoes);
				if (resposta == -1)
					JOptionPane.showMessageDialog(null, "Escolha uma das opçoes", " ", JOptionPane.ERROR_MESSAGE);
				opcao = resposta;
			} catch (ArrayIndexOutOfBoundsException ex) {
				JOptionPane.showMessageDialog(null, "Escolha uma das opçoes", " ", JOptionPane.ERROR_MESSAGE);
				erro = true;
			}
		} while (erro || opcao == -1);
		return opcao;
	}

	public static int menuPrincipal() {
		String[] botoes = { "Menu empregados", "Menu Terrenos", "Encerrar Programa" };
		int opcao = -1;
		opcao = menu("Selecione a opcao desejada.", botoes);
		return opcao;
	}

	public static int menuEmpregado() {
		String[] botoes = { "Cadastrar empregado", "Verificar maior/menor salario", "Pesquisa existencia de empregado",
				"Soma de salarios", "Media dos salarios", "Voltar" };
		int opcao = -1;
		opcao = menu("Selecione a opcao desejada.", botoes);
		return opcao;
	}

	public static int menuTerreno() {
		String[] botoes = { "Cadastrar terreno", "Verificar maior/menor terreno", "Pesquisa existencia de terreno",
				"Soma de areas", "Media entre dados dos terrenos", "Voltar" };
		int opcao = -1;
		opcao = menu("Selecione a opcao desejada.", botoes);
		return opcao;
	}

	public static void maxMinEmpregado(ColecaoEmpregados empregados) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		Float maxMinSalarios[] = empregados.maxMin();
		limpaTela(50);
		System.out.println("Maior salario entre os empregados: R$ " + mascara.format(maxMinSalarios[0]));
		System.out.println("Menor salario entre os empregados: R$ " + mascara.format(maxMinSalarios[1]));
	}

	public static void pesquisaEmpregado(ColecaoEmpregados empregados) {
		int index = empregados
				.iguais(Validacao.leInt("Pesquisa de Empregado", "Digite a matricula do empregado", 100000000, 0));
		limpaTela(50);
		if (index == empregados.getEmpregados().size())
			System.out.println("Empregado nao encontrado.");
		else
			System.out.println("Empregado encontrado\n" + empregados.getEmpregado(index));
	}

	public static void somaSalarios(ColecaoEmpregados empregados) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		limpaTela(50);
		System.out.println(
				"A soma dos salarios de todos os empregados cadastrados e: " + mascara.format(empregados.somatorio(0)));
	}

	public static void mediaSalarios(ColecaoEmpregados empregados) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		limpaTela(50);
		System.out.println(
				"A media de salarios entre os empregados cadastrados e: " + mascara.format(empregados.media(0)));
	}

	public static void maxMinTerreno(ColecaoTerrenos terrenos) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		Float maxMinAreas[] = terrenos.maxMin();
		limpaTela(50);
		System.out.println("Maior areas entre os terrenos cadastrados: " + mascara.format(maxMinAreas[0]) + "m²");
		System.out.println("Menor areas entre os terrenos cadastrados: " + mascara.format(maxMinAreas[1]) + "m²");
	}

	public static void pesquisaTerreno(ColecaoTerrenos terrenos) {
		int pesquisa = -1;
		pesquisa = Validacao.leInt("Pesquisa de Area de Terreno", "Digite a area de terreno que deseja" + " pesquisar",
				100000000, 0);
		int qtd = terrenos.iguais(pesquisa);
		limpaTela(50);
		System.out.println("Existem " + qtd + " terreno(s) cadastrado(s) com " + pesquisa + "m²");
	}

	public static void somaTerreno(ColecaoTerrenos terrenos) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		String[] botoes = { "Preco", "Area" };
		int opcao = menu("Selecione o dado que deseja calcular a soma", botoes);
		limpaTela(50);
		if (opcao == 0)
			System.out.println("A soma dos precos entre os terrenos cadastrados e: R$ "
					+ mascara.format(terrenos.somatorio(opcao)));
		else
			System.out.println("A soma das areas entre os terrenos cadastrados e: "
					+ mascara.format(terrenos.somatorio(opcao)) + "m²");
	}

	public static void mediaTerreno(ColecaoTerrenos terrenos) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		String[] botoes = { "Preco", "Area" };
		int opcao = menu("Selecione o dado que deseja calcular a media", botoes);
		limpaTela(50);
		if (opcao == 0)
			System.out.println(
					"A media dos precos entre os terrenos cadastrados e: R$ " + mascara.format(terrenos.media(opcao)));
		else
			System.out.println("A media das areas entre os terrenos cadastrados e: "
					+ mascara.format(terrenos.media(opcao)) + "m²");
	}

	public static void mostraDados(ColecaoEmpregados empregados, ColecaoTerrenos terrenos) {
		String formato = "%-40s%-30s%-30s\n";
		System.out.println("\t===================== Empregados Cadastrados =====================");
		limpaTela(1);
		System.out.format(formato, "MATRICULA", "NOME", "SALARIO");
		System.out.println("-------------------------------------------------------------------------------");
		for (Empregado empregado : empregados.getEmpregados())
			System.out.println(empregado);
		limpaTela(5);
		System.out.println("\t===================== Terrenos Cadastrados =====================");
		limpaTela(1);
		System.out.format(formato, "ENDERECO", "AREA (m²)", "PRECO (R$)");
		System.out.println("---------------------------------------------------------------------------------");
		for (Terreno terreno : terrenos.getTerrenos())
			System.out.println(terreno);
	}
}
