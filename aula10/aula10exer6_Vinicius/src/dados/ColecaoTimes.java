package dados;

import java.util.ArrayList;
import java.util.List;

public class ColecaoTimes {
	private List<Time> times;

	public ColecaoTimes() {
		this.times = new ArrayList<Time>();
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

}
