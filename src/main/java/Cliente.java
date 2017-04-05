import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource.Builder;

public class Cliente {

	private static final String resource = "http://notitas.herokuapp.com/";

	private Builder ConectarServidor(String token, String path) {
		return Client.create().resource(resource).path(path).header("Authorization", "Bearer " + token)
				.accept(MediaType.APPLICATION_JSON);
	}
	
	private String ConsultarDatos(String token, String path) {
		return ConectarServidor(token,path).get(ClientResponse.class).getEntity(String.class);
	}
	
	private void ActualizarDatos(String token, String path, String json) {
		ConectarServidor(token,path).put(json);
	}

	public Alumno pedirDatos(String token) {
		String json = this.ConsultarDatos(token, "student");
		return new Gson().fromJson(json, Alumno.class);
	}

	public Assignment pedirNotas(String token) {
		String json = this.ConsultarDatos(token, "student/assignments");
		return new Gson().fromJson(json, Assignment.class);
	}
	
	public void actualizar(String token,Alumno alumno){
		System.out.println(new Gson().toJson(alumno));
		this.ActualizarDatos(token, "student", new Gson().toJson(alumno));
	}
	
	

}
