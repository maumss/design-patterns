package br.com.yahoo.mau_mss.designpatterns.model.behavioral.chainofresponsibility;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteHandler2
 * Descrição:
 * Data: Feb 19, 2011, 10:54:04 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteHandler2 implements HandlerIF {

  @Override
  public void processRequest(Request parm) {
    // You could add on to the processing chain here...
    handleIt(parm);
  }

  private void handleIt(Request parm) {
    Buffer.getInstance().append("ConcreteHandler2 has handled the processing.");
  }

}
