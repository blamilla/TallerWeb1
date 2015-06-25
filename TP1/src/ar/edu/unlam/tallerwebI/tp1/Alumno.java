package ar.edu.unlam.tallerwebI.tp1;

public class Alumno {
	
	private Integer nota1 = 0;
	private Integer nota2 = 0;

	public void calificarPrimerParcial(Integer nota) {
		// TODO Auto-generated method stub
		if(nota >= 1 || nota <= 10){
			nota1 = nota;
		}
	}

	public Integer getPrimerParcial() {
		// TODO Auto-generated method stub
		return nota1;
	}

	public void calificarSegundoParcial(Integer nota) {
		// TODO Auto-generated method stub
		if(nota >= 1 || nota <= 10){
			nota2 = nota;
		}
	}

	public Integer getSegundoParcial() {
		// TODO Auto-generated method stub
		return nota2;
	}

	public boolean estaAprobado() {
		// TODO Auto-generated method stub
		if((nota1 >= 4 && nota1 <= 6) || (nota2 >= 4 && nota2 <= 6)){
			return true;
		} 
		
		return false;
			
	}

	public boolean estaPromocionado() {
		// TODO Auto-generated method stub
		if((nota1 >= 7 && nota1 <= 10) && (nota2 >= 7 && nota2 <= 10)){
			return true;
		}
	
		return false;
			
	}

}
