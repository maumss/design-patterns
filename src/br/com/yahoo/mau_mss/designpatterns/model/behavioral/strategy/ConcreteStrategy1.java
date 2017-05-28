package br.com.yahoo.mau_mss.designpatterns.model.behavioral.strategy;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteStrategy1
 * Descrição:
 * Data: Feb 19, 2011, 6:20:27 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteStrategy1 implements StrategyIF {

  // Switch text to all upper case.
  @Override
  public void algorithmInterface(String parm) {
    Buffer.getInstance().append(parm.toUpperCase());
  }

}
