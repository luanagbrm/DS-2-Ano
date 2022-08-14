package acessores;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Produto Produto01 = new Produto();
		
			System.out.println("Insira o nome do produto:");
				Produto01.setNome(in.nextLine());
			System.out.println("Insira o custo do produto:");
				Produto01.setPrecoCusto(in.nextDouble());
			System.out.println("Insira o preço para a venda dele:");
				Produto01.setPrecoVenda(in.nextDouble());
					while (Produto01.getPrecoVenda()<Produto01.getPrecoCusto()) {
						System.out.println("O valor de venda deve ser maior que o custo. \nInsira novamente:");
						Produto01.setPrecoVenda(in.nextDouble());
					}
				
			
			Produto01.calcularMargemLucro();
			System.out.println(Produto01.imprimir());
		
	}

}
