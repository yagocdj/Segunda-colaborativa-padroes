package br.edu.ifpb.pps.builder;

import br.edu.ifpb.pps.carta.CartaTradicional;

public class CartaTradicionalBuilder implements CartaBuilder {
    private CartaTradicional resultado;

    @Override
    public void reset() {
    }

    @Override
    public void definirCor() {
    }

    @Override
    public void definirRepresentacaoEmString() {
    }

    @Override
    public void definirValor() {
    }

    @Override
    public void definirFace() {

    }

    public void definirNaipe() {
        
    }

    public CartaTradicional obterResultado() {
        return resultado;
    }
}