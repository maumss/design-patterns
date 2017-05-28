package br.com.yahoo.mau_mss.designpatterns.model.structural.facade;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: SubSystemN
 * Descrição:
 * Data: Feb 18, 2011, 11:31:28 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class SubSystemN {

  public void checkBalances() {
    // Place functionality here...
    Buffer.getInstance().append("SubSystemN.checkBalances() called.");
  }

  public void completeOrder() {
    // Place functionality here...
    Buffer.getInstance().append("SubSystemN.completeOrder() called.");
  }

}
