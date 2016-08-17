package br.com.montagem;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Carro c = new Carro();

		System.out.println("Informe o modelo da ferrari : ");
		c.setModelo(leitor.nextLine());

		System.out.println("Informe a cor da ferrari : ");
		c.setCor(leitor.nextLine());
		
		c.ligar();
		
		System.out.println("Informe a velocidade maxima desse modelo : ");
		c.setVelocidadeMaxima(leitor.nextDouble());
		
		System.out.println("Informe a velocidade atual : ");
		c.setVelocidadeAtual(leitor.nextDouble());
		
		System.out.println("Informe a velocidade acrescentada : ");
		c.setVelocidadeAcrescentada(leitor.nextDouble());
		
		c.acelerar();
		
	}
}