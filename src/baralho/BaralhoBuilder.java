package baralho;

public interface BaralhoBuilder {

    void redefinir();

    void definirFabricaDeCartas();

    void montarCartas();

    void montarCartasEspeciais();

    Baralho obterResultado();

    void definirNaipe();
}
