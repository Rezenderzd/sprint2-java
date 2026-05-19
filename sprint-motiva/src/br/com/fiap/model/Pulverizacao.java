package br.com.fiap.model;

public class Pulverizacao extends IntervencaoOperacional {
    @Override
    public String executarServico() {
        return "Precisa de serviço manual";
    }
}
