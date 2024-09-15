package baralho;

import factory.CartaFactory;

public class BaralhoTradicionalBuilder implements BaralhoBuilder {
    private BaralhoTradicional resultado;
    private CartaFactory cartaFactory;
    private String[] faces;
    private int numeroDeCartas;
    private int numeroDeCartasPorNaipe;

    public BaralhoTradicionalBuilder() { }

    @Override
    public void redefinir() {
        this.resultado = new BaralhoTradicional();
    }

    @Override
    public void preencherBaralho() {
        
    }

    @Override
    public BaralhoTradicional obterResultado() {
        return this.resultado;
    }

    @Override
    public void definirFaces(String... faces) {
        this.faces = faces;
    }

    @Override
    public void definirQuantidadeCartas(int quantidade) {
        this.numeroDeCartas = quantidade;
    }
}
