package br.com.yahoo.mau_mss.designpatterns.model.structural.proxy;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ProxyPattern
 * Descrição:
 * Data: Feb 19, 2011, 10:27:21 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ProxyPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Proxy pattern’s intent is to provide a surrogate or " +
             "placeholder for another object to control access to it.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Proxy Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Create service proxy (instantiates service too)
      buffer.append("Creating proxy to service.");
      ServiceIF proxy = new Proxy();
      // Call action method on service via proxy
      buffer.append("Calling action method on proxy.");
      proxy.action();
      buffer.append("");
   }

}
