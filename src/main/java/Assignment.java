import java.util.ArrayList;

import org.uqbar.commons.utils.Observable;

@Observable

public class Assignment {

	ArrayList<Tarea> assignments = new ArrayList<Tarea>();

	public Assignment(ArrayList<Tarea> assignments) {
		this.assignments = assignments;
	}

	public ArrayList<Tarea> getAssignments() {
		return assignments;
	}

}
