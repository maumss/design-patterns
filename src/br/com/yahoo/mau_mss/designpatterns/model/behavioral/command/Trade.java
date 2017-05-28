package br.com.yahoo.mau_mss.designpatterns.model.behavioral.command;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: Trade
 * Descrição:
 * Data: Feb 19, 2011, 11:01:25 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Trade implements ReceiverIF {

  @Override
  public void action() {
    Buffer.getInstance().append("Trade.action() called.");
  }

}
