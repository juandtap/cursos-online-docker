package ups.cursos_online_docker;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;

@Path("")
public class HelloWorld {
	@GET
	@Path("hello")
	@Produces("application/json")
	public String getHelloWorld() {
		return "Hola mundo";
	}
}
