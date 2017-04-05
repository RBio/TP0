import org.uqbar.commons.utils.Observable;

@Observable
public class AlumnoViewModel {
	String token;
	Alumno alumno;
	Assignment tareas;

	public Assignment getTareas() {
		return tareas;
	}

	public void setTareas(Assignment tareas) {
		this.tareas = tareas;
	}

	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public void consultarDatos() {
		alumno = new Cliente().pedirDatos(token);
	}
	
	public void actualizarDatos() {
		new Cliente().actualizar(token, alumno);
	}

	public void verNotas() {
		tareas = new Cliente().pedirNotas(token);
	}

}
