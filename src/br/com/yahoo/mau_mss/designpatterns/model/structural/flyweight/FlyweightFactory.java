package br.com.yahoo.mau_mss.designpatterns.model.structural.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: FlyweightFactory
 * Descrição:
 * Data: Feb 18, 2011, 11:43:30 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class FlyweightFactory {
  private static Map<String,FlyweightIF> map = new HashMap<String,FlyweightIF>();

  public static FlyweightIF getFlyweight(String parm) {
    // Return the Flyweight if it exists,
    // or create it if it doesn't.
    FlyweightIF flyweight = null;
    try {
      if (map.containsKey(parm)) {
        // Return existing flyweight
        flyweight = map.get(parm);
      } else {
        // Create flyweight with a 'true' state
        flyweight = new ConcreteFlyweight(new State(true));
        map.put(parm, flyweight);
        Buffer.getInstance().append("Created flyweight " + parm + " with state=true");
        Buffer.getInstance().append("");
      }
    } catch (ClassCastException cce) {
      Logger.getLogger(FlyweightFactory.class.getName()).log(Level.SEVERE,
                 cce.getMessage(), cce);
    }
    return flyweight;
  }
}
