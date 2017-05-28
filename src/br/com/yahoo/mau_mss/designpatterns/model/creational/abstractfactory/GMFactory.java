package br.com.yahoo.mau_mss.designpatterns.model.creational.abstractfactory;

/**
 *
 * @author mauricio.soares
 */
public class GMFactory implements AbstractFactoryIF {
   
   public AbstractSportsCarIF createSportsCar() {
      return new Corvette();
   }

   public AbstractEconomyCarIF createEconomyCar() {
      return new Cavalier();
   }
}
