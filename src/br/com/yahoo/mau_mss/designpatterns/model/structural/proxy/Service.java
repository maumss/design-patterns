package br.com.yahoo.mau_mss.designpatterns.model.structural.proxy;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: Service
 * Descrição:
 * Data: Feb 19, 2011, 10:33:21 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Service implements ServiceIF {

  // Service to be proxied
  public Service() {
    Buffer.getInstance().append("Service constructed.");
  }

  @Override
  public void action() {
    Buffer.getInstance().append("Service.action() called.");
  }

}
