package baralho;

import carta.Carta;
import carta.CartaCreator;
import carta.CartaUNOFactory;
import carta.FaceUNO;
import enums.CorCartaUNO;
import enums.FaceEspecialUNO;
import enums.FaceNumericaUNO;

public class BaralhoUNOBuilder implements BaralhoBuilder {

    private BaralhoUNO baralhoUNO;
    private CartaCreator cartaFactory;

    public BaralhoUNOBuilder() {
        this.baralhoUNO = new BaralhoUNO();
    }

    @Override
    public void redefinir() {
        this.baralhoUNO = new BaralhoUNO();
    }

    @Override
    public void definirFabricaDeCartas() {
        this.cartaFactory = new CartaUNOFactory();
    }

    @Override
    public void montarCartas() {
        for (var cor : CorCartaUNO.values()) {
            for (int i = 0; i < BaralhoUNO.NUMERO_DE_CARTAS_NUMERICAS_POR_COR; i++) {
                Carta cartaUNO = cartaFactory.criarCarta();

                FaceNumericaUNO face = FaceNumericaUNO.values()[i];

                cartaUNO.setFace(face.getNome());
                cartaUNO.setValor(face.getValor());
                cartaUNO.setCores(cor);

                baralhoUNO.adicionarCarta(cartaUNO);
                baralhoUNO.adicionarCarta(cartaUNO.clone());
            }
        }
    }

    @Override
    public void montarCartasEspeciais() {
        for (var cor : CorCartaUNO.values()) {
            for (int i = 0; i < BaralhoUNO.NUMERO_DE_CARTAS_ESPECIAIS_POR_COR; i++) {
                Carta cartaUNO = cartaFactory.criarCarta();

                FaceEspecialUNO face = FaceEspecialUNO.values()[i];

                cartaUNO.setFace(face.getNome());
                cartaUNO.setValor(face.getValor());
                cartaUNO.setCores(cor);

                baralhoUNO.adicionarCarta(cartaUNO);
                baralhoUNO.adicionarCarta(cartaUNO.clone());
            }
        }
    }

    // private void adicionarCartasPorCor(CorCartaUNO cor, int numeroDeCartas) {
    //     for (int i = 0; i < numeroDeCartas; i++) {
    //         Carta cartaUNO = cartaFactory.criarCarta();

    //         FaceUNO face = FaceUNO.values()[i];
    //     }
    // }

    @Override
    public Baralho obterResultado() {
        return this.baralhoUNO;
    }

    @Override
    public void definirNaipe() {
        throw new UnsupportedOperationException("Operação não suportada para esse tipo de baralho.");
    }

}
