package br.com.yahoo.mau_mss.designpatterns.model.behavioral.state;

/**
 * Título: Context
 * Descrição:
 * Data: Feb 19, 2011, 6:13:50 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Context {
  // Initial state.
  private StateIF state = new ConcreteState1();

  // Request operation.
  public void request() {
    state.handle();
  }

  // Switch states
  public void changeState() {
    if (state instanceof ConcreteState1)
      state = new ConcreteState2();
    else
      state = new ConcreteState1();
  }
}
