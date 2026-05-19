package br.com.fiap.main;

import br.com.fiap.model.TrechoComSensor;
import br.com.fiap.model.TrechoRodovia;
import java.util.List;
import java.util.Random;

public class AtualizandoTrechos {

    public void atualizandoTrechos(List<TrechoRodovia> trechos){
        System.out.println("Atualizando crescimento");
        Random random = new Random();
        for (TrechoRodovia trecho: trechos){
            if(trecho instanceof TrechoComSensor){
                trecho.simularCrescimento();
            }else{
                trecho.registrarCrescimento(random.nextInt(10)); //deixei como random para não ficar padronizado os valores de crescimento
            }
        }
    }
}
