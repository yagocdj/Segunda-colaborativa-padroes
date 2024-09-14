package br.edu.ifpb.pps.carta;

import br.edu.ifpb.pps.enums.Cor;

// Classe Card representa uma carta de baralho.

public class CartaTradicional {
    private String face; // face da carta ("Ace", "Deuce", ...)
    private String naipe; // naipe da carta ("Hearts", "Diamonds", ...)
    private Cor cor;
    private int valor;

    // construtor de dois argumentos inicializa face e naipe da carta
    public CartaTradicional(String face, String naipe, int valor) {
        this(face, naipe, valor, Cor.PRETO);
    } // fim do construtor Card de dois argumentos

    // construtor de dois argumentos inicializa face e naipe da carta
    public CartaTradicional(String face, String naipe, int valor, Cor cor) {
        this.face = face; // inicializa face da carta
        this.naipe = naipe; // inicializa naipe da carta
        this.valor = valor;
        this.cor = cor;
    } // fim do construtor Card de dois argumentos

    public String getFace() {
        return face;
    }

    public int getValor() {
        return valor;
    }

    public Cor getCor() {
        return cor;
    }

    public String getNaipe() {
        return naipe;
    }

    public void setValue(int value) {
        this.valor = value;
    }

    // retorna representação String de Card
    public String toString() {
        return String.format("%6s", face) + " de " + cor.ansiCode() + naipe + Cor.RESET.ansiCode() + ", valor " + valor;
    }

}
