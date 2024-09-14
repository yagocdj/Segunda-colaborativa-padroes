package carta;

import enums.Cor;

public abstract class Carta {
    private String face;
    private Cor cor;
    private int valor;

    public Carta(){}

    public Carta(String face, Cor cor, int valor) {
        this.face = face;
        this.cor = cor;
        this.valor = valor;
    }

    public String getFace() {
        return face;
    }

    public Cor getCor() {
        return cor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public abstract  String toString();
}
