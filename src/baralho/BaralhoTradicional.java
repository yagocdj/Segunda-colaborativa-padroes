package baralho;

import java.util.Stack;

import carta.Carta;
import carta.CartaTradicionalFactory;

public class BaralhoTradicional extends Baralho {

    private final int NUMERO_DE_CARTAS_POR_NAIPE = 13;

    public BaralhoTradicional() {
    }

    public BaralhoTradicional(int numeroDeCartas, String[] faces,
            Stack<Carta> cartas) {
        super(numeroDeCartas, faces, cartas, new CartaTradicionalFactory());
    }

    public int getNumeroDeCartasPorNaipe() {
        return this.NUMERO_DE_CARTAS_POR_NAIPE;
    }

}