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
	
	public void apresentar() {
		
		System.out.println("Portador Legal: "+this.portadorLegal);
		System.out.println("Fabricante: "+this.fabricante);
		System.out.println("Placa: "+this.placa);
		
	}
	

}