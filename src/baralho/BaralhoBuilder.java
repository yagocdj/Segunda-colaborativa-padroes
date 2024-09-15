package baralho;

public interface BaralhoBuilder {
    void redefinir();
    void definirFaces(String... faces);
    void definirQuantidadeCartas(int quantidade);
    void preencherBaralho();
    Baralho obterResultado();
}
