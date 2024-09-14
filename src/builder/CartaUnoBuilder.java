package builder;

import carta.CartaUno;
import enums.Cor;

public class CartaUnoBuilder implements CartaBuilder {
    private CartaUno resultado;

    @Override
    public void reset() {
        this.resultado = new CartaUno();
    }

    @Override
    public void definirCor(Cor cor) {
        //resultado.setCor(cor);
    }

    @Override
    public void definirRepresentacaoEmString() {
        
    }

    @Override
    public void definirValor(int valor) {
        //resultado.setValor(valor);
    }

    @Override
    public void definirFace(String face) {

    }

    public CartaUno obterResultado() {
        return resultado;
    }
}