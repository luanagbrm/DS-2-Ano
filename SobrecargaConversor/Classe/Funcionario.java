import java.text.NumberFormat;
import java.util.Locale;

public class Funcionario {
	public String nome;
	private String cpf;
	protected double salario;
	protected double salarioDolar;
	private int imprimeDecisao;
	
	public String imprimir() {
		if(imprimeDecisao == 1) {
			return ("Nome do Funcionário:"+this.nome+"\nCPF do Funcionário: " +this.getCpf()+""
					+ "\nSeu salário em dólar é: " +NumberFormat.getCurrencyInstance(new Locale("en","US")).format(salarioDolar)+"\nSeu salário em real: "+NumberFormat.getCurrencyInstance(new Locale("pt","BR")).format(salario));
		} else {
			return ("Nome do Funcionário:"+this.nome+"\nCPF do Funcionário: " +this.getCpf()
					+"\nSeu salário em dólar é: " +NumberFormat.getCurrencyInstance(new Locale("en","US")).format(salarioDolar)+"\nSeu salário em real: "+NumberFormat.getCurrencyInstance(new Locale("pt","BR")).format(salario));
		}
	}
	

	public String getCpf() {
		return cpf;
	}	
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome, boolean caixaalta){
		if(caixaalta) {
			this.nome = nome.toUpperCase();
		} else {
			this.nome = nome.toLowerCase();
		}
	}

	public void setNome(String nome, boolean caixaalta, String primeirapalavra){
		if(caixaalta) {
			this.nome = nome.toUpperCase();
		} else {
			this.nome = nome.toLowerCase();
		}

		if(primeirapalavra=="S"){
			this.nome = nome.split(" ")[0];
		}
	}

	public void setNome(String nome, String primeirapalavra){
		if(primeirapalavra=="S"){
			this.nome = nome.split(" ")[0];
		}
	}
	
	public void setSalario(double salario, boolean dolar) {
		if(dolar) {
			this.salario = salario/4.96;
			this.salarioDolar = salario;
			imprimeDecisao = 2;
		} else {
			this.salarioDolar = salario*4.96;
			this.salario = salario;
			imprimeDecisao = 1;
	}
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}

