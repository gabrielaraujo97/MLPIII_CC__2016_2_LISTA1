package br.com.montagem;

public class Carro {

	private String cor;
	private String modelo;
	private double velocidadeAtual;
	private double velocidadeMaxima;
	private double velocidadeAcrescentada;
	
	public String ligar(){
		System.out.println("O carro está LIGADO!");
		return toString();
	}
	
	public double acelerar(){
		this.velocidadeAtual = velocidadeAtual;
		this.velocidadeAcrescentada = velocidadeAcrescentada;
		this.velocidadeMaxima = velocidadeMaxima;
		
		if((velocidadeAtual + velocidadeAcrescentada) >= velocidadeMaxima){
			System.out.println("O veiculo ja está na velocidade máxima!");
		}else
			System.out.println("A sua velocidade final é : " + (velocidadeAtual + velocidadeAcrescentada));
		return velocidadeAtual + velocidadeAcrescentada;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public void setVelocidadeAtual(double velocidadeAtual) {
		this.velocidadeAtual = velocidadeAtual;
	}

	public double getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(double velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public double getVelocidadeAcrescentada() {
		return velocidadeAcrescentada;
	}

	public void setVelocidadeAcrescentada(double velocidadeAcrescentada) {
		this.velocidadeAcrescentada = velocidadeAcrescentada;
	}
	
	
	
}
