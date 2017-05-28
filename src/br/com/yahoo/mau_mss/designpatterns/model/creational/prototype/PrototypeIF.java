package br.com.yahoo.mau_mss.designpatterns.model.creational.prototype;

/**
 * Título: PrototypeIF
 * Descrição:
 * Data: Feb 18, 2011, 9:57:31 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public interface PrototypeIF {

  public PrototypeIF getClone(); // as opposed to Object.clone()

  public void action();
}
