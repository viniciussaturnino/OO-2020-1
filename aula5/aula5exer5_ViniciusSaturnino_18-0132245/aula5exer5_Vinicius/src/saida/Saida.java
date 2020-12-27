package saida;

import java.text.DecimalFormat;
import java.util.Vector;

import dados.Aluno;
import servicos.Servicos;

public class Saida {
	public static void limpaTela(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.println();
	}

	public static void centralizaDados(int qtd) {
		for (int i = 0; i < qtd; i++)
			System.out.print("\t");
	}

	public static void mostraDados(Vector<Aluno> alunos) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		limpaTela(35);
		centralizaDados(15);
		System.out.println("MATRICULA\t\t\t|\tNOME\t\t\t\t|\tMEDIA");
		centralizaDados(15);
		for (int i = 0; i < 120; i++)
			System.out.print("-");
		limpaTela(1);
		for (int i = 0; i < alunos.size(); i++) {
			Aluno aluno = alunos.get(i);
			centralizaDados(15);
			System.out.println(aluno.getMatricula() + "\t\t\t\t\t|\t" + aluno.getNome() + "\t\t\t\t|\t"
					+ mascara.format(aluno.getMedia()));
		}
		centralizaDados(15);
		for (int i = 0; i < 120; i++)
			System.out.print("-");
		limpaTela(1);
		centralizaDados(15);
		System.out.print("MEDIA ARITMETICA\t|");
		centralizaDados(6);
		System.out.println("|\t" + mascara.format(Servicos.calculaMedia(alunos)));
		limpaTela(15);
	}
}
