package br.com.yahoo.mau_mss.designpatterns.model.creational.abstractfactory;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 *
 * @author mauricio.soares
 */
public class Focus implements AbstractEconomyCarIF {
   
   public void driveSlow() {
      Buffer.getInstance().append("Focus.driveSlow() called.");
   }
}
