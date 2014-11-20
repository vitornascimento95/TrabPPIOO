package br.uem.modelo.personagem;

import br.uem.utilitarios.Utilitarios;

/**
 * Created by Diego on 18/11/2014.
 */
public abstract class Personagem{

    private String nome;
    private int quantidadeVida;

    /**
     * @return O valor do atributo dano da classe concreta
     */
    public abstract int getDano();

    /**
     * @return O valor do atributo resistencia da classe concreta
     */
    public abstract int getResistencia();

    public abstract String atacar (Personagem atacado);

    /**
     * Metodo invocado quando um personagem sofre ataque.
     * Este metodo decide aleatoriamente se o personagem atacado
     * tera a quantidade de vida aumentada apos o ataque
     * conforme o valor definido pelo atributo resistencia.
     *
     * @param reducao Valor que deve ser subtraido de quantidadeVida
     * @return Mensagem de texto indicando se o personagem atacado sofreu integralmente o dano do atacante ou se houve uma resistencia.
     * @see Protagonista#atacar(Personagem)
     * @see Antagonista#atacar(Personagem)
     */
    public String reagir(int reducao){
        String saida;
        boolean defesa = Utilitarios.getRandomBoolean();
        //sofre o dano integralmente
        sofrerDano(reducao) ; //diminui a quantidade de vida
        saida = this.getNome() + "sofreu dano";

        //depois de sofrer o dano verifica aleatoriamente se haverá uma recuperação
        if (defesa){
            this.setQuantidadeVida(this.getResistencia()); //ameniza o ataque aumentando um pouco mais o valor do tempo de vida.
            saida = saida + " mas se defendeu";
        }
        return saida;
    }

    public void sofrerDano(int reducao){
        this.quantidadeVida = this.quantidadeVida - reducao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadeVida() {
        return quantidadeVida;
    }
    public void setQuantidadeVida(int quantidadeVida) {
        this.quantidadeVida = quantidadeVida;
    }
}