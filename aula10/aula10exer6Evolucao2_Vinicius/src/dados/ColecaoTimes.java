package dados;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ColecaoTimes implements Comparator<Time> {
	private List<Time> times;

	public ColecaoTimes() {
		times = new ArrayList<Time>();
	}

	public List<Time> getTimes() {
		return times;
	}

	public Time getTime(int index) {
		return times.get(index);
	}

	public void setTime(Time time) {
		this.times.add(time);
	}

	public int compare(Time time1, Time time2) {
		return (time1.getNome().compareTo(time2.getNome()));
	}

}
