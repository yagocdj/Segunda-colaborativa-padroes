package baralho;

public interface BaralhoBuilder {

    void redefinir();

    void definirFabricaDeCartas();

    void definirFaces(String... faces);

    void definirQuantidadeDeCartas();

    void preencherBaralho();

    Baralho obterResultado();
}
