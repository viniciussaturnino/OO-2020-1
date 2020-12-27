package principal;

import dados.Galeria;
import dados.Pintor;
import dados.Quadro;
import saida.Saida;
import validacao.Validacao;

public class Principal {
	public static void main(String[] args) {
		Galeria galeria = new Galeria();
		int idPintor = 0;
		int idQuadro = 0;
		int opcao;
		do {
			Saida.mostraMenu();
			Saida.limpaTela(2);
			System.out.print("OPCAO: ");
			opcao = Validacao.validaOpcao();
			switch (opcao) {
			case 1:
				int idPintorDesejado = Validacao.validaIdPintor();
				if (!galeria.buscaPintor(galeria.getPintores(), idPintorDesejado)) {
					Saida.limpaTela(10);
					System.out.println("***** Impossivel cadastrar quadro, pintor nao existe. *****");
					Saida.limpaTela(5);
				} else {
					Quadro quadro = new Quadro(++idQuadro, idPintor, Validacao.validaPreco(), Validacao.validaAno());
					galeria.setQuadro(quadro);
					Saida.limpaTela(5);
				}
				break;
			case 2:
				Saida.limpaTela(30);
				Pintor pintor = new Pintor(Validacao.validaNome(), ++idPintor, Validacao.validaAno());
				galeria.setPintores(pintor);
				Saida.limpaTela(5);
				break;
			case 3:
				Saida.limpaTela(30);
				Saida.mostraQuadrosPintores(galeria.getQuadros(), galeria.getPintores(), Validacao.validaNome());
				Saida.limpaTela(15);
				break;
			case 4:
				Saida.limpaTela(30);
				Saida.mostraQuadros(galeria.getQuadros());
				Saida.limpaTela(15);
				break;
			}
		} while (opcao != 0);
		Saida.limpaTela(30);
		Saida.finalizaPrograma();
		Saida.limpaTela(15);
	}
}
