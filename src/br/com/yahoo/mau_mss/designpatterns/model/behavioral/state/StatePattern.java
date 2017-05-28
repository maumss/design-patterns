package br.com.yahoo.mau_mss.designpatterns.model.behavioral.state;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: StatePattern
 * Descrição:
 * Data: Feb 19, 2011, 6:05:53 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class StatePattern implements ShowPattern {

  @Override
  public String getAbout() {
      return "The State pattern’s intent is to allow an object to alter its " +
             "behavior when its internal state changes, appearing as though " +
             "the object itself has changed its class.";
  }

  @Override
  public void doIt() {
     Buffer buffer = Buffer.getInstance();
     buffer.append("State Pattern Demonstration.");
     buffer.append("--------------------------------");
     // Construct context.
     buffer.append("Constructing context.");
     Context context = new Context();
     // Call request, make state handle the request.
     buffer.append("Calling context.request().");
     context.request();
     // Flip state.
     buffer.append("Calling context.changeState().");
     context.changeState();
     // call request.
     buffer.append("Calling context.request().");
     context.request();
     buffer.append("");
  }

}
