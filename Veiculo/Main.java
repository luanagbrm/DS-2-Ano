package getSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Moto moto1 = new Moto("Arthur B", "Honda", "589LOP");
		System.out.println(moto1.apresentar());
		
		Carro carro1 = new Carro("Amanda C", 4, "325JOP");
		System.out.println(carro1.apresentar());
		
		Caminhao caminhao1 = new Caminhao("Scania", 12, "KSJ258", "Alice N");
		caminhao1.setPortador("Alisson M");
		System.out.println(caminhao1.apresentar());		
	}

}
