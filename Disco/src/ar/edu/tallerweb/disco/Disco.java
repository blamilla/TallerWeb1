package ar.edu.tallerweb.disco;

public class Disco {
	
	private Double radioInterior;
	private Double radioExterior;
	
	public Disco(Double radioInterior, Double radioExterior) {
		// TODO Auto-generated constructor stub
		this.radioInterior = radioInterior;
		this.radioExterior = radioExterior;
	}
	
	public Double calcularPerimetroInterior(){
		Double perimetroInterior = 2 * Math.PI * this.radioInterior;
		return perimetroInterior;
	}
	
	public Double calcularPerimetroExterior(){
		Double perimetroExterior = 2 * Math.PI * this.radioExterior;
		return perimetroExterior;
	}
	
	public Double calcularArea(){
		Double areaDisco = (Math.PI * this.radioExterior * this.radioExterior) - (Math.PI * this.radioInterior * this.radioInterior);
		return areaDisco;
	}

}
