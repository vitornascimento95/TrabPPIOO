package br.uem.modelo.time;

import br.uem.modelo.personagem.Personagem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Diego on 18/11/2014.
 */
public class Time {

    private String nome;
    private List<Personagem> personagens;

    public Time(String nome, List<Personagem> personagens) {
        if (personagens.size() == 0) {
            throw new IllegalArgumentException("Informe ao menos um personagem para criar o time.");
        }
        this.personagens = personagens;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Personagem> getAll() {
        return Collections.unmodifiableList(this.personagens);
    }

    public List<Personagem> cloneTime() {

        List<Personagem> timeAdversario = new ArrayList<Personagem>();

        for (Personagem personagem : this.personagens) {
            timeAdversario.add(personagem);
        }

        return timeAdversario;
    }
}
