package br.com.yahoo.mau_mss.designpatterns.model.behavioral.visitor;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteElementB
 * Descrição:
 * Data: Feb 19, 2011, 6:39:17 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteElementB implements ElementIF {

  @Override
  public void accept(VisitorIF parm) {
    parm.visitConcreteElementB(this);
  }

  public void operationB() {
    Buffer.getInstance().append("ConcreteElementB.operationB() called.");
  }

}
