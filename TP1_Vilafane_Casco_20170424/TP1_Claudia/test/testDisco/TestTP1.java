package testDisco;

import static org.junit.Assert.*;

import ar.edu.unlam.disco.Disco;

import org.junit.Test;

public class TestTP1 {

	@Test
	public void perimetroInterior()
	{
		Double perimetro;
		Disco cd = new Disco(3.0, 1.0);
		perimetro=cd.obtenerPerimetroInterior();
		assertEquals(perimetro, 6.28, 0.01);
	}
	@Test
	public void perimetroExterior()
	{
		Double perimetro;
		Disco cd = new Disco(3.0,1.0);
		perimetro=cd.obtenerPerimetroExterior();
		assertEquals(perimetro,18.84,0.01);
	}
	@Test
	public void obtenerArea()
	{
		Double area;
		Disco cd = new Disco(3.0,1.0);
		area=cd.obtenerArea();
		assertEquals(area,78.8768,0.0001);
	}
}
