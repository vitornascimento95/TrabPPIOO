package br.uem.modelo.personagem;

/**
 * Esta classe serve como um exemplo de implementacao
 * de uma classe concreta. 
 * Pode ser retirada do Projeto
 *
 */

public class Mago extends Protagonista{

	private static int DANO = 10;
	private static int RESISTENCIA = 5;
	
	@Override
	public int getDano() {
		return DANO;
	}

	@Override
	public int getResistencia() {
		return RESISTENCIA;
	}


	@Override
	public int calcularFatorIncremento() {
		return 0;
	}
}
