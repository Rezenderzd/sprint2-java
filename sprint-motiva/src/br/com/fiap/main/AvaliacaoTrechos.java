package br.com.fiap.main;

import br.com.fiap.model.Pulverizacao;
import br.com.fiap.model.RocadaMecanizada;
import br.com.fiap.model.TrechoRodovia;

import java.util.List;

public class AvaliacaoTrechos {
    public void exibindoTrechos(List<TrechoRodovia> trechos){

        for(TrechoRodovia trecho: trechos){
            System.out.printf("\nTrecho: %s, Km inicial: %d, Km final: %d\n", trecho.getNomeTrecho(), trecho.getQuilometroInicial(), trecho.getQuilometroFinal(), trecho.getNivelVegetacaoEmCm());
            if(trecho.getNivelVegetacaoEmCm()>=30){
                avaliandoEquipeIdeal(trecho.getTipoClima(), trecho.getNivelVegetacaoEmCm());
            }else{
                System.out.printf("Por enquanto não é necessário nenhum serviço, grama em %.2f cm\n\n", trecho.getNivelVegetacaoEmCm());
            }
        }
    }

    public void avaliandoEquipeIdeal(String clima, double nivelVegetacao){
        RocadaMecanizada tratores = new RocadaMecanizada();
        Pulverizacao manual = new Pulverizacao();
        if(clima.equalsIgnoreCase("umido")){
            System.out.printf("%s, grama em %.2f cm\n\n", tratores.executarServico(), nivelVegetacao);
            return;
        }
        if(clima.equalsIgnoreCase("seco")){
            System.out.printf("%s, grama em %.2f cm\n\n", manual.executarServico(),nivelVegetacao);
            return;
        }
        System.out.println("Tipo de clima inválido, não tem como saber qual serviço utilizar.");
    }

}
