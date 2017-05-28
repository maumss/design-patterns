package br.com.yahoo.mau_mss.designpatterns.model.creational.prototype;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcretePrototype1
 * Descrição:
 * Data: Feb 18, 2011, 9:48:24 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcretePrototype1 implements PrototypeIF {

  public ConcretePrototype1() {
    Buffer.getInstance().append("ConcretePrototype1 constructed.");
  }

  @Override
  public PrototypeIF getClone() {
    // if required, put deep copy code here
    return new ConcretePrototype1();
  }

  @Override
  public void action() {
    Buffer.getInstance().append("ConcretePrototype1.action() called");
  }

}
