package ar.edu.unlam.tallerweb.figura;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.tallerjava.tp2.Triangulo;

public class TrianguloTest {
	
	@Test
	public void testAreaTriangulo(){
		
		Triangulo triangulo = new Triangulo(4.0, 5.0, 6.0);
		Assert.assertTrue();
		
	}
	
	@Test
	public void testPerimetroTriangulo() {
		
		Triangulo triangulo = new Triangulo(4.0, 5.0, 6.0);
		Assert.assertEquals(15.0, triangulo.perimetro(), 0.1);
	
	}

}
