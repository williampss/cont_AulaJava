import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Date;

public class Teste {

	public static void main(String[] args) {
		
		Date data = new Date();
		LocalDate dtNascimento = LocalDate.now();
		LocalDateTime dtEntrevista = LocalDateTime.now();
		
		System.out.println(data);
		System.out.println(dtNascimento);
		System.out.println(dtEntrevista);
		
//		enumeração, na parte do  mês, você pode puxar o mês respectivo pelo localDate
		
	   dtNascimento = LocalDate.of(2004, Month.APRIL, 03 );
	   System.err.println(dtNascimento);
	   
		
	}

}
