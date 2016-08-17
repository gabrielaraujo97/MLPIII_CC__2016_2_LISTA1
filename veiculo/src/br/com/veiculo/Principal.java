package br.com.veiculo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		Veiculo v = new Veiculo();
		VeiculoCarga vc = new VeiculoCarga();
		VeiculoPasseio vp = new VeiculoPasseio();
		Scanner leitor = new Scanner(System.in);
		int opcao = -1;

		System.out.println("Informe o tipo do Veiculo : ");
		System.out.println("1. CARGA");
		System.out.println("2. PASSEIO");
		opcao = leitor.nextInt();

		leitor.nextLine();// LIMPANDO BUFFER

		System.out.println("Informe o nome do proprietario : ");
		p.setNome(leitor.nextLine());

		if (opcao == 1) {
			vc.setProprietario(p);
		} else if (opcao == 2) {
			vp.setProprietario(p);
		}

		System.out.println("Por favor digite a placa do Veiculo : ");
		v.setPlaca(leitor.nextLine());

		System.out.println("Por favor digite a marca do Veiculo : ");
		v.setMarca(leitor.nextLine());

		System.out.println("Por favor digite o modelo do Veiculo : ");
		v.setModelo(leitor.nextLine());

		System.out.println("Por favor digite o ano do Veiculo : ");
		v.setAno(leitor.nextInt());

		leitor.nextLine();// LIMPANDO BUFFER

		System.out.println("Por favor digite o numero do Chassi : ");
		v.setChassi(leitor.nextLine());

		System.out.println("Por favor digite o valor do KM Rodado : ");
		v.setValorKmRodado(leitor.nextDouble());

		System.out.println("Por favor digite o valor do KM Inicial : ");
		v.setKmInicial(leitor.nextDouble());

		System.out.println("Por favor digite o valor do KM Final : ");
		v.setKmFinal(leitor.nextDouble());

		v.calculoValorLocacao();

		switch (opcao) {

		case 1: {

			System.out.println("Por favor digite a capacidade de carga : ");
			vc.setCapacidadeCarga(leitor.nextDouble());
			break;
		}
		case 2: {
			System.out.println("O carro tem ar-condicionado? (Sim/Não)");
			vp.setAr(leitor.next());
			leitor.nextLine();// LIMPANDO O BUFFER
			System.out.println("O carro possui quantas portas? ");
			vp.setQtdPortas(leitor.nextInt());
			break;
		}

		}

		System.out.println("--- FICHA DE ALUGUEL ---");

		if (opcao == 1) {
			System.out.println("PROPRIETARIO : " + vc.getProprietario().getNome());
		} else if (opcao == 2) {
			System.out.println("PROPRIETARIO : " + vp.getProprietario().getNome());
		}

		System.out.println("MARCA : " + v.getMarca());
		System.out.println("MODELO : " + v.getModelo());
		System.out.println("ANO : " + v.getAno());
		System.out.println("PLACA : " + v.getPlaca());
		System.out.println("CHASSI : " + v.getChassi());

		if (opcao == 1) {
			System.out.println("CAPACIDADE DE CARGA : " + vc.getCapacidadeCarga());
		} else if (opcao == 2) {
			System.out.println("AR-CONDICIONADO : " + vp.getAr());
			System.out.println("QUANTIDADE DE PORTAS : " + vp.getQtdPortas());
		}

		System.out.println("KM INICIAL : " + v.getKmInicial());
		System.out.println("KM FINAL : " + v.getKmFinal());
		System.out.println("KM RODADO : " + v.getValorKmRodado());
		System.out.println("");
		System.out.println("O seu valor final de locação será : R$ " + v.calculoValorLocacao());

		leitor.close();

	}

}
