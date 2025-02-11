package br.edu.senaisp.modelo;

public class Animal {
    private String raca;
	private String cor;
	
	
	
	public Animal(String raca, String cor) {
		super();
		this.raca = raca;
		this.cor = cor;
	}



	public String getRaca() {
		return raca;
	}



	public void setRaca(String raca) {
		this.raca = raca;
	}



	public String getCor() {
		return cor;
	}



	public void setCor(String cor) {
		this.cor = cor;
	}
	
	
	public String apresentarse() {
		return "Eu sou um" + this.raca;
	}
	
	
	
	
	

}