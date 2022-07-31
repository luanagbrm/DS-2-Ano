package atividade0728;

public class Losango extends Figura {
	
	@Override
	public void calcularArea(double diagonalMaior, double diagonalMenor) {
		area = diagonalMenor*diagonalMaior/2;
	}

}
