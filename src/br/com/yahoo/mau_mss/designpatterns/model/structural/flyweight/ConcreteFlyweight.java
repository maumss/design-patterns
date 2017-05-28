package br.com.yahoo.mau_mss.designpatterns.model.structural.flyweight;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteFlyweight
 * Descrição:
 * Data: Feb 18, 2011, 11:41:24 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteFlyweight implements FlyweightIF {
  // Add state to the concrete flyweight.
  private boolean state;

  public ConcreteFlyweight(State parm) {
    this.state = parm.getState();
  }

  @Override
  public void action(State parm) {
    // Display internal state and state passed by client.
    Buffer.getInstance().append("ConcreteFlyweight.action(" +
      parm.getState()+") called.");
    this.state = parm.getState();
    Buffer.getInstance().append("ConcreteFlyweight.state = " +
      this.state);
  }

}
