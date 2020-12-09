package com.clearminds.sdi.servicios;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.clearminds.sdi.bdd.ConexionBDD;
import com.clearminds.sdi.dtos.Estudiante;
import com.clearminds.sdi.excepciones.BDDException;

@Path("/estudiantes")
public class RestEstudiantes {
	
	@Path("/insertar")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public void insertar(Estudiante est){
		ServicioEstudiante s=new ServicioEstudiante();
		try {
			s.insertarEstudiante(est);
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Ingresando persona: "+est);
	}
	
	
	@Path("/actualizar")
	@PUT
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public void actualizar(Estudiante est){
		ServicioEstudiante s=new ServicioEstudiante();
		try {
			if(est!=null){
				s.actualizarEstudiante(est);
			}
			s.actualizarEstudiante(est);
		} catch (BDDException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Actualizando estudiante: "+est);
	}
}
