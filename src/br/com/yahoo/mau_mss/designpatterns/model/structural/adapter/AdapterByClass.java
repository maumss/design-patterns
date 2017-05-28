package br.com.yahoo.mau_mss.designpatterns.model.structural.adapter;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: AdapterByClass
 * Descrição:
 * Data: Feb 18, 2011, 10:16:04 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class AdapterByClass extends Adaptee implements TargetIF {

  public AdapterByClass() {
    Buffer.getInstance().append("AdapterByClass constructed.");
  }

  @Override
  public String newRequest() {
    return oldRequest();
  }

}
