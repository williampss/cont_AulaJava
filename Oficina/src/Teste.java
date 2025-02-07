
import java.util.Scanner;

import br.edu.senaisp.modelo.Carro;

public class Teste {

	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		
//		ao inves de passar tudo aqui, geramos um contrutor na classe carro, que  podemos  preencher ali encima somente as informações dentro
//		do parenteses.
		Carro mustang = new Carro("Mustang" , "Mustang", 100 ,"rosa", "EPG0X12", "Alessandro Galvão");
		
		
		
		

		
//		mustang.nome = "MUSTANG";
//		mustang.marca = "MUSTANG";
//		mustang.cor ="Amarelo";
//		mustang.km = 100;
//		mustang.placa = "EPG0X12";
//		mustang.nomeCliente = "Alessandro Galvão";
		
		
//		int posicao = Mustang.buscar("");
		
		mustang.setNome("mumu  ");
		System.out.println(mustang.getNome());
		
		
		
		
	}

}
