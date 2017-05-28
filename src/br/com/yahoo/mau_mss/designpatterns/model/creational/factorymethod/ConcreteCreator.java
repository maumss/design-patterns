package br.com.yahoo.mau_mss.designpatterns.model.creational.factorymethod;

/**
 *
 * @author mauricio.soares
 */
public class ConcreteCreator implements CreatorIF {

   @Override
   public TradeIF factoryMethod() {
      return new ConcreteTrade();
   }
}
