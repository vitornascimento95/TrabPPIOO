package br.uem.modelo.time;

import br.uem.modelo.personagem.*;
import com.sun.org.apache.bcel.internal.generic.NEW;

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
        this.personagens = personagens;
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public List<Personagem> getAll() {
        return Collections.unmodifiableList(this.personagens);
    }

    public String getNomeById(int i){
        return this.personagens.get(i).getNome();
    }

    public void insertPersonagem(Personagem p){
        this.personagens.add(p);
    }

    public Time cloneTime() {

        Time timeAd = new Time("Time Adversário", new ArrayList<Personagem>());

        for (Personagem personagem : this.personagens) {

            if (personagem.getClass().equals(Guerreiro.class)) {
                Guerreiro g = new Guerreiro();
                g.setNome("Dark " + personagem.getNome());
                timeAd.insertPersonagem(g);
            }
            if (personagem.getClass().equals(Cavaleiro.class)) {
                Cavaleiro c = new Cavaleiro();
                c.setNome("Dark " + personagem.getNome());
                timeAd.insertPersonagem(c);
            }
            if (personagem.getClass().equals(Mago.class)) {
                Mago m = new Mago();
                m.setNome("Dark " + personagem.getNome());
                timeAd.insertPersonagem(m);
            }
            if (personagem.getClass().equals(Bruxa.class)) {
                Bruxa b = new Bruxa();
                b.setNome("Dark " + personagem.getNome());
                timeAd.insertPersonagem(b);
            }


        }
        return timeAd;
    }
}
