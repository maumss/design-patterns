package br.com.yahoo.mau_mss.designpatterns.model.behavioral.state;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteState1
 * Descrição:
 * Data: Feb 19, 2011, 6:09:10 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteState1 implements StateIF {

  @Override
  public void handle() {
    Buffer.getInstance().append("ConcreteState1.handle() called.");
  }

}
