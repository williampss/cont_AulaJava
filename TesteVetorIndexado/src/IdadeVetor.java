import java.util.Iterator;
import java.util.Scanner;

public class IdadeVetor {

	public static void main(String[] args) {
		int[] numeros = new int[5];
		
		Scanner teclado = new Scanner(System.in);
		
		for (int cont = 0; cont < 5; cont++) {
			System.out.println("Digite um numero:");
			numeros[cont] = teclado.nextInt();
		}
		
		int soma = 0;
		for (int cont = 0; cont < 5; cont++) {
		 	soma = soma + numeros[cont];
		}	
		System.out.println("Soma é " + soma);
		
		int media = soma /5;
		
		System.out.println("média é " + media);
		
		int maior = numeros[0];
		for (int x = 1 ; x < 5; x++ ) {
			if(numeros[x] > maior) {
				maior = numeros[x];
				
			}
			
		}
		
		int menor = numeros[0];
		for(int y = 1; y < 5; y++) {
			if(numeros[y] < menor) {
				menor= numeros[y];
			}
			
		}
		
			System.out.println("o maior é " + maior);
			System.out.println("o menor é " + menor);
	}
}



/*
 * String alunos[]= new String[5];
 * 
 * alunos[0] = "Rebeca"; alunos[1] = "Thomas"; alunos [2] = "Garfield"; alunos
 * [3] = "Bia";
 * 
 * System.out.println("idade: " + alunos[1]);
 */