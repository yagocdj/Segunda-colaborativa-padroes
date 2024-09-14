package builder;

import enums.Cor;

public interface CartaBuilder {

    void reset();

    void definirCor(Cor cor);

    void definirRepresentacaoEmString();

    void definirValor(int valor);

    void definirFace(String face);
}