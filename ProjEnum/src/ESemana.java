
//public enum ESemana {
//	DOMINGO,
//	SEGUNDA,
//	TERCA,
//	QUARTA,
//	QUINTA,
//	SEXTA,
//	SABADO,
//
//}
public enum ESemana {
	DOM("Domingo", 1),
	SEG("Segunda-Feira", 2),	
	TER("Terça-Feira", 3),
	QUA("Quarta-Feira", 4),
	QUI("Quinta-Feira", 5),
	SEX("Sexta-Feira", 6),
	SAB("Sábado", 7);
	
	
	
	
	public String titulo; 
	public int indice;
	ESemana(String s, int i) {
		this.titulo = s;
		this.indice = i;
	}
	
}

