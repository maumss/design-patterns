package br.com.yahoo.mau_mss.designpatterns.model.behavioral.observer;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteObserver
 * Descrição:
 * Data: Feb 19, 2011, 5:56:09 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteObserver implements ObserverIF {
  private ConcreteSubject subject; // Reference to subject

  @Override
  public void update() {
    if (subject == null) {
      subject = new ConcreteSubject();
    }
    Buffer.getInstance().append(" Yes!");
  }

}
