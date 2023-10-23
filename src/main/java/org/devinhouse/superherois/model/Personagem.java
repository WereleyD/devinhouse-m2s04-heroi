package org.devinhouse.superherois.model;

import java.util.Objects;

public abstract class Personagem implements Comparable<Personagem>{
    public String nome;
    public String superpoder;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Personagem personagem = (Personagem) o;
        return Objects.equals(nome, personagem.nome);
    }

    @Override
    public int compareTo(Personagem outroPersonagem) {
        return this.nome.compareTo(outroPersonagem.nome);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
