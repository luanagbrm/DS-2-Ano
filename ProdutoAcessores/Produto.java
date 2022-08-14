package acessores;

import java.text.DecimalFormat;

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
		if(precoVenda>this.getPrecoCusto()) {
		this.precoVenda=precoVenda;
		}
	}
	
	public void calcularMargemLucro() {
		this.margemLucro=precoVenda-precoCusto;
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
	
	public String getMargemLucroPorcentagem() {
		DecimalFormat MLP = new DecimalFormat();
		MLP.applyPattern("00.#");
		return (MLP.format(this.getMargemLucro()/this.getPrecoCusto()*100));
	}
	
	public String imprimir(){
		return "Nome do Produto: "+nome+"\nCusto do Produto: R$ "+precoCusto+"\nPreço de Venda: R$ "+precoVenda+"\nMargem de lucro: R$ "+this.getMargemLucro()+"\nPercentual de lucro: "+this.getMargemLucroPorcentagem()+"%";
	}
	
}