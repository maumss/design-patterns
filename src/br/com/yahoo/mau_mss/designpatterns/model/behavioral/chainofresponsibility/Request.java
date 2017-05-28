package br.com.yahoo.mau_mss.designpatterns.model.behavioral.chainofresponsibility;

/**
 * Título: Request
 * Descrição:
 * Data: Feb 19, 2011, 10:49:57 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Request {
  // The universe of known requests that can be handled.
  public final static int EQUITY_ORDER = 100;
  public final static int BOND_ORDER = 200;
  // This objects type of request.
  private int type;

  public Request(int parm) throws Exception {
    // Validate the request type with the known universe.
    if ((parm == EQUITY_ORDER) || (parm == BOND_ORDER))
      // Store this request type.
      this.type = parm;
    else
      throw new Exception("Unknown Request type "+parm+".");
  }

  public int getType() {
    return type;
  }

}
