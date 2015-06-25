package ar.edu.unlam.tallerweb.obras;

import java.util.Iterator;

public class ObraDeArte {
	
	private String nombreObra;
	
	public ObraDeArte(String nombreDeObra, Autor nombreDeAutor) {
		// TODO Auto-generated constructor stub
		nombreObra = nombreDeObra;
		nombreDeAutor.getNombreAutor();
	}

	public String getNombreObra() {
		return nombreObra;
	}
	
	public String getNombre() {
		// TODO Auto-generated method stub
		return nombreObra;
	}

	public Iterator<ObraDeArte> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
