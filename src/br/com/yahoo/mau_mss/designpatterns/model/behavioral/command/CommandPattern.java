package br.com.yahoo.mau_mss.designpatterns.model.behavioral.command;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: CommandPattern
 * Descrição:
 * Data: Feb 19, 2011, 10:58:12 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class CommandPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Command pattern’s intent is to encapsulate a request as an " +
             "object, thereby letting you parameterize clients with different " +
             "requests, queue or log requests, and support rollback types of operations.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Command Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Create receiver objects.
      buffer.append("Creating receivers.");
      ReceiverIF order = new Order();
      ReceiverIF trade = new Trade();
      // Create commands passing in receiver objects.
      buffer.append("Creating commands.");
      CommandAbstract cmdOrder = new ConcreteCommand(order);
      CommandAbstract cmdTrade = new ConcreteCommand(trade);
      // Create invokers.
      buffer.append("Creating invokers.");
      Invoker invOrder = new Invoker();
      Invoker invTrade = new Invoker();
      // Storing commands in invokers respectively.
      buffer.append("Storing commands in invokers.");
      invOrder.storeCommand(cmdOrder);
      invTrade.storeCommand(cmdTrade);
      // Call invoke on the invoker to execute the command.
      buffer.append("Invoking the invokers.");
      invOrder.invoke();
      invTrade.invoke();
      buffer.append("");
   }

}
