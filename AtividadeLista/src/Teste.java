import java.util.List;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
	
		ListaAtiv  animais = new ListaAtiv();
		animais.adicionar("aranha");
		animais.adicionar("pantera negra");
		animais.adicionar("basilisco");
		animais.adicionar("rinoceronte");
		animais.adicionar("Aguia");
		animais.adicionar("Égua");
		
		int posicao = animais.buscar ("basilisco "); 
		System.err.println(posicao);

		/* remove o nome da posicao que nosso int da ListAtiv definiu */
		animais.remover(0);
		
//		adicionando um novo nome a lista
		animais.adicionar("corvo");
		
//		faz com  que  o código gere um alert  em sua tela ao querer vir todos os nomes
		System.out.println(animais.mostrarTodos());
		
		JOptionPane.showMessageDialog(null, animais);
		
////		mostra toda a lista
//		animais.mostrarTodos();  
		
	}

}
