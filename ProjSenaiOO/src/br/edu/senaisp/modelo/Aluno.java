package br.edu.senaisp.modelo;

public class Aluno extends Pessoa {
	private Integer nrMatricula ;

	public Aluno(String nome, String cpf, int nrMatricula) {
		super(nome, cpf);
		this.nrMatricula = nrMatricula;
	}

	public Integer getNrMatricula() {
		return nrMatricula;
	}

	public void setNrMatricula(Integer nrMatricula) {
		this.nrMatricula = nrMatricula;
	}

	
	
	
	
	
	
	
	
	


}
