package br.com.yahoo.mau_mss.designpatterns.model.creational.abstractfactory;
      
import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Demonstrates the Abstract Factory pattern
 * @author mauricio.soares
 */
public class AbstractFactoryPattern implements ShowPattern {

   @Override
   public String getAbout() {
      return "The Abstract Factory pattern’s (Kit) intent is to provide an interface " +
             "to use for creating families of related or dependent objects " +
             "without actually specifying their concrete classes.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Abstract Factory Pattern Demonstration.");
      buffer.append("---------------------------------------");
      // Create abstract factories
      buffer.append("Constructing abstract factories.");
      AbstractFactoryIF factoryOne = new FordFactory();
      AbstractFactoryIF factoryTwo = new GMFactory();
      // Create cars via abstract factories
      buffer.append("Constructing cars.");
      AbstractSportsCarIF car1 = factoryOne.createSportsCar();
      AbstractEconomyCarIF car2 = factoryOne.createEconomyCar();
      AbstractSportsCarIF car3 = factoryTwo.createSportsCar();
      AbstractEconomyCarIF car4 = factoryTwo.createEconomyCar();
      // Execute drive on the cars
      buffer.append("Calling drive on the cars.");
      car1.driveFast();
      car2.driveSlow();
      car3.driveFast();
      car4.driveSlow();
      buffer.append("");
   }
}
