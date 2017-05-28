package br.com.yahoo.mau_mss.designpatterns.model.structural.decorator;

/**
 * Título: Decorator
 * Descrição:
 * Data: Feb 18, 2011, 11:21:57 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Decorator implements ComponentIF {
  ComponentIF component = new ConcreteComponent();

  @Override
  public void action() {
    component.action();
  }

}
