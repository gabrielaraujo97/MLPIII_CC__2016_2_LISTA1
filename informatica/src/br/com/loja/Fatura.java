package br.com.loja;

public class Fatura {

	private String numero;
	private String descricao;
	private int qtdItem;
	private double precoItem;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getqtdItem() {
		return qtdItem;
	}

	public void setqtdItem(int qtdItem) {
		this.qtdItem = qtdItem;
	}

	public double getprecoItem() {
		return precoItem;
	}

	public void setprecoItem(double precoItem) {
		this.precoItem = precoItem;
	}

	public double getValorFatura() {
		this.qtdItem = qtdItem;
		this.precoItem = precoItem;

		if (precoItem == 0)
			return 0.0;
		
		if ((qtdItem * precoItem) <= 0)
			return 0.0;

		return qtdItem * precoItem;
	}

}
