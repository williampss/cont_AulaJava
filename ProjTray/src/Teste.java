
//import java.util.Scanner;
//
//public class Teste {
//
//	public static void main(String[] args) {
//
//		Scanner teclado = new Scanner(System.in);
//		
//		try {//tentar
//			System.err.println("Digite o 1º Nr:");
//			int a = teclado.nextInt();
//			System.err.println("Digite o 2º Nr:");
//			int b = teclado.nextInt();
//			System.err.println(a/b);			
//		} catch (Exception e) { //pegar
//			System.err.println("Algo deu errado. "
//					+ "Verifique e tente novamente!"
//					+ e.getMessage());
//		}finally {
//			
//		}
//	
//				
//	}
//
//}
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.err.println("Digite o 1º Nr:");
		int a = teclado.nextInt();
		System.err.println("Digite o 2º Nr:");
		int b = teclado.nextInt();
		double resultado = 0;

		try {
			resultado = calculeira(a, b);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}			
		System.err.println(resultado);
	}

	public static double calculeira(int a, int b) throws Exception {
		return dividir(a, b);
	}
	
	public static double dividir(int a, int b) {
		if (b == 0)
			throw new ArithmeticException("Amigo, não pode dividir por Zero. Você não lembra da tia Elza?!");
		return a / b;
	}

}


