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
        
    
        // System.out.println(baralhoTradicional);
        System.out.println(baralhoUNO);

//        // imprime todas as 52 cartas na ordem em que elas são distribuídas
//        System.out.println( "Size: " + baralho.size());
//        System.out.println( baralho);
//
//        System.out.println( "Removendo 26 cartas a partir do topo do baralho: ");
//
//        for ( int i = 0; i < 26; i++ )
//        {
//            System.out.printf( "%-20s\n",baralho.dealCard());
//            // distribui e imprime 4 Cards
//            // System.out.printf( "%-20s%-20s%-20s%-20s\n",
//            //   myDeckOfCards.dealCard(), myDeckOfCards.dealCard(),
//            //   myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
//        }
//        System.out.println( "Size: " + baralho.size());
//        System.out.println( baralho);

    }
}