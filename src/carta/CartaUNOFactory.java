package carta;

public class CartaUNOFactory extends CartaCreator {

    @Override
    public Carta criarCarta() {
        return new CartaUNO();
    }
}
