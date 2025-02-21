
public class Teste {

	public static void main(String[] args) {
		
		Motor gasolina = new Motor();
		
		Carro corola =  new Carro(gasolina);
		corola.ligarCarro();
	}

}
