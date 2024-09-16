package baralho;

import carta.Carta;

public class BaralhoTradicional extends Baralho {

    public BaralhoTradicional() {
    }

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