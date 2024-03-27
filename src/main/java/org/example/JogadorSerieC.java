package org.example;

public class JogadorSerieC extends Jogador {
    public JogadorSerieC(Liga liga, String nome, int idade) {
        super(liga, nome, idade);
    }

    @Override
    public double calcularPrecoMercado() {
        double pesoLiga = liga.calcularPeso();
        double pesoDivisao = 100000;
        double desvalorizacaoIdade = idade * 5000;
        return (pesoLiga * pesoDivisao) - desvalorizacaoIdade;
    }
}