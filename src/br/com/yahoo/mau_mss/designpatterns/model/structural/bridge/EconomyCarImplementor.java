package br.com.yahoo.mau_mss.designpatterns.model.structural.bridge;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: EconomyCarImplementor
 * Descrição:
 * Data: Feb 18, 2011, 10:32:54 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class EconomyCarImplementor implements ImplementorIF {

  public EconomyCarImplementor() {
    Buffer.getInstance().append("EconomyCarImplementor constructed.");
  }

  @Override
  public void actionImplemented() {
    Buffer.getInstance().append("EconomyCarImplementor.actionImplemented() called.");
  }

}
