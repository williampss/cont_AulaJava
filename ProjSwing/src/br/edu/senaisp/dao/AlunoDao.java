package br.edu.senaisp.dao;

import java.util.ArrayList;
import java.util.List;

import br.edu.senaisp.model.Aluno;

public class AlunoDao {
	
	private List<Aluno> tbAluno = new ArrayList<>();
	
	public void salvar(Aluno a) {
		tbAluno.add(a);
	}
	
	public List<Aluno> buscarTodos(){
		return tbAluno;
	}
}
