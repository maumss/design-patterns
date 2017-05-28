package br.com.yahoo.mau_mss.designpatterns.model.structural.bridge;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: BridgePattern
 * Descrição:
 * Data: Feb 18, 2011, 10:28:38 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class BridgePattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Bridge pattern’s intent is to decouple the functional " +
             "abstraction from the implementation so that the two can be " +
             "changed and can vary independently.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Bridge Pattern Demonstration.");
      buffer.append("--------------------------------");
      buffer.append("Constructing SportsCar and EconomyCar.");
      AbstractionIF car1 = new SportsCar ();
      AbstractionIF car2 = new EconomyCar();
      buffer.append("Calling action() on SportsCar and EconomyCar.");
      car1.action();
      car2.action();
      buffer.append("");
   }

}
