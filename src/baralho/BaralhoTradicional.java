package baralho;

import carta.CartaTradicional;
import enums.Cor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaralhoTradicional extends Baralho<CartaTradicional> {
    private List<CartaTradicional> deck; // ArrayList usado como uma pilha de objetos
    private final int NUMBER_OF_CARDS = 52; // número constante de Cards
    private final int NUMBER_OF_CARDS_BY_SUIT = 13; // SUIT é Naipe
    private Random randomNumbers; // gerador de número aleatório

    // construtor preenche baralho de cartas
    public BaralhoTradicional() {
        String[] faces = { "As", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Valete", "Dama", "Rei" };
        // String naipe[] = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] naipe = { "\u2665", "\u2666", "\u2663", "\u2660" };

        deck = new ArrayList<CartaTradicional>(); // cria List de objetos Card
        randomNumbers = new Random(); // cria gerador de número aleatório

        // preenche baralho com objetos Card
        for (int count = 0; count < NUMBER_OF_CARDS; count++) {
            deck.add(
                    new CartaTradicional(
                            faces[count % NUMBER_OF_CARDS_BY_SUIT],
                            naipe[count / NUMBER_OF_CARDS_BY_SUIT],
                            naipe[count / NUMBER_OF_CARDS_BY_SUIT].equals("\u2665")
                                    || naipe[count / NUMBER_OF_CARDS_BY_SUIT].equals("\u2666")
                                            ? Cor.VERMELHO
                                            : Cor.PRETO));
        }
    } // fim do construtor DeckOfCards

    public boolean hasCard() {
        return deck.size() > 0;
    }

    // embaralha as cartas com um algoritmo de uma passagem
    public void shuffle() {
        // depois de embaralhar, a distribuição deve iniciar em deck[ 0 ] novamente
        // para cada Card, seleciona outro Card aleatório e os compara
        for (int first = 0; first < deck.size(); first++) {
            // seleciona um número aleatório entre 0 e 51
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);

            // compara Card atual com Card aleatoriamente selecionado
            CartaTradicional temp = deck.remove(second);
            deck.add(0, temp);
        } // for final
    } // fim do método shuffle

    // retira uma carta, do topo do monte
    public CartaTradicional dealCard() {
        return deck.remove(deck.size() - 1); // retorna Card atual no array
    } // fim do método dealCard

    public int size() {
        return deck.size();
    }

    public String toString() {
        String s = "";
        int column = 0;
        for (CartaTradicional card : deck) {
            column++;
            s += card.toString() + "   ";
            if (column % 4 == 0) {
                s += "\n";
                column = 0;
            }
        }
        return s;
    }
}