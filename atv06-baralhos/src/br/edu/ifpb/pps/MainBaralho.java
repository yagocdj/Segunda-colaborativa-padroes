package br.edu.ifpb.pps;

import br.edu.ifpb.pps.baralho.Baralho;
import br.edu.ifpb.pps.baralho.BaralhoTradicional;
import br.edu.ifpb.pps.carta.CartaTradicional;

// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.

public class MainBaralho
{
   // executa o aplicativo
   public static void main( String args[] )
   {
	  
      Baralho<CartaTradicional> baralho = new BaralhoTradicional();
      //myDeckOfCards.shuffle(); // coloca Cards em ordem aleatória
 
      
      // imprime todas as 52 cartas na ordem em que elas são distribuídas
      System.out.println( "Size: " + baralho.size());
      System.out.println( baralho);

      System.out.println( "Removendo 26 cartas a partir do topo do baralho: ");
      
      for ( int i = 0; i < 26; i++ )
      {
    	  System.out.printf( "%-20s\n",baralho.dealCard());
         // distribui e imprime 4 Cards
        // System.out.printf( "%-20s%-20s%-20s%-20s\n",
         //   myDeckOfCards.dealCard(), myDeckOfCards.dealCard(), 
         //   myDeckOfCards.dealCard(), myDeckOfCards.dealCard() );
      } // for final
      System.out.println( "Size: " + baralho.size());
      System.out.println( baralho);
      
   } // fim de main
} // fim da classe DeckOfCardsTest


