package baralho;

public interface BaralhoBuilder {

    void redefinir();

    void definirFabricaDeCartas();

    void definirFaces();

    void definirQuantidadeDeCartas();

    void preencherBaralho();

    Baralho obterResultado();
}
