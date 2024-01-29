package app.gui.service;

import java.util.ArrayList;
import java.util.List;

import app.gui.modelo.Persona;

public class PersonaService {

	public List<Persona>getPersonas(){
		List<Persona> personas=new ArrayList<Persona>();
		for(int i=0;i<4;i++) {
			Persona p= new Persona();
			p.setDni(""+i);
			p.setEdad(i);
			p.setNombre("miguel");
			personas.add(p);
		}
		
		return personas;
	}

}
