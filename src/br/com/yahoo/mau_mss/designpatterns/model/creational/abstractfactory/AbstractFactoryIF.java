package br.com.yahoo.mau_mss.designpatterns.model.creational.abstractfactory;

/**
 *
 * @author mauricio.soares
 */
public interface AbstractFactoryIF {

   public AbstractSportsCarIF createSportsCar();
   
   public AbstractEconomyCarIF createEconomyCar();

}
