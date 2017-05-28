package br.com.yahoo.mau_mss.designpatterns.model.structural.decorator;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteDecoratorA
 * Descrição:
 * Data: Feb 18, 2011, 11:20:27 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteDecoratorA extends Decorator {
  String addedVariable;

  @Override
  public void action() {
    super.action();
    Buffer.getInstance().append("ConcreteDecoratorA.action() called.");
    addedVariable = "extra";
    Buffer.getInstance().append("ConcreteDecoratorA.addedVariable="+addedVariable);
  }

}
