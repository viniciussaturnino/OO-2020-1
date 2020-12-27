package dados;

import java.util.Vector;

public class Habitantes {
	private Vector<Pessoa> habitantes;

	public Habitantes() {
		habitantes = new Vector<Pessoa>();
	}

	public Vector<Pessoa> getHabitantes() {
		return habitantes;
	}

	public Pessoa getHabitantes(int i) {
		return habitantes.get(i);
	}

	public void setHabitantes(Pessoa pessoa) {
		this.habitantes.add(pessoa);
	}
}
