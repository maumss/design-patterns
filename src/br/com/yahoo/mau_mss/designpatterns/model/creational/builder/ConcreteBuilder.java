package br.com.yahoo.mau_mss.designpatterns.model.creational.builder;

/**
 *
 * @author mauricio.soares
 */
public class ConcreteBuilder implements BuilderIF {
   CustomerIF customer;

   @Override
   public void buildCustomer() {
      customer = new ConcreteCustomer();
      // You could add more customer processing here...
   }

   @Override
   public CustomerIF getCustomer() {
      return customer;
   }
}
