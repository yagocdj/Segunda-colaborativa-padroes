package baralho;

import carta.Carta;

import java.util.Collections;
import java.util.Stack;

public abstract class Baralho {
    protected Stack<Carta> cartas;

    Baralho() {
        cartas = new Stack<>();
    }

    public void shuffle(){
        Collections.shuffle(cartas);
    }

    public Carta dealCard() {
        if (!cartas.isEmpty()) {
            return cartas.pop();
        }

        return null;
    }

    public int size() {
        return cartas.size();
    }

    public boolean hasCard() {
        return !cartas.isEmpty();
    }

    @Override
    public abstract String toString();
}
