
//public class Teste {
//
//	public static void main(String[] args) {
//		
//		ESemana diaDaSemana = ESemana.SEXTA;
//		
//		semana(diaDaSemana.DOMINGO);
//		
//		
//		if (diaDaSemana == ESemana.SEGUNDA || diaDaSemana == ESemana.SABADO) {
//			System.err.println("Ebaaaa");
//		}
//		
//		
//
//	}
//	
//	public static void semana (ESemana s) {
//		
//	}
//
//}
public class Teste {

	public static void main(String[] args) {
		ESemana diaDaSemana = 
				ESemana.valueOf("SAB");
		System.err.println(ESemana.SEG.titulo);
		
		System.out.println(ESemana.values()[2]);
		
		if (diaDaSemana==ESemana.DOM
				|| diaDaSemana==ESemana.SAB)
			System.out.println("Ebaaaaa!");
		else {
			System.out.println("Remunerado!");
		}
		for (ESemana s : ESemana.values()) {
			System.out.println(s.titulo);
			System.out.println(s.ordinal());
		}
	
		qualquerCoisa(ESemana.SEX);	
	}
	
    public static void qualquerCoisa(ESemana s) {
		
	}

}

