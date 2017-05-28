package br.com.yahoo.mau_mss.designpatterns.model.structural.composite;

/**
 * Título: Component
 * Descrição:
 * Data: Feb 18, 2011, 10:46:00 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public abstract class Component {

  public abstract void display();

  public void add(Component c) {
    // override in concrete class;
  }

  public void remove(Component c) {
    // override in concrete class;
  }

  public Component getChild(int index) {
    return null;
  }

  public String getName() {
    return null;
  }

}
