package br.edu.ifpb.pps.baralho;

import java.util.Stack;

import br.edu.ifpb.pps.builder.CartaBuilder;
import br.edu.ifpb.pps.builder.CartaDirector;

public abstract class Baralho<T> {
   protected Stack<T> cartas;
   protected CartaDirector cartaDirector;
   protected CartaBuilder cartaBuilder;

   public abstract void shuffle();

   public T dealCard(){
      if (!cartas.isEmpty()){
         return cartas.pop();
      }

      return null;
   }

   public int size(){
      return cartas.size();
   }

   public boolean hasCard() {
      return !cartas.isEmpty();
   }

   @Override
   public abstract String toString();
}
