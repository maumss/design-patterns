package br.com.yahoo.mau_mss.designpatterns.model.structural.flyweight;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: FlyweightPattern
 * Descrição:
 * Data: Feb 18, 2011, 11:37:09 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class FlyweightPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Flyweight pattern’s intent is to utilize sharing to support " +
             "large numbers of finegrained objects in an efficient manner.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Flyweight Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Create states
      State stateF = new State(false);
      State stateT = new State(true);
      // Get reference to (and in doing so create) flyweight
      FlyweightIF myfwkey1 = FlyweightFactory.getFlyweight("myfwkey");
      // Get new reference to the same flyweight
      FlyweightIF myfwkey2 = FlyweightFactory.getFlyweight("myfwkey");
      // Call action on both references
      buffer.append("Call flyweight action with state=false");
      myfwkey1.action(stateF);
      buffer.append("Call flyweight action with state=true");
      myfwkey2.action(stateT);
      buffer.append("");
   }

}
