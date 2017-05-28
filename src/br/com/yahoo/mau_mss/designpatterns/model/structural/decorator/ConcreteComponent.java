package br.com.yahoo.mau_mss.designpatterns.model.structural.decorator;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteComponent
 * Descrição:
 * Data: Feb 18, 2011, 11:19:03 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteComponent implements ComponentIF {

  @Override
  public void action() {
    Buffer.getInstance().append("ConcreteComponent.action() called.");
  }

}
