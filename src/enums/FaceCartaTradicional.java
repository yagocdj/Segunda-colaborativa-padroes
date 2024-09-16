package enums;

public enum FaceCartaTradicional {
    AS("A", 0),
    DOIS("2", 0),
    TRES("3", 0),
    QUATRO("4", 0),
    CINCO("5", 0),
    SEIS("6", 0),
    SETE("7", 0),
    OITO("8", 0),
    NOVE("9", 0),
    DEZ("10", 0),
    VALETE("J", 0),
    DAMA("Q", 0),
    REI("K", 0);

    private final String nome;
    private final int valor;

    FaceCartaTradicional(String nome, int valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getValor() {
        return valor;
    }
}
