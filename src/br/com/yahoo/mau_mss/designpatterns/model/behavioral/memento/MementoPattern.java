package br.com.yahoo.mau_mss.designpatterns.model.behavioral.memento;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: MementoPattern
 * Descrição:
 * Data: Feb 19, 2011, 5:36:58 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class MementoPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Memento pattern’s intent is to capture and internalize an " +
              "object’s internal state so that objects can be restored to " +
              "this state later. It must do this without violating encapsulation.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Memento Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Run the caretaker
      Caretaker.run();
      buffer.append("");
   }

}
