package br.edu.senaisp.modelo;

public class Cachorro extends Animal {
	private String nome;
	
//	sobrecarga de informação


	public Cachorro(String raca, String cor, String string) {
		super(raca, cor);
		this.nome = nome;
		
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String latir() {
		return "AU AU!" + " meu nome é " +
	        this.nome;
	}
	
	public String correr() {
		return "Correndo...";
	}
	
}