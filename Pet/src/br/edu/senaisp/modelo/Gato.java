package br.edu.senaisp.modelo;

public class Gato extends Animal {
	
	protected String  corDoBigode;
	
	public Gato(String raca, String cor, String corDoBigode) {
//		super serve para referenciar o pai que é o animal, para trazer as informações
		super(raca, cor);
		this.corDoBigode = corDoBigode;
		
	}
	
	
	public String pular() {
		return "upppppp...up";
		
	}


	public String getCorDoBigode() {
		return corDoBigode;
	}


	public void setCorDoBigode(String corDoBigode) {
		this.corDoBigode = corDoBigode;
	}
	
	

}
