package factory;

import carta.Carta;
import carta.CartaTradicional;
import enums.Cor;
import enums.Naipe;

public class CartaTradicionalFactory implements CartaFactory {

    public Carta criarCarta(String face, int valor, Cor cor, Naipe naipe) {
        return new CartaTradicional(face, naipe, cor);
    }

    @Override
    public Carta criarCarta(String face, int valor, Cor cor) {
        throw new UnsupportedOperationException("É necessário fornecer um naipe para cartas tradicionais.");
    }
}
