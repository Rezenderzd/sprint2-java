package br.com.fiap.main;


import br.com.fiap.model.TrechoComSensor;
import br.com.fiap.model.TrechoRodovia;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main  (String[] args){
        int kmInicial;
        int kmFinal;
        double nivelVegetacaoEmCm;

        List<TrechoRodovia> trechos = new ArrayList<>();
        AtualizandoTrechos atualizacao = new AtualizandoTrechos();
        AvaliacaoTrechos analise = new AvaliacaoTrechos();

        kmInicial = 10;
        kmFinal = 15;
        nivelVegetacaoEmCm = 16;

        TrechoRodovia trecho1 = new TrechoRodovia("Br", kmInicial, kmFinal, nivelVegetacaoEmCm, "umido");
        trechos.add(trecho1);

        kmInicial = 20;
        kmFinal = 30;
        nivelVegetacaoEmCm = 19;
        TrechoRodovia trecho2 = new TrechoRodovia("Rodo Anel", kmInicial, kmFinal, nivelVegetacaoEmCm, "seco");
        trechos.add(trecho2);

        kmInicial = 15;
        kmFinal = 20;
        nivelVegetacaoEmCm = 18;
        TrechoComSensor trecho3 = new TrechoComSensor("Motiva Sorocabana", kmInicial, kmFinal, nivelVegetacaoEmCm, "umido");
        trechos.add(trecho3);

        kmInicial  = 30;
        kmFinal = 40;
        nivelVegetacaoEmCm = 22;
        TrechoComSensor trecho4 = new TrechoComSensor("Rodovia Presidente Dutra", kmInicial, kmFinal, nivelVegetacaoEmCm, "seco");
        trechos.add(trecho4);

        atualizacao.atualizandoTrechos(trechos);

        trechos.sort(Comparator.comparing(TrechoRodovia::getNivelVegetacaoEmCm).reversed());

        analise.exibindoTrechos(trechos);
    }
}
