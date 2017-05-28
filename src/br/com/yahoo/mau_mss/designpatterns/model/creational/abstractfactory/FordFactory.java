package br.com.yahoo.mau_mss.designpatterns.model.creational.abstractfactory;

/**
 *
 * @author mauricio.soares
 */
public class FordFactory implements AbstractFactoryIF {

   public AbstractSportsCarIF createSportsCar() {
      return new Mustang();
   }

   public AbstractEconomyCarIF createEconomyCar() {
      return new Focus();
   }
}
