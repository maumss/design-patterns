package br.com.yahoo.mau_mss.designpatterns.model.creational.prototype;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcretePrototype2
 * Descrição:
 * Data: Feb 18, 2011, 9:56:09 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcretePrototype2 implements PrototypeIF {

  public ConcretePrototype2() {
    Buffer.getInstance().append("ConcretePrototype2 constructed.");
  }

  @Override
  public PrototypeIF getClone() {
    // if required, put deep copy code here
    return new ConcretePrototype1();
  }

  @Override
  public void action() {
    Buffer.getInstance().append("ConcretePrototype2.action() called.");
  }

}
