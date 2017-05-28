package br.com.yahoo.mau_mss.designpatterns.model.creational.prototype;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: PrototypePattern
 * Descrição:
 * Data: Feb 18, 2011, 9:42:50 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class PrototypePattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Prototype pattern’s intent is to specify the kinds of objects " +
             "that need to be created using a prototypical instance, and to " +
             "then be able to create new objects by copying this prototype.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Prototype Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Create prototypes
      buffer.append("Constructing prototypes.");
      PrototypeIF prototype1 = new ConcretePrototype1();
      PrototypeIF prototype2 = new ConcretePrototype2();
      // Get clones from prototypes
      buffer.append("Constructing clones from prototypes.");
      PrototypeIF clone1 = prototype1.getClone();
      PrototypeIF clone2 = prototype2.getClone();
      // Call actions on the clones
      buffer.append("Calling actions on the clones.");
      clone1.action();
      clone2.action();
      buffer.append("");
   }

}
