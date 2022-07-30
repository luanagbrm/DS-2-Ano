package getSet;
public class Caminhao {
	private String fabricante;
	private int numRodas;
	private String placa;
	private String portadorLegal;
	
	public Caminhao(String fabricante, int numRodas, String placa, String portadorLegal) {
		this.fabricante = fabricante;
		this.numRodas = numRodas;
		this.placa = placa;
		this.portadorLegal = portadorLegal;
	}
	
	public void setPlaca(String placa) {
		this.placa=placa;
	}
	
	public void setPortador(String portadorLegal) {
		this.portadorLegal=portadorLegal;
	}
	
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
	
	public void apresentar() {
		System.out.println("Portador Legal: " +this.getPortador());
		System.out.println("Fabricante: " +this.getFabricante());
		System.out.println("Placa: " +this.getPlaca());
		System.out.println("Rodas: " +this.getPortador());
	}
}
