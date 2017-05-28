package br.com.yahoo.mau_mss.designpatterns.model.structural.facade;

/**
 * Título: Facade
 * Descrição:
 * Data: Feb 18, 2011, 11:29:05 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Facade {

  public void processOrder() {
    // Call methods on sub-systems to complete the process
    SubSystem1 subsys1 = new SubSystem1();
    subsys1.getCustomer();
    subsys1.getSecurity();
    subsys1.priceTransaction();
    SubSystemN subsysN = new SubSystemN();
    subsysN.checkBalances();
    subsysN.completeOrder();
  }

}
