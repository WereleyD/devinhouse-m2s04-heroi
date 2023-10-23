package org.devinhouse.superherois.model;

public class Vilao extends Personagem{
    public int tempoDePrisao;
    public Vilao(String nome, String superpoder, int tempoDePrisao){
        this.nome = nome;
        this.superpoder = superpoder;
        this.tempoDePrisao = tempoDePrisao;
    }
    @Override
    public String toString() {
        return "\nVilão" +
                "\nNome: " + nome +
                "\nSuperpoder: " + superpoder +
                "\nTempo de prisão: " + tempoDePrisao;
    }
}
