package baralho;

import carta.Carta;
import carta.CartaFactory;
import enums.CorCartaTradicional;
import enums.FaceCartaTradicional;
import enums.Naipe;
import enums.TipoBaralho;

public class BaralhoTradicionalBuilder implements BaralhoBuilder {

    private BaralhoTradicional baralhoTradicional;

    public BaralhoTradicionalBuilder() {
        this.baralhoTradicional = new BaralhoTradicional();
    }

    @Override
    public void redefinir() {
        this.baralhoTradicional = new BaralhoTradicional();
    }

    @Override
    public void montarCartas() {

        for (int contagem = 0; contagem < BaralhoTradicional.NUMERO_DE_CARTAS; contagem++) {
            Carta cartaTradicional = CartaFactory.criarCarta(TipoBaralho.TRADICIONAL);

            int indiceNaipe = contagem / BaralhoTradicional.NUMERO_DE_CARTAS_POR_NAIPE;
            int indiceFace = contagem % BaralhoTradicional.NUMERO_DE_CARTAS_POR_NAIPE;

            Naipe naipe = Naipe.values()[indiceNaipe];
            String simboloNaipe = naipe.getSymbol();
            FaceCartaTradicional face = FaceCartaTradicional.values()[indiceFace];

            cartaTradicional.setFace(face.getNome());
            cartaTradicional.setNaipe(naipe);
            cartaTradicional.setValor(face.getValor());

            cartaTradicional.setCores(simboloNaipe.equals("♥") || simboloNaipe.equals("♦")
                    ? CorCartaTradicional.VERMELHO
                    : CorCartaTradicional.PRETO);

            baralhoTradicional.adicionarCarta(cartaTradicional);
        }
    }

    @Override
    public BaralhoTradicional obterResultado() {
        return this.baralhoTradicional;
    }

    @Override
    public void definirNaipe() {
    }

    @Override
    public void montarCartasEspeciais() {
        throw new UnsupportedOperationException("Unimplemented method 'definirCartasEspeciais'");
    }

}
