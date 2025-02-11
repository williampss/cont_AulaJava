//É NECESSÁRIO A CLASSE TESTE SEMPRE PARA FAZER O TESTE


package br.edu.senaisp.modelo;

public class AnimalTeste {

	public static void main(String[] args) {
		
		Gato cat1 = new Gato("dourado", "Persa", "Branco");
		cat1.apresentarse();
		       
		
		System.out.println(cat1.pular());
		
		
		
		
		
		Cachorro cao1 = new Cachorro("Tigrao", "Pastor", "preto");

		
		Cachorro cao2 = new Cachorro("Bellynha", "pastor", "magenta");
		
		Cachorro cao3 = new Cachorro("Bynha", "Chytsu", "marrom");
		
		System.out.println(cao3.getNome() + "/" + cao3.getRaca() + "/" + cao3.getCor());
		
		
		
		System.out.println(cao1.latir());
		
		System.err.println(cao1.correr());
		
	}
	
	
}
