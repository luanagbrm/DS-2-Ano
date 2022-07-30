package getSet;
public class Moto {
	
	public String portadorLegal;
	public String fabricante;
	public String placa;
	
	public Moto(String portadorLegal, String fabricante, String placa) {
		this.portadorLegal=portadorLegal;
		this.fabricante=fabricante;
		this.placa=placa;
		
	}
	
	public String apresentar() {
		return "Portador Legal: " +this.portadorLegal+"\nPlaca: " +this.placa+"\nFabricante: "+this.fabricante+"\n";
	}
	

}