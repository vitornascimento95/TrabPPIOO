package br.uem.utilitarios;

import br.uem.modelo.personagem.Bruxa;
import br.uem.modelo.personagem.Mago;
import br.uem.modelo.personagem.Personagem;
import br.uem.modelo.personagem.Protagonista;

/**
 * Created by Diego on 21/11/2014.
 */
public class CombateUtils {

    public static Personagem personagemAtivo = null;
    public static int posAtivo = -1;
    public static Personagem personagemPassivel = null;
    public static int posPassivel = -1;

    public static int acao = -1;


    public static String executarAtaque() {

        return personagemAtivo.atacar(personagemPassivel);

    }

    public static String executaCura() {
        String incrementoVida = "";
        if (personagemAtivo.getClass() == Mago.class) {
            Mago m = (Mago) personagemAtivo;
            incrementoVida =  m.incrementarVida(personagemPassivel, m.calcularFatorIncremento()) + "";
        }
        if (personagemAtivo.getClass() == Bruxa.class) {
            Bruxa m = (Bruxa) personagemAtivo;
            incrementoVida = m.incrementarVida(personagemPassivel, m.calcularFatorIncremento()) + "";
        }

        return incrementoVida;
    }



    public static void zerarRodada() {
        personagemAtivo = null;
        posAtivo = -1;
        personagemPassivel = null;
        posPassivel = -1;
    }

}
