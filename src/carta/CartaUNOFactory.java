package carta;

import enums.Cor;
import enums.Naipe;

public class CartaUNOFactory implements CartaFactory {

    public Carta criarCarta() {
        return new CartaUNO();
    }
}
