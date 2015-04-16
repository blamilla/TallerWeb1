package ar.edu.unlam.tallerweb.figura;

public class Cuadrado {
	
	private Double lado;
	
	public Cuadrado(Double lado){
		
		this.lado = lado;
		
	}

	public Double area(){
		
		return (this.lado * this.lado);
		
	}
	
	public Double perimetro(){
		
		return (this.lado * 4);
		
	}
}
