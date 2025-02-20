package br.edu.senaisp.modelo;

public abstract  class Pessoa {
	
	private String nome;
	private String cpf;
	protected int anoNascimento;
	
	
	
	public Pessoa(String nome, String cpf, int anoNascimento) {
		this.nome = nome;
		this.cpf = cpf;
		this.anoNascimento = anoNascimento;
	}
	
	
//	usando o  metódo  abstrato é para obrigar as classes filho  a implementarem o código conforme cada particularidade.
//	Por isso, ela não tem código implementado.
	public abstract int  calcIdade();


	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public String getCpf() {
		return cpf;
	}



	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	
	

	
	

}
