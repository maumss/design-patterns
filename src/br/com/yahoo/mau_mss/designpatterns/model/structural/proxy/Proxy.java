package br.com.yahoo.mau_mss.designpatterns.model.structural.proxy;

/**
 * Título: Proxy
 * Descrição:
 * Data: Feb 19, 2011, 10:32:15 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Proxy implements ServiceIF {
  // Proxy to be the service
  private Service service = new Service();

  @Override
  public void action() {
    service.action();
  }

}
