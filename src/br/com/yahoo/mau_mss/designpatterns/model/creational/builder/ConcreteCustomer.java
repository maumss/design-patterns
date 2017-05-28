package br.com.yahoo.mau_mss.designpatterns.model.creational.builder;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 *
 * @author mauricio.soares
 */
public class ConcreteCustomer implements CustomerIF {

   public ConcreteCustomer() {
      Buffer.getInstance().append("ConcreteCustomer constructed.");
   }

   @Override
   public void action() {
      Buffer.getInstance().append("ConcreteCustomer.action() called.");
   }
}
