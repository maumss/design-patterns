package br.com.yahoo.mau_mss.designpatterns.model.behavioral.visitor;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteElementA
 * Descrição:
 * Data: Feb 19, 2011, 6:37:54 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteElementA implements ElementIF {

  @Override
  public void accept(VisitorIF parm) {
    parm.visitConcreteElementA(this);
  }

  public void operationA() {
    Buffer.getInstance().append("ConcreteElementA.operationA() called.");
  }
}
