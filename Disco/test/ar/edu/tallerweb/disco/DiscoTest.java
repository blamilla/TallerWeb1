package ar.edu.tallerweb.disco;

import org.junit.Assert;
import org.junit.Test;

public class DiscoTest {
	
	@Test
	public void testPerimetroInterior(){
		Disco miDisco = new Disco(5.0, 10.0);
		Assert.assertEquals(31.4, miDisco.calcularPerimetroInterior(), 0.1);
	}
	
	@Test
	public void testPerimetroExterior(){
		Disco miDisco = new Disco(5.0, 10.0);
		Assert.assertEquals(62.8, miDisco.calcularPerimetroExterior(), 0.1);
	}
	
	@Test
	public void testArea(){
		Disco miDisco = new Disco(5.0, 10.0);
		Assert.assertEquals(235.5, miDisco.calcularArea(), 0.2);
	}

}
