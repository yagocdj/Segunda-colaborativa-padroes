package baralho;

import carta.Carta;
import enums.Cor;
import enums.Naipe;
import factory.CartaFactory;
import factory.CartaTradicionalFactory;

public class BaralhoTradicionalBuilder implements BaralhoBuilder {

    private BaralhoTradicional baralhoTradicional;
    private CartaFactory cartaFactory;
    private String[] faces;
    private int numeroDeCartas;
    private int numeroDeCartasPorNaipe;

    public BaralhoTradicionalBuilder() {
        this.baralhoTradicional = new BaralhoTradicional();
        this.numeroDeCartasPorNaipe = baralhoTradicional.getNumeroDeCartasPorNaipe();
    }

    @Override
    public void redefinir() {
        this.baralhoTradicional = new BaralhoTradicional();
    }

    @Override
    public void preencherBaralho() {

        for (int contagem = 0; contagem < numeroDeCartas; contagem++) {
            Carta cartaTradicional = cartaFactory.criarCarta();

            cartaTradicional.setFace(this.faces[contagem % numeroDeCartasPorNaipe]);
            cartaTradicional.setNaipe(Naipe.values()[contagem / numeroDeCartasPorNaipe]);
            
            // Todas as cartas tradicionais possuem valor 0
            cartaTradicional.setValor(0);
            
            cartaTradicional.setCores(
                    Naipe.values()[contagem / numeroDeCartasPorNaipe]
                            .getSymbol().equals("♥")
                            || Naipe.values()[contagem / numeroDeCartasPorNaipe]
                                    .getSymbol().equals("♦") ? Cor.VERMELHO : Cor.PRETO);

            baralhoTradicional.addCard(cartaTradicional);
        }
    }

    @Override
    public void definirFaces(String... faces) {
        this.faces = new String[] { "As", "2", "3", "4", "5", "6",
                "7", "8", "9", "10", "Valete", "Dama", "Rei" };
    }

    @Override
    public void definirQuantidadeDeCartas() {
        this.numeroDeCartas = 52;
    }

    @Override
    public BaralhoTradicional obterResultado() {
        return this.baralhoTradicional;
    }

    @Override
    public void definirFabricaDeCartas() {
        this.cartaFactory = new CartaTradicionalFactory();
    }
}
