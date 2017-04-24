package ar.edu.unlam.disco;

public class Disco {
	
	// atributos
	private Double radioSuperior; 
	private Double radioInferior;
	private Double AreaInterior;
	private Double AreaExterior;

	
	//Constructor
	public Disco(Double radio1, Double radio2)
	{
		this.radioSuperior=radio1;
		this.radioInferior=radio2;
	}
	
	//métodos
	public Double obtenerPerimetroInterior()
	{
		return radioInferior*2*3.14;
	}
	
	public Double obtenerPerimetroExterior()
	{
		return radioSuperior*2*3.14;
	}
	
	public Double obtenerArea()
	{
		AreaInterior=3.14*3.14*radioInferior*radioInferior;
		AreaExterior=3.14*3.14*radioSuperior*radioSuperior;
		return AreaExterior-AreaInterior;
	}
	
	/*ES EL METODO MAIN, QUE PERMITE EJECUTAR UNA CLASE:
	
	public static void main(String[] args)
	{
		Disco longplay; 
		Double perimetroExterior;
		Double perimetroInterior;
		Double area;
		
		longplay = new Disco(8.0, 4.0);
		perimetroExterior = longplay.obtenerPerimetroExterior();
		perimetroInterior = longplay.obtenerPerimetroInterior();
		area = longplay.obtenerArea();
		
		System.out.println("Perimetro Exterior: "+ perimetroExterior);
		System.out.println("Perimetro Interior: "+ perimetroInterior);
		System.out.println("Area:  "+ area);
		
				
	}*/
	

}
