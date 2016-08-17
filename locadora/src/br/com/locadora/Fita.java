package br.com.locadora;

public class Fita {

	private String titulo;
	private double precoDeLocacao;
	private String categoriaFilme;
	private String tipoFilme;
	private Autor autor;

	public double aluguel() {
		this.tipoFilme = tipoFilme;
		this.precoDeLocacao = precoDeLocacao;
		
		if (this.tipoFilme.equals("lancamento")) {
			return	precoDeLocacao = (precoDeLocacao * 0.2) + precoDeLocacao;
		}
		if (this.tipoFilme.equals("infantil")) {
			return precoDeLocacao = precoDeLocacao - (precoDeLocacao * 0.4);
		}
		return precoDeLocacao;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getPrecoDeLocacao() {
		return precoDeLocacao;
	}

	public void setPrecoDeLocacao(double precoDeLocacao) {
		this.precoDeLocacao = precoDeLocacao;
	}

	public String getCategoriaFilme() {
		return categoriaFilme;
	}

	public void setCategoriaFilme(String categoriaFilme) {
		this.categoriaFilme = categoriaFilme;
	}

	public String gettipoFilme() {
		return tipoFilme;
	}

	public void settipoFilme(String tipoFilme) {
		this.tipoFilme = tipoFilme;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	

}
