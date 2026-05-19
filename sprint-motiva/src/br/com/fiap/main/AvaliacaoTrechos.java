package br.com.fiap.main;

import br.com.fiap.model.Pulverizacao;
import br.com.fiap.model.RocadaMecanizada;
import br.com.fiap.model.TrechoRodovia;

import java.util.List;

public class AvaliacaoTrechos {
    public void exibindoTrechos(List<TrechoRodovia> trechos){
        RocadaMecanizada tratores = new RocadaMecanizada();
        Pulverizacao manual = new Pulverizacao();
        for(TrechoRodovia trecho: trechos){
            System.out.printf("\nTrecho: %s, Km inicial: %d, Km final: %d\n", trecho.getNomeTrecho(), trecho.getQuilometroInicial(), trecho.getQuilometroFinal(), trecho.getNivelVegetacaoEmCm());
            if(trecho.getNivelVegetacaoEmCm()>=30){
                if(trecho.getTipoClima().equalsIgnoreCase("umido")){
                    System.out.printf("%s, grama em %.2f cm\n\n", tratores.executarServico(), trecho.getNivelVegetacaoEmCm());
                }else if(trecho.getTipoClima().equalsIgnoreCase("seco")){
                    System.out.printf("%s, grama em %.2f cm\n\n", manual.executarServico(),trecho.getNivelVegetacaoEmCm());
                }else{
                    System.out.println("Tipo de clima inválido, não tem como saber qual serviço utilizar.");
                }
            }else{
                System.out.printf("Por enquanto não é necessário nenhum serviço, grama em %.2f cm\n\n", trecho.getNivelVegetacaoEmCm());
            }
        }
    }

}
