package br.com.yahoo.mau_mss.designpatterns.model.behavioral.command;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: Order
 * Descrição:
 * Data: Feb 19, 2011, 11:08:26 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Order implements ReceiverIF {

  @Override
  public void action() {
    Buffer.getInstance().append("Order.action() called.");
  }

}
