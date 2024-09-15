package carta;

import enums.Cor;
import java.util.List;

public abstract class Carta {
    private String face;
    private List<Cor> cores; // Múltiplas cores
    private int valor;

    public Carta() {}

    // Construtor para múltiplas cores
    public Carta(String face, List<Cor> cores, int valor) {
        this.face = face;
        this.cores = cores;
        this.valor = valor;
    }

    // Construtor para uma única cor (compatibilidade com subclasses que usam uma cor)
    public Carta(String face, Cor cor, int valor) {
        this.face = face;
        this.cores = List.of(cor); // Armazenar como lista com um único elemento
        this.valor = valor;
    }

    public String getFace() {
        return face;
    }

    public List<Cor> getCores() {
        return cores;
    }

    public int getValor() {
        return valor;
    }

    // Método para obter a primeira cor (caso seja uma lista com uma única cor)
    public Cor getCor() {
        return cores.get(0);
    }

    @Override
    public abstract String toString();
}
