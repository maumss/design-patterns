package br.com.yahoo.mau_mss.designpatterns.model.creational.builder;

/**
 *
 * @author mauricio.soares
 */
public class Director {
   BuilderIF builder;

   public Director(BuilderIF parm) {
      this.builder = parm;
   }

   public void construct() {
      builder.buildCustomer();
   }

}
