package br.uem.modelo.personagem;

/**
 * Created by Diego on 18/11/2014.
 */
public abstract class Antagonista extends Personagem{

    private static int PODER_ATAQUE = 2;

    /**
     * Todo ataque tem como reacao a defesa do personagem atacado. Desse modo, o metodo reagir()
     * do personagem atacado sera invocado.
     * O Antagonista tem o valor de dano dobrado ao atacar.
     * @param atacado Personagem escolhido para ser atacado
     * @return Mensagem de texto indicando se o personagem sofreu o ataque integralmente ou parcialmente
     * @see Personagem#reagir(int)
     */
    public String atacar (Personagem atacado){
        String saida = atacado.reagir(this.getDano()*PODER_ATAQUE);
        return saida;
    }
}