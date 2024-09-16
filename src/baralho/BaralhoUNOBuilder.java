package baralho;

import carta.Carta;
import carta.CartaFactory;
import carta.CartaUNOFactory;

public class BaralhoUNOBuilder implements BaralhoBuilder {

    private BaralhoUNO baralhoUNO;
    private CartaFactory cartaFactory;
    private String[] faces;
    private int numeroDeCartasNumericasPorCor;
    private int numeroDeCartasEspeciaisPorCor;
    private int numeroDeCartasMulticor;

    @Override
    public void redefinir() {
        this.baralhoUNO = new BaralhoUNO();
    }

    @Override
    public void definirFabricaDeCartas() {
        this.cartaFactory = new CartaUNOFactory();
    }

    @Override
    public void definirFaces() {
        this.faces = new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "+2", "inverter", "pular", "+4",
                "trocaMaos", "curinga" };
    }

    @Override
    public void definirQuantidadeDeCartas() {
        this.numeroDeCartasNumericasPorCor = 20;
        this.numeroDeCartasEspeciaisPorCor = 8;
        this.numeroDeCartasMulticor = 4;
    }

    @Override
    public void preencherBaralho() {
        int contagemCartas;

        for (contagemCartas = 0; contagemCartas < this.numeroDeCartasNumericasPorCor;
            contagemCartas++) { }
    }

    @Override
    public Baralho obterResultado() {
        return this.baralhoUNO;
    }

}
