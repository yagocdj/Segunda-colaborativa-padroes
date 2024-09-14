package baralho;

import carta.Carta;
import carta.CartaTradicional;
import enums.Cor;
import enums.Naipe;

public class BaralhoTradicional extends Baralho {

    public BaralhoTradicional() {
        String[] faces = { "As", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Valete", "Dama", "Rei" };

        int NUMBER_OF_CARDS = 52;
        int NUMBER_OF_CARDS_BY_SUIT = 13;

        for (int count = 0; count < NUMBER_OF_CARDS; count++) {
            cartas.add(
                    new CartaTradicional(
                            faces[count % NUMBER_OF_CARDS_BY_SUIT],
                            Naipe.values()[count / NUMBER_OF_CARDS_BY_SUIT],
                            Naipe.values()[count / NUMBER_OF_CARDS_BY_SUIT].getSymbol().equals("♥")
                                    || Naipe.values()[count / NUMBER_OF_CARDS_BY_SUIT].getSymbol().equals("♦")
                                            ? Cor.VERMELHO
                                            : Cor.PRETO));
        }
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