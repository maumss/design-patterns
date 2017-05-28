package br.com.yahoo.mau_mss.designpatterns.model.behavioral.memento;

/**
 * Título: Memento
 * Descrição:
 * Data: Feb 19, 2011, 5:41:32 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Memento {
  private boolean state;
  private String name;

  Memento(boolean parm1, String parm2) {
    this.state = parm1;
    this.name = parm2;
  }

  boolean getState() {
    return this.state;
  }

  String getName() {
    return this.name;
  }

}
