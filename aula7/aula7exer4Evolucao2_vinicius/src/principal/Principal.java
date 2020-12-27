package principal;

import dados.*;
import saida.Saida;
import servicos.Servicos;
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
				Servicos.cadastraFuncionarioRegular(empresa.getFuncionarios());
				break;
			case 2:
				Servicos.cadastraPrestadorServicos(empresa.getFuncionarios());
				break;
			case 3:
				Servicos.cadastraGerenteEquipe(empresa.getFuncionarios());
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
}
