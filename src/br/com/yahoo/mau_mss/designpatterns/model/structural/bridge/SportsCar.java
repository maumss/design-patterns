package br.com.yahoo.mau_mss.designpatterns.model.structural.bridge;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: SportsCar
 * Descrição:
 * Data: Feb 18, 2011, 10:35:13 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class SportsCar implements AbstractionIF {
  ImplementorIF implementor = new SportsCarImplementor();

  public SportsCar() {
    Buffer.getInstance().append("SportsCar constructed.");
  }

  @Override
  public void action() {
    implementor.actionImplemented();
  }

}
