import baralho.Baralho;
import baralho.BaralhoBuilder;
import baralho.BaralhoDirector;
import baralho.BaralhoTradicionalBuilder;
import baralho.BaralhoUNOBuilder;
import enums.TipoBaralho;

public class Main {
    public static void main(String[] args)
    {
        BaralhoBuilder baralhoTradicionalBuilder = new BaralhoTradicionalBuilder();
        BaralhoDirector baralhoDirector = new BaralhoDirector(baralhoTradicionalBuilder);
        baralhoDirector.construirBaralho(TipoBaralho.TRADICIONAL);

        Baralho baralhoTradicional = baralhoTradicionalBuilder.obterResultado();

        BaralhoBuilder baralhoUNOBuilder = new BaralhoUNOBuilder();
        baralhoDirector.mudarDiretor(baralhoUNOBuilder);
        baralhoDirector.construirBaralho(TipoBaralho.UNO);
        
        Baralho baralhoUNO = baralhoUNOBuilder.obterResultado();
        
    
        System.out.println(baralhoTradicional);
        System.out.println("\n--------------------------------------------------------------\n");
        System.out.println(baralhoUNO);
    }
}