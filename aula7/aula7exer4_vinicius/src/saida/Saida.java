package saida;

import java.text.DecimalFormat;
import java.util.ArrayList;

import dados.FuncionarioRegular;
import dados.GerenteEquipe;
import dados.PrestadorServicos;

public class Saida {

	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

	public static void menuCadastro() {
		System.out.println("Escolha uma opcao:");
		System.out.println("------------------------------------------------------");
		System.out.println("(1) - Cadastrar Funcionario Regular");
		System.out.println("(2) - Cadastrar Prestador de Servicos");
		System.out.println("(3) - Cadastrar Gerente de Equipe");
		System.out.println("(0) - Finalizar Cadastro");
		limpaTela(2);
		System.out.print("OPCAO: ");
	}

	public static void menuPrincipal() {
		System.out.println("Escolha uma opcao:");
		System.out.println("------------------------------------------------------");
		System.out.println("(1) - Mostrar total de funcionarios cadastrados");
		System.out.println("(2) - Mostrar total a ser pago para cada categoria");
		System.out.println("(0) - Encerrar Programa");
		limpaTela(2);
		System.out.print("OPCAO: ");
	}

	public static void mostraTabela(ArrayList<FuncionarioRegular> funcionarios) {
		String formato = "%-20s%-20s%-30s%-20s%-20s\n";
		System.out.format(formato, "NOME", "CPF", "DATA DE NASCIMENTO", "HORAS TRABALHADAS", "PROJETOS");
		System.out.println(
				"------------------------------------------------------------------------------------------------------------");
		for (FuncionarioRegular funcionario : funcionarios)
			System.out.println(funcionario);
	}

	public static void mostraDados(ArrayList<FuncionarioRegular> empresa, int opcao) {
		limpaTela(30);
		switch (opcao) {
		case 1:
			totalFuncionarios(empresa);
			break;
		case 2:
			totalSalarios(empresa);
			break;
		}
	}

	private static void totalFuncionarios(ArrayList<FuncionarioRegular> empresa) {
		int contaReg = 0, contaPrest = 0, contaGerente = 0;
		for (FuncionarioRegular funcionario : empresa) {
			if (funcionario instanceof FuncionarioRegular && !(funcionario instanceof PrestadorServicos)
					&& !(funcionario instanceof GerenteEquipe))
				contaReg++;
			if (funcionario instanceof PrestadorServicos)
				contaPrest++;
			if (funcionario instanceof GerenteEquipe)
				contaGerente++;
		}
		System.out.println("Total de funcionarios regulares: " + contaReg);
		System.out.println("Total de prestadores de servicos: " + contaPrest);
		System.out.println("Total de gerentes de equipes: " + contaGerente);
		limpaTela(3);
		System.out.println("Total de funcionarios no geral: " + empresa.size());
	}

	private static void totalSalarios(ArrayList<FuncionarioRegular> empresa) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		float contaReg = 0, contaPrest = 0, contaGerente = 0;
		for (FuncionarioRegular funcionario : empresa) {
			if (funcionario instanceof FuncionarioRegular && !(funcionario instanceof PrestadorServicos)
					&& !(funcionario instanceof GerenteEquipe))
				contaReg += funcionario.getSalario();
			if (funcionario instanceof PrestadorServicos)
				contaPrest += funcionario.getSalario();
			if (funcionario instanceof GerenteEquipe)
				contaGerente += funcionario.getSalario();
		}
		System.out.println("Total dos salarios de funcionarios regulares: R$ " + mascara.format(contaReg));
		System.out.println("Total dos salarios de prestadores de servicos: R$ " + mascara.format(contaPrest));
		System.out.println("Total dos salarios de gerentes de equipes: R$ " + mascara.format(contaGerente));
		limpaTela(3);
		System.out
				.println("Total de salarios entre todos os funcionarios: R$ " + mascara.format(somaSalarios(empresa)));
	}

	private static float somaSalarios(ArrayList<FuncionarioRegular> empresa) {
		float total = 0;
		for (FuncionarioRegular funcionario : empresa)
			total += funcionario.calculaSalario();
		return total;
	}

	public static void finalizaPrograma() {
		limpaTela(30);
		System.out.println("---------- PROGRAMA FINALIZADO ----------");
	}

	public static void sucessoCadastro() {
		limpaTela(30);
		System.out.println("---------- CADASTRO FEITO COM SUCESSO ----------");
		limpaTela(5);
	}
}
