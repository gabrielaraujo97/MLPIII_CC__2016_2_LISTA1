package br.com.conexao;

public class Conexao {

	/**
	 * Criando conex�o, instanciando o objeto como est�tico.
	 */
	private static Conexao unicaInstancia = new Conexao();
	
	/**
	 * O construtor � privado para que n�o se consiga acessar a classe.
	 */
	private Conexao(){
		
	}

	/**
	 * Se n�o tiver nenhuma instancia ela retorna a variavel da instancia, se tiver alguma
	 * instancia ele retorna null, pois a conex�o ja existe.
	 * @author GabrielAraujo,FelipeLima
	 */
	public static Conexao getInstance() {
		if(unicaInstancia == null)
		return unicaInstancia;
		
		return null;
	}
	
	
}
