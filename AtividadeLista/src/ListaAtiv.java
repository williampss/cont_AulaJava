
public class ListaAtiv {


	String[] vetor = new String[5];
	int posicaoVaga = 0;
	
//	faz com que nossa list se amplie, por conta do length ser nosso limite, se o somarmos aumentara o seu tamanho com a 
//	rotação do for
	public void adicionar(String valor) {
		if (vetor.length <= posicaoVaga) {
			String[] vetTemp = 
					new String[vetor.length + 5];
			int i = 0;
			for (String conteudo : vetor) {
				vetTemp[i] = conteudo;
				i++;
			}

			vetor = vetTemp;
		}
		
		vetor[posicaoVaga] = valor;
		posicaoVaga++;
	}
	
	
	public int buscar(String valor) {
		for (int i = 0; i < posicaoVaga; i++) {
			if (vetor[i].equals(valor)) {
				return i;
			}
		}
		return -1;
	}

		
		//		int indice = 0;
//		for (String info : vetor) {
//			if (info != null) {
//				if (info.equals(valor)) {
//					return indice;
//				}
//			}else {
//				break;
//			}
//				
//			indice++;
//		}
//		return -1;
//	}
	
	public void remover(int pos) {
		
		for (int i = pos; i < posicaoVaga; i++) {
			vetor[i] = vetor[i+1];
		}
		posicaoVaga--;
		
	}
	
	public String buscarPorIndice(int i) {
		if (i < posicaoVaga) {
			return vetor[i];	
		}else {
			return null;
		}
		
	} 
	
	
//	para printar a informação na tela e concatenar o texto, que começa vazio e depois vai aumentando 
	public String mostrarTodos() {
		String temp ="";
		for (String valor : vetor) {
			System.out.println(valor);
		 temp = temp + "," + valor;
		}
		return temp;
		
	}
	

}




