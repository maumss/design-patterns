package br.com.yahoo.mau_mss.designpatterns.model.structural.adapter;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: AdapterByObject
 * Descrição:
 * Data: Feb 18, 2011, 10:17:14 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class AdapterByObject implements TargetIF {
  private Adaptee adaptee;

  public AdapterByObject() {
    Buffer.getInstance().append("AdapterByObject constructed.");
  }

  @Override
  public String newRequest() {
    // Create an Adaptee object if it doesn't exist yet
    if (adaptee == null) {
      adaptee = new Adaptee();
    }
    return adaptee.oldRequest();
  }

}
