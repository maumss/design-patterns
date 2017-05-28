package br.com.yahoo.mau_mss.designpatterns.model.structural.decorator;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: DecoratorPattern
 * Descrição:
 * Data: Feb 18, 2011, 11:01:37 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class DecoratorPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "An alternative to subclassing to extend functionality, the " +
             "Decorator pattern’s intent is to attach flexible additional " +
             "responsibilities to an object dynamically.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Decorator Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Create object decorated with A
      buffer.append("Creating component decorated with A.");
      ComponentIF decorated1 = new ConcreteDecoratorA();
      // Call action on object decorated with A
      buffer.append("Calling action() on component decorated with A.");
      decorated1.action();
      // Create object decorated with B
      buffer.append("Creating component decorated with B.");
      ComponentIF decorated2 = new ConcreteDecoratorB();
      // Call action on object decorated with B
      buffer.append("Calling action() on component decorated with B.");
      decorated2.action();
      buffer.append("");
   }

}
