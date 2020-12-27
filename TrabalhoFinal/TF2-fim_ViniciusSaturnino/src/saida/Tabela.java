package saida;

import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import dados.Homem;
import dados.Mulher;
import dados.Pessoa;

@SuppressWarnings("serial")
public class Tabela extends JTable {
	private DefaultTableModel tabela;

	public Tabela() {
		this.tabela = new DefaultTableModel(null, new String[] { "ID", "NOME", "SAUDE", "IDADE", "GESTANTE" });
		setModel(this.tabela);
	}

	public void preencher(ArrayList<Pessoa> grupo) {
		this.tabela.setNumRows(0);
		grupo.forEach(pessoa -> {
			if (pessoa instanceof Homem) {
				this.tabela.addRow(new Object[] { pessoa.getCodigo(), pessoa.getNome(), pessoa.getSituacaoSaude(),
						((Homem) pessoa).getIdade(), "--" });
			} else if (pessoa instanceof Mulher) {
				this.tabela.addRow(new Object[] { pessoa.getCodigo(), pessoa.getNome(), pessoa.getSituacaoSaude(), "--",
						((Mulher) pessoa).getSituacaoGestante() });
			}
		});
	}
}
