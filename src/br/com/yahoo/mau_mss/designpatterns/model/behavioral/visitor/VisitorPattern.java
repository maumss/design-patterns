package br.com.yahoo.mau_mss.designpatterns.model.behavioral.visitor;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: VisitorPattern
 * Descrição:
 * Data: Feb 19, 2011, 6:34:30 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class VisitorPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Visitor pattern’s intent is to represent an operation to be " +
             "performed on elements of an object structure.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Visitor Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Construct list of elements.
      buffer.append("Constructing two elements.");
      ElementIF[] elements = new ElementIF[2];
      elements[0] = new ConcreteElementA();
      elements[1] = new ConcreteElementB();
      // Construct object structure.
      buffer.append("Constructing object structure.");
      ObjectStructure objectStructure = new ObjectStructure(elements);
      // Visit elements in object structure.
      buffer.append("Visiting elements in object structure.");
      objectStructure.visitElements();
      buffer.append("");
   }

}
