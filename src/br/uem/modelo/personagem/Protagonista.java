package br.uem.modelo.personagem;


public abstract class Protagonista extends Personagem{
	
	/**
	 * A implementacao deste metodo deve ser diferente para cada classe que o implementar
	 * @return Valor inteiro que deve ser passado ao metodo incrementarVida()
	 * @see Protagonista#incrementarVida(Personagem, int)
	 */
	public abstract int calcularFatorIncremento();

	/**
	 * Este metodo aumenta o valor do atributo quantidadeVida de um personagem de acordo com 
	 * o metodo calcularFatorIncremento()
	 * @param personagem Objeto que tera o valor quantidadeVida aumentado
	 * @param fatorIncremento Valor que deve ser acrescentado ao atributo quantidadeVida
	 * @see Protagonista#calcularFatorIncremento() 
	 */
	public int incrementarVida(Personagem personagem, int fatorIncremento){
		personagem.setQuantidadeVida(personagem.getQuantidadeVida()+fatorIncremento);
		return personagem.getQuantidadeVida()+ fatorIncremento;
	}

	
	/**
	 * O Protagonista causa um dano ao personagem atacado. 
	 * O metodo reagir() do personagem atacado sera invocado para definir o resultado do ataque.
	 * @param atacado Personagem escolhido para ser atacado
	 * @return Mensagem de texto indicando se o personagem sofreu o ataque integralmente ou nao.
	 * @see Personagem#reagir(int)
	 */
	public String atacar (Personagem atacado){
		String saida = atacado.reagir(this.getDano());
		return saida;
	}
}