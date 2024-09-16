package baralho;

import carta.Carta;
import carta.CartaFactory;

import java.util.Collections;
import java.util.Stack;

public abstract class Baralho {
    
    protected CartaFactory cartaFactory;
    protected int numeroDeCartas;
    protected String[] faces;
    protected Stack<Carta> cartas;

    Baralho() {
        cartas = new Stack<>();
    }

    Baralho(int numeroDeCartas, String[] faces, Stack<Carta> cartas, CartaFactory cartaFactory) {
        this.numeroDeCartas = numeroDeCartas;
        this.faces = faces;
        this.cartas = cartas;

        if (cartaFactory != null) {
            this.cartaFactory = cartaFactory;
        }
    }

    public void embaralhar() {
        Collections.shuffle(cartas);
    }

    public Carta distribuirCarta() {
        if (!cartas.isEmpty()) {
            return cartas.pop();
        }

        return null;
    }

    public int obterTamanho() {
        return cartas.size();
    }

    public boolean temCarta() {
        return !cartas.isEmpty();
    }

    public void adicionarCarta(Carta carta) {
        this.cartas.add(carta);
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        int column = 0;
        for (Carta card : cartas) {
            column++;
            s.append(card.toString()).append("   ");
            if (column % 4 == 0) {
                s.append("\n");
                column = 0;
            }
        }
        return s.toString();
    }
}
