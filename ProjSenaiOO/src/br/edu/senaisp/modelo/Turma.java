package br.edu.senaisp.modelo;

import java.util.ArrayList;
import java.util.List;

public class Turma  {
	
	private Integer id; 
	private String curso;
	private int  duracaoHoras;
	
	
	private Professor professor;
	
	private List<Aluno> alunos  = new ArrayList<Aluno>();
	
	private Sala sala;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getDuracaoHoras() {
		return duracaoHoras;
	}

	public void setDuracaoHoras(int duracaoHoras) {
		this.duracaoHoras = duracaoHoras;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor prof) {
		this.professor = prof;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}
	
	
	
	
	
}
