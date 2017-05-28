package br.com.yahoo.mau_mss.designpatterns.model.structural.facade;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: SubSystem1
 * Descrição:
 * Data: Feb 18, 2011, 11:30:04 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class SubSystem1 {

  public void getCustomer() {
    // Place functionality here...
    Buffer.getInstance().append("SubSystem1.getCustomer() called.");
  }

  public void getSecurity() {
    // Place functionality here...
    Buffer.getInstance().append("SubSystem1.getSecurity() called.");
  }

  public void priceTransaction() {
    // Place functionality here...
    Buffer.getInstance().append("SubSystem1.priceTransaction() called.");
  }

}
