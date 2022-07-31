
import java.util.Scanner;

public class Main {

public static void main(String[] args) {
	
		double preco;
	
		Scanner in = new Scanner(System.in);
		
		Produto produto1 = new Produto();
		
		
		System.out.println("Digite o nome do Produto");
			produto1.setNome(in.nextLine());
		
		System.out.println("Digite o preço de custo da mercadoria");
				produto1.setPrecoCusto(in.nextDouble());
		
		System.out.println("Digite o valor que será atribuído ao produto");
		preco=in.nextDouble();
		while(preco<=produto1.getPrecoCusto()) {
			System.out.println("\nO preço de venda deve ser maior que " +produto1.getPrecoCusto()+", digite novamente.");
			System.out.println("Digite o valor que será atribuído ao produto");
			preco=in.nextDouble();
		}
			produto1.setPrecoVenda(preco);
				
		
			
		produto1.calcularMargemLucro(produto1.getPrecoVenda(), produto1.getPrecoCusto());
		System.out.println(produto1.imprimir());
	}
		

}
