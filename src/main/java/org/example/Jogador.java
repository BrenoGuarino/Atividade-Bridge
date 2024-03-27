package org.example;

public abstract class Jogador {
    protected Liga liga;
    protected String nome;
    protected int idade;

    public Jogador(Liga liga, String nome, int idade) {
        this.liga = liga;
        this.nome = nome;
        this.idade = idade;
    }

    public abstract double calcularPrecoMercado();
}