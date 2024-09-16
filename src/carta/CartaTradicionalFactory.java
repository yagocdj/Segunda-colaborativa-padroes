package carta;

public class CartaTradicionalFactory extends CartaCreator {

    @Override
    public Carta criarCarta() {
        return new CartaTradicional();
    }

}
