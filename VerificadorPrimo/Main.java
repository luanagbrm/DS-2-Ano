package provaSobrecarga;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Numero primo1 = new Numero();
		
		int num = 0;
		
		System.out.println("Quantos n�meros deseja verificar se s�o primos?");
		num=in.nextInt();
			if(num>1) {
				int[] array = new int[num];
				
				for(int i=0; i<num;i++) {
					System.out.println("Digite o n�mero");
					primo1.Primo(array[i] = in.nextInt());
				}
			} else {
				System.out.println("Digite o n�mero:");
				primo1.Primo(in.nextInt());
			}
	}
}

