
	package br.edu.senaisp.dao;

	import java.util.ArrayList;
	import java.util.List;

	import br.edu.senaisp.modelo.Aluno;

	public class AlunoDB {
		private static List<Aluno> listaDB = new ArrayList<>();
		
		public void insert(Aluno a) {
			listaDB.add(a);
		}
		
		public void update(Aluno a) {
			int i = listaDB.indexOf(a);
			if(i > 0) {
				listaDB.set(i, a);
			}
		}
		
		public void delete (Aluno a) {
			int i = listaDB.indexOf(a);
			if(i > 0) {
				listaDB.remove(i);
			}
		}
		
		public List<Aluno> selectAll(){
			return listaDB;
		}

	}

