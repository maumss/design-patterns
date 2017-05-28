package br.com.yahoo.mau_mss.designpatterns.model.behavioral.state;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteState2
 * Descrição:
 * Data: Feb 19, 2011, 6:10:18 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteState2 implements StateIF {

  @Override
  public void handle() {
    Buffer.getInstance().append("ConcreteState2.handle() called.");
  }

}
