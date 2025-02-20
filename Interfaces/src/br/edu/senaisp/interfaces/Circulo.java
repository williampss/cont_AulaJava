package br.edu.senaisp.interfaces;

public class Circulo implements IFiguraGeo {
	
	private double raio;
	
	public Circulo(double diametro) {
		super();
		this.raio = diametro;
	}




	public double getDiametro() {
		return raio;
	}

	public void setDiametro(double diametro) {
		this.raio = diametro;
	}

	@Override
	public double calcArea() {
		
		
		
		return Math.PI * (raio * raio);
	}
	
	
}
