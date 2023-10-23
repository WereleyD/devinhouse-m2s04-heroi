package org.devinhouse.superherois.repository;

import org.devinhouse.superherois.model.Personagem;

import java.util.ArrayList;

public class PersonagemRepository {
    private ArrayList<Personagem> lista = new ArrayList<Personagem>();
    public void salvarPersonagem(Personagem p) {
        lista.add(p);
    }
    public void listarPersonagem() {
        for (Personagem p: lista
             ) {
            System.out.println(p.toString());
        }
    }
}
