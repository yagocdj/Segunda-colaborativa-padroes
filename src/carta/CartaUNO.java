package carta;

import java.util.List;

import enums.Cor;
import enums.Naipe;

public class CartaUNO extends Carta {

    private String[] acoes;

    public CartaUNO() {
    }

    public CartaUNO(String face, int valor, Cor cor) {
        super(face, cor, valor);
    }

    public CartaUNO(String face, int valor, List<Cor> cores) {
        super(face, cores, valor);
    }

    public List<Cor> getCores() {
        return cores;
    }

    @Override
    public Naipe getNaipe() {
        throw new UnsupportedOperationException(
                "Operação não suportada para esse tipo de baralho.");
    }

    @Override
    public String[] getAcoes() {
        return this.acoes;
    }

    @Override
    public void setNaipe(Naipe naipe) {
        throw new UnsupportedOperationException(
                "Operação não suportada para esse tipo de baralho.");
    }

    @Override
    public void setAcoes(String... acoes) {
        this.acoes = acoes;
    }

    @Override
    public String toString() {
        if (cores.size() == 1) {
            return String.format("%6s", super.getFace()) +
                    " de cor " + cores.get(0).ansiCode()
                    + cores.get(0) + Cor.RESET.ansiCode()
                    + ", valor " + super.getValor();
        } else {
            StringBuilder coresString = new StringBuilder();
            for (Cor cor : cores) {
                coresString.append(
                        cor.ansiCode()).append(cor).append(Cor.RESET.ansiCode()).append(" ");
            }
            return String.format("%6s", super.getFace()) +
                    " com cores " + coresString.toString() + ", valor " + super.getValor();
        }
    }
}