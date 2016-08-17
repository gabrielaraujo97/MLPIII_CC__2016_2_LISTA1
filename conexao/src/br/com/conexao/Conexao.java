package br.com.conexao;

public class Conexao {

	/**
	 * Criando conexão, instanciando o objeto como estático.
	 */
	private static Conexao unicaInstancia = new Conexao();
	
	/**
	 * O construtor é privado para que não se consiga acessar a classe.
	 */
	private Conexao(){
		
	}

	/**
	 * Se não tiver nenhuma instancia ela retorna a variavel da instancia, se tiver alguma
	 * instancia ele retorna null, pois a conexão ja existe.
	 * @author GabrielAraujo,FelipeLima
	 */
	public static Conexao getInstance() {
		if(unicaInstancia == null)
		return unicaInstancia;
		
		return null;
	}
	
	
}
