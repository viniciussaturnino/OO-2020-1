package servicos;

import dados.Habitantes;
import dados.Pessoa;

public class Servicos {
	public static float mediaSalariosHomens(Habitantes habitantes) {
		float media = 0;
		int qtdHomens = 0;
		for (int i = 0; i < habitantes.getHabitantes().size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.getHabitantes(i);
			if (pessoa.getSexo() == 'M' && pessoa.getSalario() > 300) {
				media += pessoa.getSalario();
				qtdHomens++;
			}
		}
		if (qtdHomens == 0)
			return 0;
		return (media / qtdHomens);
	}

	public static int menorIdade(Habitantes habitantes) {
		int menor = habitantes.getHabitantes(0).getIdade();
		for (int i = 0; i < habitantes.getHabitantes().size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.getHabitantes(i);
			if (pessoa.getIdade() < menor)
				menor = pessoa.getIdade();
		}
		return menor;
	}

	public static float maiorSalario(Habitantes habitantes) {
		float maior = habitantes.getHabitantes(0).getSalario();
		for (int i = 0; i < habitantes.getHabitantes().size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.getHabitantes(i);
			if (pessoa.getSalario() > maior)
				maior = pessoa.getSalario();
		}
		return maior;
	}

	public static float mediaFilhos(Habitantes habitantes) {
		float media = 0;
		for (int i = 0; i < habitantes.getHabitantes().size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.getHabitantes(i);
			media += pessoa.getNumeroFilhos();
		}
		return (media / habitantes.getHabitantes().size());
	}

	public static float mediaSalariosGeral(Habitantes habitantes) {
		float media = 0;
		for (int i = 0; i < habitantes.getHabitantes().size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.getHabitantes(i);
			media += pessoa.getSalario();
		}
		return (media / habitantes.getHabitantes().size());
	}

	public static int qtdPessoasSalarioAlto(Habitantes habitantes) {
		int qtd = 0;
		for (int i = 0; i < habitantes.getHabitantes().size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.getHabitantes(i);
			if (pessoa.getSalario() > mediaSalariosGeral(habitantes))
				qtd++;
		}
		return qtd;
	}
}
