package getSet;
public class Carro {
	
	protected String portadorLegal;
	protected int numRodas;
	protected String placa;
	
	public Carro(String portadorLegal, int numRodas, String placa) {
		this.portadorLegal=portadorLegal;
		this.numRodas=numRodas;
		this.placa=placa;
		
	}
	
	public void apresentar() {
		
		System.out.println("Portador Legal: "+this.portadorLegal);
		System.out.println("Quantidade de Rodas : "+this.numRodas);
		System.out.println("Placa: "+this.placa);
		
	}
	

}
