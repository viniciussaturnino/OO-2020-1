package interfaces;

import java.util.ArrayList;

import dados.Cidade;

public interface Pesquisas {
	void mostraContaminados(ArrayList<Cidade> cidades, int maximo);
}
