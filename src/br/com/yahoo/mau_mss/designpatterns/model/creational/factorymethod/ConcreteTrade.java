package br.com.yahoo.mau_mss.designpatterns.model.creational.factorymethod;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 *
 * @author mauricio.soares
 */
public class ConcreteTrade implements TradeIF {

   @Override
   public void action() {
      Buffer.getInstance().append("ConcreteTrade.action() called.");
   }
}
