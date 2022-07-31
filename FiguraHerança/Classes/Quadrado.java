package atividade0728;

public class Quadrado extends Figura {
	
	@Override
	public void calcularArea(double lado, double area) {
		area = lado*lado;
		this.area=area;
		
	}
}
