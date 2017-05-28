package br.com.yahoo.mau_mss.designpatterns.model.behavioral.templatemethod;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteClass1
 * Descrição:
 * Data: Feb 19, 2011, 6:29:40 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteClass1 extends AbstractClass {

  @Override
  public void primitiveOperation1() {
    Buffer.getInstance().append("ConcreteClass1.primitiveOperation1() called.");
  }

  @Override
  public void primitiveOperationN() {
    Buffer.getInstance().append("ConcreteClass1.primitiveOperationN() called.");
  }

}
