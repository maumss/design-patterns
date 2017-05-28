package br.com.yahoo.mau_mss.designpatterns.model.creational.factorymethod;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 *
 * @author mauricio.soares
 */
public class FactoryMethodPattern implements ShowPattern {

   @Override
   public String getAbout() {
      return "The Factory Method pattern’s (Constructor Virtual) intent is to define an interface for " +
             "creating an object but letting the subclass decide which class to " +
             "instantiate. In other words, the class defers instantiation to subclasses.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("FactoryMethod Pattern Demonstration.");
      buffer.append("---------------------------------------");
      // Create creator, which uses the FactoryMethod
      CreatorIF creator = new ConcreteCreator();
      // Create trade via factory method
      TradeIF trade = creator.factoryMethod();
      // Call trade action method
      trade.action();
      buffer.append("");
   }

}
