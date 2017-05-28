package br.com.yahoo.mau_mss.designpatterns.model.behavioral.templatemethod;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: TemplateMethodPattern
 * Descrição:
 * Data: Feb 19, 2011, 6:25:00 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class TemplateMethodPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Template Method pattern’s intent is to define the skeleton " +
             "of a function in an operation, deferring some steps to its subclasses.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("TemplateMethod Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Construct concrete classes.
      buffer.append("Constructing concrete classes.");
      AbstractClass class1 = new ConcreteClass1();
      AbstractClass class2 = new ConcreteClass2();
      // Call template method.
      buffer.append("Calling template methods.");
      class1.templateMethod();
      class2.templateMethod();
      buffer.append("");
   }

}
