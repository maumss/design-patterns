package br.com.yahoo.mau_mss.designpatterns.model.structural.flyweight;

/**
 * Título: FlyweightIF
 * Descrição:
 * Data: Feb 18, 2011, 11:39:38 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public interface FlyweightIF {

  // method to receive and act on extrinsic state.
  public void action(State parm);
}
