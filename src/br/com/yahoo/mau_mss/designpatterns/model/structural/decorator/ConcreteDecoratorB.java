package br.com.yahoo.mau_mss.designpatterns.model.structural.decorator;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteDecoratorB
 * Descrição:
 * Data: Feb 18, 2011, 11:23:29 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteDecoratorB extends Decorator {

  @Override
  public void action() {
    super.action();
    Buffer.getInstance().append("ConcreteDecoratorB.action() called.");
    addedMethod();
  }

  private void addedMethod() {
    Buffer.getInstance().append("ConcreteDecoratorB.addedMethod() called.");
  }

}
