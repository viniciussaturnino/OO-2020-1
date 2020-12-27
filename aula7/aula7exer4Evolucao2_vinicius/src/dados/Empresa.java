package dados;

import java.util.ArrayList;

public class Empresa {
	private ArrayList<FuncionarioRegular> funcionarios;

	public Empresa() {
		funcionarios = new ArrayList<FuncionarioRegular>();
	}

	public ArrayList<FuncionarioRegular> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(FuncionarioRegular funcionarios) {
		this.funcionarios.add(funcionarios);
	}
}
