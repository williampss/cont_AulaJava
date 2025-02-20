package br.edu.senaisp.modelo;

public class Professor extends Pessoa {

	private Integer id;
	
	public Professor(String nome, String cpf, int ano, Integer id) {
		super(nome, cpf, ano);
		this.id = id;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Override
	public int calcIdade() {
		
		return 2025 - anoNascimento;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
