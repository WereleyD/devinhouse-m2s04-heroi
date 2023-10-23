package org.devinhouse.superherois.model;

public class Heroi extends Personagem{
    public String nomeVidaReal;
    public Heroi(String nome, String superpoder, String nomeVidaReal){
        this.nome = nome;
        this.superpoder = superpoder;
        this.nomeVidaReal = nomeVidaReal;
    }
}
