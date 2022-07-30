package getSet;
public class Caminhao {
	private String fabricante, placa, portadorLegal;
	private int numRodas;
	
	public Caminhao(String fabricante, int numRodas, String placa, String portadorLegal) {
		this.fabricante = fabricante;
		this.numRodas = numRodas;
		this.placa = placa;
		this.portadorLegal = portadorLegal;
	}
	
	// Setters
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	
	public void setPortador(String portadorLegal) {
		this.portadorLegal=portadorLegal;
	}
	
	//Getters
	public String getFabricante() {
		return fabricante;
	}
	
	public int getRodas() {
		return numRodas;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public String getPortador() {
		return portadorLegal;
	}
	
	public String apresentar() {
		return "Portador Legal: " +this.portadorLegal+"\nPlaca: " +this.placa+"\nNum. Rodas: "+this.numRodas+"\nFabricante: "+this.fabricante+"\n";
	}
}
