package baralho;


public class BaralhoDirector {

    private BaralhoBuilder baralhoBuilder;

    public BaralhoDirector(BaralhoBuilder baralhoBuilder) {
        this.baralhoBuilder = baralhoBuilder;
    }

    public void construirBaralho() {
        baralhoBuilder.definirFabricaDeCartas();
        baralhoBuilder.definirFaces();
        baralhoBuilder.definirQuantidadeDeCartas();
        baralhoBuilder.preencherBaralho();
    }

}
