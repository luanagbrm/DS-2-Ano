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
	
	public String apresentar() {
		return "Portador Legal: " +this.portadorLegal+"\nPlaca: " +this.placa+"\nNum. Rodas: "+this.numRodas+"\n";
	}
	

}
