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
		
			//Converter Real -> D�lar || D�lar -> Real
			System.out.println("Em qual moeda voc� recebe seu sal�rio? \nReal - Digite 1 \nD�lar - Digite 2: ");
			opcao=in.nextInt();
			while(opcao<=0 || opcao>=3) {
				System.out.println("\nEsse n�mero n�o corresponde a nenhuma das op��es. Tente novamente");
				System.out.println("Em qual moeda voc� recebe seu sal�rio? \nReal - Digite 1 \nD�lar - Digite 2: ");
				opcao=in.nextInt();
			}
				if(opcao==1) {
					System.out.println("Digite seu sal�rio: ");
					funcionario01.setSalario(in.nextDouble(), false);
				} else {
					System.out.println("Digite seu sal�rio: ");
					funcionario01.setSalario(in.nextDouble(), true);
				}
				
		
		System.out.println(funcionario01.imprimir());
	}
	
}
	
