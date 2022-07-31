
public class Produto {
	private String nome;
	private double precoCusto, precoVenda, margemLucro;
		
	public void setNome(String nome) {
		this.nome=nome;
	}
	
	public void setPrecoCusto(double precoCusto) {
		this.precoCusto=precoCusto;
	}
	
	public void setPrecoVenda(double precoVenda) {
			while(precoVenda<=precoCusto) {
			System.out.println("O preço de venda deve ser maior que " +precoCusto+", digite novamente.");
		}
			this.precoVenda=precoVenda;
	}
	
	public void calcularMargemLucro(double precoVenda, double precoCusto) {
		this.margemLucro=this.precoVenda-this.precoCusto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPrecoCusto() {
		return precoCusto;
	}
	
	public double getPrecoVenda() {
		return precoVenda;
	}
	
	public double getMargemLucro() {
		return margemLucro;
	}
	
	public double getMargemLucroPorcentagem() {
		return margemLucro/(precoCusto/100);
	}
	
	public String imprimir() {
		return "Nome do Produto: "+this.getNome() +"\nCusto do Produto: "+this.getPrecoCusto()+"\nValor de Venda: "+this.getPrecoVenda()+"\nPorcentagem de lucro: "+this.getMargemLucroPorcentagem()+"%";		
	}
}
