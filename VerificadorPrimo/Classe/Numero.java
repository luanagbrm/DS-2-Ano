package provaSobrecarga;

public class Numero {
	

	public void Primo (int numero) {
		boolean primo;
		int contador=0;
		for(int i=1; i <=numero; i++) {
			if (numero%i==0) {
				contador++;
			} 	
		}
		if(contador>2) {
			primo = false;
			System.out.println("O número não é primo");
		} else {
			primo = true;
			System.out.println("O número é primo");
		}
	}

	public void Primo (int[] vetor) {
		for(int i=0; i <vetor.length; i++) {
				Primo(vetor[i]);
			} 	
		}
	}

