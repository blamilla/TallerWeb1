package ar.edu.unlam.tallerweb.obras;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Catalogo {
	
	ArrayList<ObraDeArte> catalogo = new ArrayList<ObraDeArte>();

	public Integer ontenerCantidadObras() {
		// TODO Auto-generated method stub
		return catalogo.size();
	}

	public void agregarObra(ObraDeArte obraDeArte) {
		// TODO Auto-generated method stub
		
		if(obraDeArte != null){
		
			catalogo.add(obraDeArte);
		
		}
		
		Collections.sort(catalogo, new Comparator<ObraDeArte>(){
			
			public int compare(ObraDeArte nombre1, ObraDeArte nombre2){
				
				return nombre1.getNombre().compareTo(nombre2.getNombre());
			
			}
		
		});
		
	}

	public boolean existeObra(ObraDeArte obraDeArte) {
		// TODO Auto-generated method stub
		if(catalogo.contains(obraDeArte)){
			System.out.println("La obra ingresada ya existe.");
			return true;
		}
		
		return false;
	}

	public ObraDeArte getObras() {
		// TODO Auto-generated method stub
		for(int i = 0; i < catalogo.size(); i++){
			return catalogo.get(catalogo.size());	
		}
		
		return catalogo.get(catalogo.size());
		
	}

}
