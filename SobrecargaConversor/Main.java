import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int opcao;
		
		Funcionario funcionario01 = new Funcionario();
		
		System.out.println("Digite o seu nome: ");
		funcionario01.setNome(in.nextLine());
		
		System.out.println("Digite seu CPF: ");
		funcionario01.setCpf(in.next());
		
			//Converter Real -> Dólar || Dólar -> Real
			System.out.println("Em qual moeda você recebe seu salário? \nReal - Digite 1 \nDólar - Digite 2: ");
			opcao=in.nextInt();
			while(opcao<=0 || opcao>=3) {
				System.out.println("\nEsse número não corresponde a nenhuma das opções. Tente novamente");
				System.out.println("Em qual moeda você recebe seu salário? \nReal - Digite 1 \nDólar - Digite 2: ");
				opcao=in.nextInt();
			}
				if(opcao==1) {
					System.out.println("Digite seu salário: ");
					funcionario01.setSalario(in.nextDouble(), false);
				} else {
					System.out.println("Digite seu salário: ");
					funcionario01.setSalario(in.nextDouble(), true);
				}
				
		
		System.out.println(funcionario01.imprimir());
	}
	
}
	
