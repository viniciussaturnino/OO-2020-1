package principal;

import dados.Empresa;
import dados.Funcionario;
import dados.Gerente;
import dados.PrestadorServicos;
import saida.Visao;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		Empresa empresa = new Empresa();
		int qtdFuncionarioRegular = 0;
		int qtdPrestadorServicos = 0;
		int qtdGerente = 0;
		float salarioFuncionarioRegular = 0;
		float salarioPrestadorServico = 0;
		float salarioGerente = 0;
		int opcaoMenu;

		do {
			opcaoMenu = Validacao.validaMenuCadastro();
			switch (opcaoMenu) {
			case '1':
				cadastraFuncionarioRegular(empresa);
				salarioFuncionarioRegular += empresa.getFuncionarios().get(empresa.getFuncionarios().size() - 1)
						.calculaSalario();
				qtdFuncionarioRegular++;
				break;
			case '2':
				cadastraPrestadorServicos(empresa);
				salarioPrestadorServico += empresa.getFuncionarios().get(empresa.getFuncionarios().size() - 1)
						.calculaSalario();
				qtdPrestadorServicos++;
				break;
			case '3':
				cadastraGerenteEquipe(empresa);
				salarioGerente += empresa.getFuncionarios().get(empresa.getFuncionarios().size() - 1).calculaSalario();
				qtdGerente++;
				break;
			case '0':
				Visao.mostraRelatorio(empresa, qtdFuncionarioRegular, qtdPrestadorServicos, qtdGerente,
						salarioFuncionarioRegular, salarioPrestadorServico, salarioGerente);
			}
		} while (opcaoMenu != '0');

		Visao.mostraTodosRegistros(empresa);
	}

	// ---------- METODOS DE CADASTRO ----------
	public static void cadastraFuncionarioRegular(Empresa empresa) {
		empresa.setFuncionarios(new Funcionario(Validacao.validaNome(), Validacao.validaDataNascimento(),
				Validacao.validaCpf(empresa)));
	}

	public static void cadastraPrestadorServicos(Empresa empresa) {
		empresa.setFuncionarios(new PrestadorServicos(Validacao.validaNome(), Validacao.validaDataNascimento(),
				Validacao.validaCpf(empresa), Validacao.validaHorasTrabalhadas()));
	}

	public static void cadastraGerenteEquipe(Empresa empresa) {
		empresa.setFuncionarios(new Gerente(Validacao.validaNome(), Validacao.validaDataNascimento(),
				Validacao.validaCpf(empresa), Validacao.validaQuantidadeProjetos()));
	}
}
