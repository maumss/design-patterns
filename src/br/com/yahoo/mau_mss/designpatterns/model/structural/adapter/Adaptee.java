package br.com.yahoo.mau_mss.designpatterns.model.structural.adapter;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: Adaptee
 * Descrição:
 * Data: Feb 18, 2011, 10:14:28 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Adaptee {

  public Adaptee() {
    Buffer.getInstance().append("Adaptee constructed.");
  }

  public String oldRequest() {
    return "Adaptee.oldRequest() called.";
  }

}
