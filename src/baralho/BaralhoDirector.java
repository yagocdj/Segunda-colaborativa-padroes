package baralho;

import enums.TipoBaralho;

public class BaralhoDirector {

    private BaralhoBuilder baralhoBuilder;

    public BaralhoDirector(BaralhoBuilder baralhoBuilder) {
        this.baralhoBuilder = baralhoBuilder;
    }

    public void mudarDiretor(BaralhoBuilder baralhoBuilder) {
        this.baralhoBuilder = baralhoBuilder;
    }

    public void construirBaralho(TipoBaralho tipo) {
        baralhoBuilder.montarCartas();

        if (tipo == TipoBaralho.UNO) {
            baralhoBuilder.montarCartasEspeciais();
        }
    }

}
