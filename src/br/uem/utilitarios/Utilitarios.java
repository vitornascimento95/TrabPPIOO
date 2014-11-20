package br.uem.utilitarios;

/**
 * Created by Diego on 18/11/2014.
 */
import java.util.Random;

/**
 * Esta classe agrupa metodos uteis que podem ser utilizadas de maneira geral.
 *
 */

public class Utilitarios {
    /**
     * @return Retorna um valor booleano aleatoriamente
     */
    public static boolean getRandomBoolean() {
        Random random = new Random();
        return random.nextBoolean();
    }
}
