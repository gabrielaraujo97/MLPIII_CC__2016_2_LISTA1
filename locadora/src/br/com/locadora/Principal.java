package br.com.locadora;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Fita f = new Fita();
		Autor autor = new Autor();
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Informe o nome do filme : ");
		f.setTitulo(leitor.nextLine());
		
		System.out.println("Informe o nome do autor : ");
		autor.setNomeDoAutor(leitor.nextLine());
		
		f.setAutor(autor);
		
		System.out.println("Informe a categoria do filme : ");
		f.setCategoriaFilme(leitor.nextLine());
		
		System.out.println("Informe o tipo do filme (Lançamento/Infantil) : ");
		f.settipoFilme(leitor.nextLine());
		
		System.out.println("Informe o preço de locação : ");
		f.setPrecoDeLocacao(leitor.nextDouble());
		f.aluguel();
		
		System.out.println("--- FICHA DE ALUGUEL ---");
		System.out.println("");
		System.out.println(""+f.getTitulo());
		System.out.println(""+f.getAutor().getNomeDoAutor());
		System.out.println(""+f.getCategoriaFilme());
		System.out.println(""+f.gettipoFilme());
		System.out.println(""+f.getPrecoDeLocacao());
		
		leitor.close();
	}
	
}
