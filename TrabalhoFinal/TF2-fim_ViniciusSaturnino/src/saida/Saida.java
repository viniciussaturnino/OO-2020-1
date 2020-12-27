package saida;

import java.util.ArrayList;

import dados.Grupo;
import dados.Homem;
import dados.Mulher;
import dados.Pessoa;
import dao.PessoaDAO;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.println();
	}

	public static void centraliza(int qtd) {
		for (int aux = 0; aux < qtd; aux++)
			System.out.print(" ");
	}

	public static void mostraResultados() {
		Grupo grupo = new Grupo();
		PessoaDAO pessoaDAO = new PessoaDAO();
		int dados[] = new int[5];

		grupo.setGrupo(pessoaDAO.listar());

		dados = retornaDados(grupo.getGrupo());

		centraliza(20);
		System.out.println(String.format("%02d", dados[0]) + " = CONTAMINADOS CURADOS");
		centraliza(20);
		System.out.println(String.format("%02d", dados[1]) + " = CONTAMINADOS EM TRATAMENTO");
		centraliza(20);
		System.out.println(String.format("%02d", dados[2]) + " = CONTAMINADOS FALECIDOS");
		centraliza(20);
		System.out.println(String.format("%02d", dados[3]) + " = HOMENS SEM CONTAMINACAO");
		centraliza(20);
		System.out.println(String.format("%02d", dados[4]) + " = MULHERES SEM CONTAMINACAO");
		centraliza(20);
		System.out.println("----------------------------------");
		centraliza(20);
		System.err.println(String.format("%02d", grupo.getGrupo().size()) + " = TOTAL DE REGISTRO DE PESSOAS");
	}

	public static int[] retornaDados(ArrayList<Pessoa> grupo) {
		int[] dados = new int[5];

		for (int aux = 0; aux < dados.length; aux++)
			dados[aux] = 0;

		for (Pessoa pessoa : grupo) {
			switch (pessoa.getSituacaoSaude()) {
			case "contaminado(a) curado(a)":
				dados[0]++;
				break;
			case "contaminado(a) em tratamento":
				dados[1]++;
				break;
			case "contaminado(a) falecido(a)":
				dados[2]++;
			}
			if (pessoa.getSituacaoSaude().equals("sem contaminacao")) {
				try {
					if (((Homem) pessoa).getIdade() >= 0)
						dados[3]++;
				} catch (ClassCastException e) {
					if (((Mulher) pessoa).getSituacaoGestante() != null)
						dados[4]++;
				}
			}
		}
		return dados;
	}
}
