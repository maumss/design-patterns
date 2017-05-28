package br.com.yahoo.mau_mss.designpatterns.model.behavioral.chainofresponsibility;

import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;
 
/**
 * Título: ChainOfResponsibilityPattern
 * Descrição:
 * Data: Feb 19, 2011, 10:45:05 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ChainOfResponsibilityPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Chain of Responsibility pattern’s intent is to avoid " +
             "coupling the sender of a request to its receiver by giving "+
             "multiple objects a chance to handle the request.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Chain Of Responsibility Pattern Demonstration.");
      buffer.append("--------------------------------");
      try {
      // Create Equity Order request.
      buffer.append("Creating Equity Order request.");
      Request equityOrderRequest = new Request(Request.EQUITY_ORDER);
      // Create Bond Order request.
      buffer.append("Creating Bond Order request.");
      Request bondOrderRequest = new Request(Request.BOND_ORDER);
      // Create a request handler.
      buffer.append("Creating 1st handler.");
      HandlerIF handler = new ConcreteHandler1();
      // Process the Equity Order.
      buffer.append("Calling 1st handler with Equity Order.");
      handler.processRequest(equityOrderRequest);
      // Process the Bond Order.
      buffer.append("Calling 1st handler with Bond Order");
      handler.processRequest(bondOrderRequest);
      } catch (Exception e) {
        Logger.getLogger(ChainOfResponsibilityPattern.class.getName()).log(Level.SEVERE,
                 e.getMessage(), e);
      }
      buffer.append("");
   }

}
