package carta;

import java.util.List;

import enums.Cor;

public class CartaUno extends Carta {

    private List<Cor> cores;
    
    public CartaUno() { }

    public CartaUno(String face, int valor, Cor cor) {
        super(face, cor, valor);
        this.cores = List.of(cor);
    }

    public CartaUno(String face, int valor, List<Cor> cores) {
        super(face, cores, valor);
    }

    public List<Cor> getCores() {
        return cores;
    }

    @Override
    public String toString() {
        if (cores.size() == 1) {
            return String.format("%6s", super.getFace()) + " de cor " + cores.get(0).ansiCode() + cores.get(0) + Cor.RESET.ansiCode() + ", valor " + super.getValor();
        } else {
            StringBuilder coresString = new StringBuilder();
            for (Cor cor : cores) {
                coresString.append(cor.ansiCode()).append(cor).append(Cor.RESET.ansiCode()).append(" ");
            }
            return String.format("%6s", super.getFace()) + " com cores " + coresString.toString() + ", valor " + super.getValor();
        }
    }
}