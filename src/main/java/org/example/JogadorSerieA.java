package org.example;

public class JogadorSerieA extends Jogador {
    public JogadorSerieA(Liga liga, String nome, int idade) {
        super(liga, nome, idade);
    }

    @Override
    public double calcularPrecoMercado() {
        double pesoLiga = liga.calcularPeso();
        double pesoDivisao = 1000000;
        double desvalorizacaoIdade = idade * 5000;
        return (pesoLiga * pesoDivisao) - desvalorizacaoIdade;
    }
}