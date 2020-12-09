package com.clearminds.sdi.servicios;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.clearminds.sdi.dtos.Estudiante;

@Path("/estudiantes")
public class RestEstudiantes {
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante est){
		System.out.println("Ingresando persona: "+est);
	}
}
