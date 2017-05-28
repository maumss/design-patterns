package br.com.yahoo.mau_mss.designpatterns.model.creational.builder;

/**
 *
 * @author mauricio.soares
 */
public interface BuilderIF {

   public void buildCustomer();

   public CustomerIF getCustomer();
}
