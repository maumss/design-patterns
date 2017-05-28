package br.com.yahoo.mau_mss.designpatterns.model.behavioral.templatemethod;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: AbstractClass
 * Descrição:
 * Data: Feb 19, 2011, 6:28:16 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public abstract class AbstractClass {

  public void templateMethod() {
    Buffer.getInstance().append("AbstractClass.templateMethod() called.");
    primitiveOperation1();
    primitiveOperationN();
  }

  public abstract void primitiveOperation1();

  public abstract void primitiveOperationN();

}
