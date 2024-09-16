package enums;

public enum CorCartaTradicional implements Cor {
    VERMELHO("\u001B[31m", "vermelho"),
    PRETO("\u001B[30m", "preto");

    private final String ansiCode;
    private final String value;

    CorCartaTradicional(String ansiCode, String cor) {
        this.ansiCode = ansiCode;
        this.value = cor;
    }

    public String reset(){
        return "\u001B[0m";
    }

    public String ansiCode() {
        return this.ansiCode;
    }

    public String getValue() {
        return this.value;
    }
}
