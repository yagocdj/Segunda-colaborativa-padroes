package baralho;

import java.util.Stack;

import carta.Carta;

public class BaralhoTradicional extends Baralho {

    static final int NUMERO_DE_CARTAS = 52;
    static final int NUMERO_DE_CARTAS_POR_NAIPE = 13;

    public BaralhoTradicional() {
    }

    public BaralhoTradicional(int numeroDeCartas, String[] faces, Stack<Carta> cartas) {
        super(numeroDeCartas, faces, cartas);
    }

}