package br.edu.senaisp.modelo;

public class Teste {

	public static void main(String[] args) {
		
	Sala sala6= new Sala(6, 20, "Chile");
	
	Professor prof = new Professor("bit", "555.455.567-42", 12233);
	
	Turma xaxas = new Turma();
	
	xaxas.setId(122);
	xaxas.setCurso("Java-Fundations");
	xaxas.setDuracaoHoras(80);
	xaxas.setProfessor(prof);
	
	xaxas.setSala(sala6);
	
	
	System.out.println(xaxas.getCurso());
	System.out.println(xaxas.getProfessor() 
			.getNome()
			);
	Aluno a1 = new Aluno("Dennilsom", "4124", 100);
	
	

	}

}
