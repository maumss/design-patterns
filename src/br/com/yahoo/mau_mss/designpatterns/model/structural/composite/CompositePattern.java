package br.com.yahoo.mau_mss.designpatterns.model.structural.composite;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: CompositePattern
 * Descrição:
 * Data: Feb 18, 2011, 10:43:02 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class CompositePattern implements ShowPattern {
  
  @Override
   public String getAbout() {
      return "The Composite pattern’s intent is to allow clients to operate in "+
             "a generic manner on objects that may or may not represent a " +
             "hierarchy of objects.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Composite Pattern Demonstration.");
      buffer.append("--------------------------------");
      buffer.append("Creating leaves, branches and trunk");
      // Create leaves
      Component leaf1 = new Leaf(" leaf#1");
      Component leaf2 = new Leaf(" leaf#2");
      Component leaf3 = new Leaf(" leaf#3");
      // Create branches
      Component branch1 = new Composite(" branch1");
      Component branch2 = new Composite(" branch2");
      // Create trunk
      Component trunk = new Composite("trunk");
      // Add leaf1 and leaf2 to branch1
      branch1.add(leaf1);
      branch1.add(leaf2);
      // Add branch1 to trunk
      trunk.add(branch1);
      // Add leaf3 to branch2
      branch2.add(leaf3);
      // Add branch2 to trunk
      trunk.add(branch2);
      // Show trunk composition
      buffer.append("Displaying trunk composition:");
      trunk.display();
      // Remove branch1 and branch2 from trunk
      trunk.remove(branch1);
      trunk.remove(branch2);
      // Show trunk composition now
      buffer.append("Displaying trunk composition now:");
      trunk.display();
      buffer.append("");
   }

}
