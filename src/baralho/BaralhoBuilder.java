package baralho;

import factory.CartaFactory;

public interface BaralhoBuilder {

    void redefinir();

    void definirFabricaDeCartas(CartaFactory cartaFactory);

    void definirFaces(String... faces);

    void definirQuantidadeCartas(int quantidade);

    void preencherBaralho();

    Baralho obterResultado();
}
