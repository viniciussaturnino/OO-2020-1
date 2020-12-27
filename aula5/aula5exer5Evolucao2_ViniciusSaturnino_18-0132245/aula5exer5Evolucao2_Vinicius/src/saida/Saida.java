package saida;

import java.text.DecimalFormat;

import dados.Aluno;
import dados.Turma;
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

	public static void mostraDados(Turma turma) {
		DecimalFormat mascara = new DecimalFormat("0.00");
		limpaTela(35);
		centralizaDados(15);
		System.out.println("MATRICULA\t\t\t|\tNOME\t\t\t\t|\tMEDIA");
		centralizaDados(15);
		for (int i = 0; i < 120; i++)
			System.out.print("-");
		limpaTela(1);
		for (int i = 0; i < turma.getTurma().size(); i++) {
			Aluno aluno = turma.getTurma(i);
			centralizaDados(15);
			System.out.println(aluno.toString());
		}
		centralizaDados(15);
		for (int i = 0; i < 120; i++)
			System.out.print("-");
		limpaTela(1);
		centralizaDados(15);
		System.out.print("MEDIA ARITMETICA\t|");
		centralizaDados(6);
		System.out.println("|\t" + mascara.format(Servicos.calculaMedia(turma)));
		limpaTela(15);
	}
}
