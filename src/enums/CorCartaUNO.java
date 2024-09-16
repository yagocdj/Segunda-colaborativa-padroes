package enums;

public enum CorCartaUNO implements Cor {
    VERMELHO("\u001B[31m", "vermelho"),
    AMARELO("\u001B[33m", "amarelo"),
    VERDE("\u001B[32m", "verde"),
    AZUL("\u001B[34m", "azul");

    private final String ansiCode;
    private final String value;

    CorCartaUNO(String ansiCode, String cor) {
        this.ansiCode = ansiCode;
        this.value = cor;
    }

    public String reset() {
        return "\u001B[0m";
    }

    public String ansiCode() {
        return this.ansiCode;
    }

    public String getValue() {
        return this.value;
    }
}
