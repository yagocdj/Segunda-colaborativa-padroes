package enums;

public enum Naipe {
    HEARTS("♥"),
    DIAMONDS("♦"),
    CLUBS("♣"),
    SPADES("♠");

    private final String symbol;

    Naipe(String ansiCode) {
        this.symbol = ansiCode;
    }

    public String getSymbol() {
        return this.symbol;
    }

}
