package baralho;

import enums.TipoBaralho;
import factory.CartaTradicionalFactory;

public class BaralhoDirector {

    private BaralhoBuilder baralhoBuilder;

    public BaralhoDirector(BaralhoBuilder baralhoBuilder) {
        this.baralhoBuilder = baralhoBuilder;
    }

    public void construirBaralho(TipoBaralho tipoBaralho) {
        if (tipoBaralho == TipoBaralho.TRADICIONAL) {
            baralhoBuilder.definirFabricaDeCartas(new CartaTradicionalFactory());
            baralhoBuilder.definirFaces("As", "2", "3", "4", "5", "6",
                    "7", "8", "9", "10", "Valete", "Dama", "Rei");
            baralhoBuilder.definirQuantidadeCartas(52);
            baralhoBuilder.preencherBaralho();
        } else if (tipoBaralho == TipoBaralho.UNO) {
            // baralhoBuilder
        }
    }

}
