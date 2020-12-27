package principal;

import java.util.ArrayList;

import saida.Saida;
import dados.*;
import validacao.Validacao;

public class Principal {

	public static void main(String[] args) {
		final int MAXIMO = 500;
		int aux = 0;
		int opcao;
		ArrayList<Macaco> macacos = new ArrayList<Macaco>();
		ArrayList<Elefante> elefantes = new ArrayList<Elefante>();
		ArrayList<Baleia> baleias = new ArrayList<Baleia>();
		do {
			Saida.mostraMenu();
			Saida.limpaTela(2);
			opcao = Validacao.validaOpcao();
			Saida.limpaTela(30);
			switch (opcao) {
			case 1:
				Macaco macaco = new Macaco(Validacao.validaIdadeAmamentacao(), Validacao.validaIdadeVida(),
						Validacao.validaDescricaoEspecie(), Validacao.validaTamanhoAdulto(), Validacao.validaPorte());
				macacos.add(macaco);
				break;
			case 2:
				Elefante elefante = new Elefante(Validacao.validaIdadeAmamentacao(), Validacao.validaIdadeVida(),
						Validacao.validaDescricaoEspecie(), Validacao.validaTamanhoAdulto(), Validacao.validaPeso(),
						Validacao.validaDescricaoHabitat());
				elefantes.add(elefante);
				break;
			case 3:
				Baleia baleia = new Baleia(Validacao.validaIdadeAmamentacao(), Validacao.validaIdadeVida(),
						Validacao.validaDescricaoEspecie(), Validacao.validaTamanhoAdulto(), Validacao.validaPeso());
				baleias.add(baleia);
				break;
			}
			aux++;
		} while (opcao != 0 && aux < MAXIMO);
		Saida.limpaTela(30);
		Saida.mostraDados(macacos, elefantes, baleias);
	}

}
