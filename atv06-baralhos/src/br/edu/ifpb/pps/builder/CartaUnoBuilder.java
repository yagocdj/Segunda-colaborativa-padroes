package br.edu.ifpb.pps.builder;

import br.edu.ifpb.pps.carta.CartaUno;
import br.edu.ifpb.pps.enums.Cor;

public class CartaUnoBuilder implements CartaBuilder {
    private CartaUno resultado;

    @Override
    public void reset() {
        this.resultado = new CartaUno();
    }

    @Override
    public void definirCor(Cor cor) {
        resultado.setCor(cor);
    }

    @Override
    public void definirRepresentacaoEmString() {
        
    }

    @Override
    public void definirValor(int valor) {
        resultado.setValor(valor);
    }

    @Override
    public void definirFace() {
        // resultado.
    }

    public CartaUno obterResultado() {
        return resultado;
    }
}