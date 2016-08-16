package br.com.loja;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner leitor = new Scanner(System.in);
		Fatura f = new Fatura();

		System.out.println("Por favor digite o preço do produto : ");
		f.setprecoItem(leitor.nextDouble());

		System.out.println("OK!");

		System.out.println("Agora digite a quantidade de itens : ");
		f.setqtdItem(leitor.nextInt());

		f.getValorFatura();
		
		System.out.println("O valor da sua fatura será : " + f.getValorFatura());
		leitor.close();
	}

}
