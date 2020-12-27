package principal;

import java.util.ArrayList;

import dados.*;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		int opcao;
		do {
			Saida.menuCadastro();
			opcao = Validacao.validaOpcao(3);
			switch (opcao) {
			case 1:
				cadastraFuncionarioRegular(empresa.getFuncionarios());
				break;
			case 2:
				cadastraPrestadorServicos(empresa.getFuncionarios());
				break;
			case 3:
				cadastraGerenteEquipe(empresa.getFuncionarios());
				break;
			}
		} while (opcao != 0);

		Saida.limpaTela(30);
		Saida.mostraTabela(empresa.getFuncionarios());

		do {
			Saida.limpaTela(5);
			Saida.menuPrincipal();
			opcao = Validacao.validaOpcao(2);
			Saida.mostraDados(empresa.getFuncionarios(), opcao);
		} while (opcao != 0);
		Saida.finalizaPrograma();
	}

	// ---------- METODOS DE CADASTRO ----------
	public static void cadastraFuncionarioRegular(ArrayList<FuncionarioRegular> funcionarios) {
		FuncionarioRegular funcionario = new FuncionarioRegular(Validacao.validaNome(),
				Validacao.validaCpf(funcionarios), Validacao.getData());
		funcionario.setSalario(funcionario.calculaSalario());
		funcionarios.add(funcionario);
		Saida.sucessoCadastro();
	}

	public static void cadastraPrestadorServicos(ArrayList<FuncionarioRegular> funcionarios) {
		PrestadorServicos prestador = new PrestadorServicos(Validacao.validaNome(), Validacao.validaCpf(funcionarios),
				Validacao.getData(), Validacao.validaHorasTrabalhadas());
		prestador.setSalario(prestador.calculaSalario());
		funcionarios.add(prestador);
		Saida.sucessoCadastro();
	}

	public static void cadastraGerenteEquipe(ArrayList<FuncionarioRegular> funcionarios) {
		GerenteEquipe gerente = new GerenteEquipe(Validacao.validaNome(), Validacao.validaCpf(funcionarios),
				Validacao.getData(), Validacao.validaQtdProjetos());
		gerente.setSalario(gerente.calculaSalario());
		funcionarios.add(gerente);
		Saida.sucessoCadastro();
	}
}
