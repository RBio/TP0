import org.uqbar.commons.utils.Observable;

@Observable
public class Alumno {
	int code;
	String first_name;
	String last_name;
	String github_user;

	public Alumno(int code, String first_name, String last_name, String github_user) {
		this.code = code;
		this.first_name = first_name;
		this.last_name = last_name;
		this.github_user = github_user;
	}

	public int getCode() {
		return code;
	}

	public String getFirst_name() {
		return first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public String getGithub_user() {
		return github_user;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public void setGithub_user(String github_user) {
		this.github_user = github_user;
	}

}
