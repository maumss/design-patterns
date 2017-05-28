package br.com.yahoo.mau_mss.designpatterns.model.behavioral.chainofresponsibility;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteHandler1
 * Descrição:
 * Data: Feb 19, 2011, 10:51:58 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteHandler1 implements HandlerIF {

  @Override
  public void processRequest(Request parm) {
    // Start the processing chain here...
    switch (parm.getType()) {
      case Request.EQUITY_ORDER: // This object processes equity orders
        handleIt(parm); // so call the function to handle it.
        break;
      case Request.BOND_ORDER: // Another object processes bond orders so
        Buffer.getInstance().append("Creating 2nd handler."); // pass request along.
        new ConcreteHandler2().processRequest(parm);
        break;
    }
  }

  private void handleIt(Request parm) {
    Buffer.getInstance().append("ConcreteHandler1 has handled the processing.");
  }
}
