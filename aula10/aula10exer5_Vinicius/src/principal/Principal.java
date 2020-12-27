package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;

import dados.*;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		List<Cidade> listaCidades = new ArrayList<Cidade>();
		int resposta = -1;
		do {
			try {
				resposta = Validacao.validaOpcao();
				if (resposta == 0)
					cadastraCidade(listaCidades);
			} catch (NullPointerException exc) {
				resposta = JOptionPane.showConfirmDialog(null, "Deseja voltar ao menu?", "Pergunta",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			}
		} while (resposta == 0 || resposta != -1);
		Collections.sort(listaCidades);
		Saida.mostraDados(listaCidades);
	}

	private static void cadastraCidade(List<Cidade> listaCidades) {
		Cidade cidade = new Cidade();
		String nome;
		int ddd;
		do {
			nome = Validacao.validaNome();
			ddd = Validacao.validaDDD();
		} while (!Validacao.validaCidade(listaCidades, nome, ddd));
		cidade.setNome(nome);
		cidade.setDDD(ddd);
		listaCidades.add(cidade);
	}
}
