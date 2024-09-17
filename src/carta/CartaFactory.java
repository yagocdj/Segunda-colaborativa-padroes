package carta;

import enums.TipoBaralho;

public class CartaFactory {
    public static Carta criarCarta(TipoBaralho tipo) {
        switch (tipo) {
            case TRADICIONAL:
                return new CartaTradicional();
            case UNO:
                return new CartaUNO();
            default:
                throw new IllegalArgumentException("Tipo de baralho inválido");
        }
    }
}
