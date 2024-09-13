package br.edu.ifpb.pps.carta;

import br.edu.ifpb.pps.enums.Cor;

public class CartaUno {
    private String face;
    private Cor cor;
    private int valor;

    public CartaUno() {
    };

    public CartaUno(String face, int valor, Cor cor) {
        this.face = face;
        this.valor = valor;
        this.cor = cor;
    }

    public String getFace() {
        return face;
    }

    public int getValor() {
        return valor;
    }

    public Cor getCor() {
        return cor;
    }
    
    public void setCor(Cor cor){
        this.cor = cor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return face + " de cor " + cor;
    }
}