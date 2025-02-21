
public class Teste {

	public static void main(String[] args) {
		
		ESemana diaDaSemana = ESemana.SEXTA;
		
		semana(diaDaSemana.DOMINGO);
		
		
		if (diaDaSemana == ESemana.SEGUNDA || diaDaSemana == ESemana.SABADO) {
			System.err.println("Ebaaaa");
		}
		
		

	}
	
	public static void semana (ESemana s) {
		
	}

}
