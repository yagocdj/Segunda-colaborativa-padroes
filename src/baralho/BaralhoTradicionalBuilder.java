package baralho;

import carta.Carta;
import enums.Cor;
import enums.Naipe;
import factory.CartaFactory;

public class BaralhoTradicionalBuilder implements BaralhoBuilder {

    private BaralhoTradicional baralhoTradicional;
    private CartaFactory cartaFactory;
    private String[] faces;
    private int numeroDeCartas;
    private final int NUMERO_DE_CARTAS_POR_NAIPE = 13;

    public BaralhoTradicionalBuilder() {
        this.baralhoTradicional = new BaralhoTradicional();
    }

    @Override
    public void redefinir() {
        this.baralhoTradicional = new BaralhoTradicional();
    }

    @Override
    public void preencherBaralho() {

        for (int contagem = 0; contagem < numeroDeCartas; contagem++) {
            Carta cartaTradicional = cartaFactory.criarCarta();

            cartaTradicional.setFace(this.faces[contagem % NUMERO_DE_CARTAS_POR_NAIPE]);
            cartaTradicional.setNaipe(Naipe.values()[contagem / NUMERO_DE_CARTAS_POR_NAIPE]);
            cartaTradicional.setCores(
                    Naipe.values()[contagem / NUMERO_DE_CARTAS_POR_NAIPE]
                            .getSymbol().equals("♥")
                            || Naipe.values()[contagem / NUMERO_DE_CARTAS_POR_NAIPE]
                                    .getSymbol().equals("♦") ? Cor.VERMELHO : Cor.PRETO);

            baralhoTradicional.addCard(cartaTradicional);
        }
    }

    @Override
    public void definirFaces(String... faces) {
        this.faces = faces;
    }

    @Override
    public void definirQuantidadeCartas(int quantidade) {
        this.numeroDeCartas = quantidade;
    }

    @Override
    public BaralhoTradicional obterResultado() {
        return this.baralhoTradicional;
    }

    @Override
    public void definirFabricaDeCartas(CartaFactory cartaFactory) {
        this.cartaFactory = cartaFactory;
    }
}
