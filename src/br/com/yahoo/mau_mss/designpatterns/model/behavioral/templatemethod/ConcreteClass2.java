package br.com.yahoo.mau_mss.designpatterns.model.behavioral.templatemethod;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteClass2
 * Descrição:
 * Data: Feb 19, 2011, 6:30:57 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteClass2 extends AbstractClass {

  @Override
  public void primitiveOperation1() {
    Buffer.getInstance().append("ConcreteClass2.primitiveOperation1() called.");
  }

  @Override
  public void primitiveOperationN() {
    Buffer.getInstance().append("ConcreteClass2.primitiveOperationN() called.");
  }

}
