package org.devinhouse.superherois.model;

public class Vilao extends Personagem{
    public int tempoDePrisao;
    public Vilao(String nome, String superpoder, int tempoDePrisao){
        this.nome = nome;
        this.superpoder = superpoder;
        this.tempoDePrisao = tempoDePrisao;
    }
}
