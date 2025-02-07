package br.edu.senaisp.modelo;

public class Carro {
	
//	modificadores de acesso,  temos o protected/private/public, public e private estão fazendo a  ponte para a interação.
	private String nome;
	private String marca;
	private float km;
	private String  cor;
	private String placa; 
	private String nomeCliente;
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String n) {
		nome = n;
	}
	
	
	
	
	
	
	
	
	public Carro(String nome, String marca, float km, String cor, String placa, String nomeCliente) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.km = km;
		this.cor = cor;
		this.placa = placa;
		this.nomeCliente = nomeCliente;
		
		
		
		
	}
	
	
	
}
