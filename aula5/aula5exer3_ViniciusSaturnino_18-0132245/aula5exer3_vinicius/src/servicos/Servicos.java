package servicos;

import java.util.Vector;

import dados.Pessoa;

public class Servicos {
	public static float mediaSalariosHomens(Vector<Pessoa> habitantes) {
		float media = 0;
		int qtdHomens = 0;
		for (int i = 0; i < habitantes.size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.get(i);
			if (pessoa.getSexo() == 'M' && pessoa.getSalario() > 300) {
				media += pessoa.getSalario();
				qtdHomens++;
			}
		}
		if(qtdHomens == 0)
			return 0;
		return (media / qtdHomens);
	}

	public static int menorIdade(Vector<Pessoa> habitantes) {
		int menor = habitantes.get(0).getIdade();
		for (int i = 0; i < habitantes.size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.get(i);
			if (pessoa.getIdade() < menor)
				menor = pessoa.getIdade();
		}
		return menor;
	}

	public static float maiorSalario(Vector<Pessoa> habitantes) {
		float maior = habitantes.get(0).getSalario();
		for (int i = 0; i < habitantes.size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.get(i);
			if (pessoa.getSalario() > maior)
				maior = pessoa.getSalario();
		}
		return maior;
	}

	public static float mediaFilhos(Vector<Pessoa> habitantes) {
		float media = 0;
		for (int i = 0; i < habitantes.size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.get(i);
			media += pessoa.getNumeroFilhos();
		}
		return (media / habitantes.size());
	}

	public static float mediaSalariosGeral(Vector<Pessoa> habitantes) {
		float media = 0;
		for (int i = 0; i < habitantes.size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.get(i);
			media += pessoa.getSalario();
		}
		return (media / habitantes.size());
	}

	public static int qtdPessoasSalarioAlto(Vector<Pessoa> habitantes) {
		int qtd = 0;
		for (int i = 0; i < habitantes.size(); i++) {
			Pessoa pessoa = (Pessoa) habitantes.get(i);
			if (pessoa.getSalario() > mediaSalariosGeral(habitantes))
				qtd++;
		}
		return qtd;
	}
}
