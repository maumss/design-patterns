package br.com.yahoo.mau_mss.designpatterns.model.creational.builder;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 *
 * @author mauricio.soares
 */
public class BuilderPattern implements ShowPattern {

   @Override
   public String getAbout() {
      return "The Builder pattern’s intent is to separate the construction of " +
             "a complex object from its representation so that the same " +
             "construction process can create different objects.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Builder Pattern Demonstration.");
      buffer.append("------------------------------");
      // Create builder
      buffer.append("Constructing builder.");
      BuilderIF builder = new ConcreteBuilder();
      // Create director
      buffer.append("Constructing director.");
      Director director = new Director(builder);
      // Construct customer via director
      buffer.append("Constructing customer.");
      director.construct();
      // Get customer via builder
      CustomerIF customer = builder.getCustomer();
      // Use customer method
      buffer.append("Calling action on the customer.");
      customer.action();
      buffer.append("");
   }

}
