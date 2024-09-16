package carta;

import enums.Cor;
import enums.Naipe;

public class CartaTradicionalFactory implements CartaFactory {

    @Override
    public Carta criarCarta() {
        return new CartaTradicional();
    }

}
