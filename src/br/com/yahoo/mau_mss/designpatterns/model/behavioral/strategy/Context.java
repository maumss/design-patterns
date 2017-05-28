package br.com.yahoo.mau_mss.designpatterns.model.behavioral.strategy;

/**
 * Título: Context
 * Descrição:
 * Data: Feb 19, 2011, 6:23:12 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Context {
  // Reference to the strategy.
  StrategyIF strategy;

  // Register reference to strategy on construction.
  public Context(StrategyIF parm) {
    this.strategy = parm;
  }

  // Call strategy's method.
  public void contextInterface(String parm) {
    strategy.algorithmInterface(parm);
  }

}
