package baralho;

import carta.Carta;
import carta.CartaFactory;
import enums.CorCartaUNO;
import enums.FaceEspecialUNO;
import enums.FaceNumericaUNO;
import enums.TipoBaralho;

public class BaralhoUNOBuilder implements BaralhoBuilder {

    private BaralhoUNO baralhoUNO;

    public BaralhoUNOBuilder() {
        this.baralhoUNO = new BaralhoUNO();
    }

    @Override
    public void redefinir() {
        this.baralhoUNO = new BaralhoUNO();
    }

    @Override
    public void montarCartas() {
        for (var cor : CorCartaUNO.values()) {
            for (int i = 0; i < BaralhoUNO.NUMERO_DE_CARTAS_NUMERICAS_POR_COR; i++) {
                Carta cartaUNO = CartaFactory.criarCarta(TipoBaralho.UNO);

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
        montarCartasEspeciaisDeUmaCor();
        montarCartasEspeciasMulticor();
        criarCartaTrocaMao();
    }

    private void montarCartasEspeciaisDeUmaCor() {
        for (var cor : CorCartaUNO.values()) {
            for (int i = 0; i < BaralhoUNO.NUMERO_DE_CARTAS_ESPECIAIS_POR_COR; i++) {
                Carta cartaUNO = CartaFactory.criarCarta(TipoBaralho.UNO);

                FaceEspecialUNO face = FaceEspecialUNO.values()[i];

                cartaUNO.setFace(face.getNome());
                cartaUNO.setValor(face.getValor());
                cartaUNO.setCores(cor);

                baralhoUNO.adicionarCarta(cartaUNO);
                baralhoUNO.adicionarCarta(cartaUNO.clone());
            }
        }
    }

    private void montarCartasEspeciasMulticor() {
        final int indiceInicialDasFacesMulticor = 3;
        final int indiceFinalDasFacesMulticor = 5;

        // o número de cartas especiais é 8, então o loop é dividido por 2
        for (int i = 0; i < BaralhoUNO.NUMERO_DE_CARTAS_MULTICOR / 2; i++) {
            for (int j = indiceInicialDasFacesMulticor; j < indiceFinalDasFacesMulticor; j++) {
                Carta cartaUNO = CartaFactory.criarCarta(TipoBaralho.UNO);

                FaceEspecialUNO face = FaceEspecialUNO.values()[j];

                cartaUNO.setFace(face.getNome());
                cartaUNO.setValor(face.getValor());
                cartaUNO.setCores(CorCartaUNO.values());

                baralhoUNO.adicionarCarta(cartaUNO);
            }
        }
    }

    private void criarCartaTrocaMao() {
        Carta cartaUNO = CartaFactory.criarCarta(TipoBaralho.UNO);
        
        FaceEspecialUNO face = FaceEspecialUNO.TROCAR_MAO;

        cartaUNO.setFace(face.getNome());
        cartaUNO.setValor(face.getValor());
        cartaUNO.setCores(CorCartaUNO.values());

        baralhoUNO.adicionarCarta(cartaUNO);
    }

    @Override
    public Baralho obterResultado() {
        return this.baralhoUNO;
    }

    @Override
    public void definirNaipe() {
        throw new UnsupportedOperationException("Operação não suportada para esse tipo de baralho.");
    }

}
