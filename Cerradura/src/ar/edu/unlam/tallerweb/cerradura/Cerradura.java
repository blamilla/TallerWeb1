package ar.edu.unlam.tallerweb.cerradura;

public class Cerradura {
	
	private Integer clave;
	private Integer aperturasExitosas;
	private Integer intentosFallidos;
	private Integer intentosFallidosConsecutivos;
	private boolean bloqueada;
	private boolean abierta;
	
	public Cerradura(Integer clave){
		this.clave = clave;
		aperturasExitosas = 0;
		intentosFallidos = 0;
		intentosFallidosConsecutivos = 0;
		bloqueada = false;
		abierta = false;
	}
	 
	public boolean abrir(Integer clave){
	
		if(abierta || bloqueada){
			return false;
		}
		
		if(clave == this.clave){
			abierta = true;
			aperturasExitosas++;
			intentosFallidosConsecutivos = 0;
			return true;
		}
		
		intentosFallidos++;
		intentosFallidosConsecutivos++;
		
		if(intentosFallidosConsecutivos == 3){
			bloqueada = true;
		}
		
		return false;
	}
	
	public void cerrar(){
		abierta = false;
	}
	
	public boolean estaAbierta(){
		return abierta;
	} 
	
	public boolean estaCerrada(){
		return !abierta;
	}
	
	public boolean fueBloqueada(){
		return bloqueada;
	}
	
	public Integer contarAperturasExitosas(){
		return aperturasExitosas;
	}
	
	public Integer contarAperturasFallidas(){
		return intentosFallidos;
	}

}