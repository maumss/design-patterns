package br.com.yahoo.mau_mss.designpatterns.model.structural.bridge;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: SportsCarImplementor
 * Descrição:
 * Data: Feb 18, 2011, 10:31:37 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class SportsCarImplementor implements ImplementorIF {

  public SportsCarImplementor() {
    Buffer.getInstance().append("SportsCarImplementor constructed.");
  }

  @Override
  public void actionImplemented() {
    Buffer.getInstance().append("SportsCarImplementor.actionImplemented() called.");
  }

}
