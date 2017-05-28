package br.com.yahoo.mau_mss.designpatterns.model.behavioral.strategy;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteStrategy2
 * Descrição:
 * Data: Feb 19, 2011, 6:21:44 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteStrategy2 implements StrategyIF {

  // Switch text beginning with "the".
  @Override
  public void algorithmInterface(String parm) {
    Buffer.getInstance().append((parm.toLowerCase().startsWith("the ")) ?
      parm.substring(4) + ", " + parm.substring(0,4) : parm);
  }

}
