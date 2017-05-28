package br.com.yahoo.mau_mss.designpatterns.model.structural.flyweight;

/**
 * Título: State
 * Descrição:
 * Data: Feb 18, 2011, 11:40:25 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class State {
  private boolean state;

  public State(boolean parm) {
    this.state = parm;
  }

  public boolean getState() {
    return state;
  }

}
