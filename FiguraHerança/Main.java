package atividade0728;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
				
		int opcao;
		
		Quadrado quadrado1 = new Quadrado();
		Retangulo retangulo1 = new Retangulo();
		Losango losango1 = new Losango();
		Triangulo triangulo1 = new Triangulo();
		
		System.out.println("Qual � a forma que deseja calcular a �rea? \nTri�ngulo [Digite 1] \nQuadrado [Digite 2] \nRetangulo [Digite 3] \nLosango [Digite 4]");
		opcao=in.nextInt();
			while(opcao<1 || opcao>4) {
				System.out.println("Esse n�mero n�o representa nenhuma das op��es");
				System.out.println("Qual � a forma que deseja calcular a �rea? \nTri�ngulo [Digite 1] \nQuadrado [Digite 2] \nRetangulo [Digite 3] \nLosango [Digite 4]");
				opcao=in.nextInt();
			}
			 if(opcao==1) {
					double altura;
					System.out.println("Qual � a altura do seu tri�ngulo?");
						altura=in.nextDouble();
					System.out.println("Qual � a base do seu tri�ngulo?");
						triangulo1.calcularArea(altura, in.nextDouble());
						System.out.println("A �rea do seu tri�ngulo �: "+triangulo1.exibirArea());
						
			} else if(opcao==2) {
					System.out.println("Qual � o tamanho de um dos lados do seu quadrado?");
						quadrado1.calcularArea(in.nextDouble(), opcao);
					System.out.println("A �rea do seu quadrado �: "+quadrado1.exibirArea());
					
			} else if(opcao==3) {
					double altura;
					System.out.println("Qual � a altura do seu ret�ngulo?");
						altura=in.nextDouble();
					System.out.println("Qual � a base do seu ret�ngulo?");
						retangulo1.calcularArea(altura, in.nextDouble());
						System.out.println("A �rea do seu ret�ngulo �: "+retangulo1.exibirArea());
					
			} else if(opcao==4) {
					double diagonalM;
					System.out.println("Qual � o comprimento da diagonal maior do seu losango?");
						diagonalM=in.nextDouble();
					System.out.println("Qual � o comprimento da diagonal menor do seu losango?");
						losango1.calcularArea(diagonalM, in.nextDouble());
						System.out.println("A �rea do seu losango �: "+losango1.exibirArea());
		
			}

}
	
}
