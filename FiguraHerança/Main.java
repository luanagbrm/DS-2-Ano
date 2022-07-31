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
		
		System.out.println("Qual é a forma que deseja calcular a área? \nTriângulo [Digite 1] \nQuadrado [Digite 2] \nRetangulo [Digite 3] \nLosango [Digite 4]");
		opcao=in.nextInt();
			while(opcao<1 || opcao>4) {
				System.out.println("Esse número não representa nenhuma das opções");
				System.out.println("Qual é a forma que deseja calcular a área? \nTriângulo [Digite 1] \nQuadrado [Digite 2] \nRetangulo [Digite 3] \nLosango [Digite 4]");
				opcao=in.nextInt();
			}
			 if(opcao==1) {
					double altura;
					System.out.println("Qual é a altura do seu triângulo?");
						altura=in.nextDouble();
					System.out.println("Qual é a base do seu triângulo?");
						triangulo1.calcularArea(altura, in.nextDouble());
						System.out.println("A área do seu triângulo é: "+triangulo1.exibirArea());
						
			} else if(opcao==2) {
					System.out.println("Qual é o tamanho de um dos lados do seu quadrado?");
						quadrado1.calcularArea(in.nextDouble(), opcao);
					System.out.println("A área do seu quadrado é: "+quadrado1.exibirArea());
					
			} else if(opcao==3) {
					double altura;
					System.out.println("Qual é a altura do seu retângulo?");
						altura=in.nextDouble();
					System.out.println("Qual é a base do seu retângulo?");
						retangulo1.calcularArea(altura, in.nextDouble());
						System.out.println("A área do seu retângulo é: "+retangulo1.exibirArea());
					
			} else if(opcao==4) {
					double diagonalM;
					System.out.println("Qual é o comprimento da diagonal maior do seu losango?");
						diagonalM=in.nextDouble();
					System.out.println("Qual é o comprimento da diagonal menor do seu losango?");
						losango1.calcularArea(diagonalM, in.nextDouble());
						System.out.println("A área do seu losango é: "+losango1.exibirArea());
		
			}

}
	
}
