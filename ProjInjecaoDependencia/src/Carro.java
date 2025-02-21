
public class Carro{
	
	
//	o primeiro  motor é minha classe Motor e o  segundo  motor é minha variavel
	private  IMotor motor;

	public Carro(Motor m) {
		
		motor = m;
		
	}
	
	public  void ligarCarro() {
		motor.ligar();
		
		System.out.println("carro ligado (0  V  0)");
	}
	
	
 
}
