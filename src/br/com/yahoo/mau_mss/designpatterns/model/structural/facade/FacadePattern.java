package br.com.yahoo.mau_mss.designpatterns.model.structural.facade;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: FacadePattern
 * Descrição:
 * Data: Feb 18, 2011, 11:26:26 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class FacadePattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Facade pattern’s intent is to provide a unified and " +
             "simplified interface to a set of interfaces in a subsystem.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Facade Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Construct and call Façade
      buffer.append("Constructing facade.");
      Facade façade = new Facade();
      buffer.append("Calling facade.processOrder().");
      façade.processOrder();
      buffer.append("");
   }

}
