package ar.edu.unlam.tallerweb.obras;

import java.util.Iterator;

public class ObraDeArte {
	
	private String nombreObra;
	private Autor autor;
	
	public ObraDeArte(String nombreDeObra, Autor autor) {
		// TODO Auto-generated constructor stub
		this.nombreObra = nombreDeObra;
		this.autor = autor;
	}

	public String getNombre() {
		return this.nombreObra;
	}
	
	public Autor getAutor() {
		// TODO Auto-generated method stub
		return this.autor;
	}

	public Iterator<ObraDeArte> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
