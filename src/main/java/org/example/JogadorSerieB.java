package org.example;

public class JogadorSerieB extends Jogador {
    public JogadorSerieB(Liga liga, String nome, int idade) {
        super(liga, nome, idade);
    }

    @Override
    public double calcularPrecoMercado() {
        double pesoLiga = liga.calcularPeso();
        double pesoDivisao = 500000;
        double desvalorizacaoIdade = idade * 5000;
        return (pesoLiga * pesoDivisao) - desvalorizacaoIdade;
    }
}