package br.uem.modelo.personagem;

/**
 * Esta classe serve como um exemplo de implementacao
 * de uma classe concreta. 
 * Pode ser retirada do Projeto
 *
 */

public class Cavaleiro extends Antagonista{

	private static int DANO = 5;
	private static int RESISTENCIA = 10;
	
	@Override
	public int getDano() {
		return DANO;
	}

	@Override
	public int getResistencia() {
		return RESISTENCIA;
	}


}
