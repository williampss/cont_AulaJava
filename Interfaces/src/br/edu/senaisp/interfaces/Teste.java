package br.edu.senaisp.interfaces;

public class Teste {

	public static void main(String[] args) {
		
		
		Quadrado q1 = new Quadrado(7);
		
		System.out.println(q1.calcArea());
		
		
		Circulo c1 = new Circulo(10);
		impressora(c1);		
		
		

	}
	
	
	public static void impressora( IFiguraGeo i) {
		
		System.out.println(i.calcArea());
		
	}

}
