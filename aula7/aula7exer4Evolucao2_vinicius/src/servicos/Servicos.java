package servicos;

import java.util.ArrayList;

import dados.FuncionarioRegular;
import dados.GerenteEquipe;
import dados.PrestadorServicos;
//import leitura.Leitura;
import saida.Saida;
import validacao.Validacao;

public class Servicos {
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
