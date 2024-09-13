package br.edu.ifpb.pps.builder;

import br.edu.ifpb.pps.enums.Cor;

public interface CartaBuilder {

    void reset();

    void definirCor(Cor cor);

    void definirRepresentacaoEmString();

    void definirValor(int valor);

    void definirFace(String face);
}