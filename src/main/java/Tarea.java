import java.util.ArrayList;

import org.uqbar.commons.utils.Observable;

@Observable

public class Tarea {
	int id;
	String title;
	String description;
	ArrayList<Nota> grades = new ArrayList<Nota>();

	public void setGrades(ArrayList<Nota> grades) {
		this.grades = grades;
	}

	public Tarea(int id, String title, String description, ArrayList<Nota> grades) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.grades = grades;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public ArrayList<Nota> getGrades() {
		return grades;
	}
	
}
