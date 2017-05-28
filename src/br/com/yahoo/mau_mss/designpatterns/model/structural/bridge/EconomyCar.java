package br.com.yahoo.mau_mss.designpatterns.model.structural.bridge;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: EconomyCar
 * Descrição:
 * Data: Feb 18, 2011, 10:36:55 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class EconomyCar implements AbstractionIF {
  ImplementorIF implementor = new EconomyCarImplementor();

  public EconomyCar() {
    Buffer.getInstance().append("EconomyCar constructed.");
  }

  @Override
  public void action() {
    implementor.actionImplemented();
  }

}
