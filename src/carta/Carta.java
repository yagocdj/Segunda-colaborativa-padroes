package carta;

import enums.Cor;
import enums.Naipe;

import java.util.List;

public abstract class Carta implements Cloneable {
    protected String face;
    protected List<Cor> cores; // Múltiplas cores
    protected int valor;

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

    public void setFace(String face) {
        this.face = face;
    }

    public List<Cor> getCores() {
        return cores;
    }

    public void setCores(Cor... cores) {
        this.cores = List.of(cores);
    }

    // Método para obter a primeira cor (caso seja uma lista com uma única cor)
    public Cor getCor() {
        return cores.get(0);
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public abstract void setNaipe(Naipe naipe);

    public abstract void setAcoes(String... acoes);

    public abstract Naipe getNaipe();

    public abstract String[] getAcoes();


    @Override
    public Carta clone() {
        try {
            return (Carta) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
