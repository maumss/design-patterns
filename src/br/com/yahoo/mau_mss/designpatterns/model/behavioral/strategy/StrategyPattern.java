package br.com.yahoo.mau_mss.designpatterns.model.behavioral.strategy;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: StrategyPattern
 * Descrição:
 * Data: Feb 19, 2011, 6:17:36 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class StrategyPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Strategy pattern’s intent is to define a family of " +
             "functionality, encapsulate each one, and make them interchangeable.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Strategy Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Construct strategies.
      buffer.append("Constructing strategies.");
      StrategyIF strategy1 = new ConcreteStrategy1();
      StrategyIF strategy2 = new ConcreteStrategy2();
      // Construct contexts.
      buffer.append("Constructing contexts.");
      Context context1 = new Context(strategy1);
      Context context2 = new Context(strategy2);
      // Execute contextInterface.
      buffer.append("Constructing context interfaces.");
      context1.contextInterface("J2EE Unleashed");
      context2.contextInterface("J2EE Unleashed");
      context1.contextInterface("The Secret Commissions");
      context2.contextInterface("The Secret Commissions");
      buffer.append("");
   }

}
