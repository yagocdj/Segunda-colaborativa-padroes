package baralho;

public interface BaralhoBuilder {

    void redefinir();

    void montarCartas();

    void montarCartasEspeciais();

    Baralho obterResultado();

    void definirNaipe();
}
