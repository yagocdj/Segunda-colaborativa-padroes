package builder;


import carta.CartaTradicional;
import enums.Cor;

public class CartaTradicionalBuilder implements CartaBuilder {
    private CartaTradicional resultado;

    @Override
    public void reset() {
    }

    @Override
    public void definirCor(Cor cor) {

    }


    @Override
    public void definirRepresentacaoEmString() {
    }

    @Override
    public void definirValor(int valor) {

    }

    @Override
    public void definirFace(String face) {

    }

    public void definirNaipe() {
        
    }

    public CartaTradicional obterResultado() {
        return resultado;
    }
}