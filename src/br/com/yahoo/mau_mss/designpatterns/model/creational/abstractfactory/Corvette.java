package br.com.yahoo.mau_mss.designpatterns.model.creational.abstractfactory;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 *
 * @author mauricio.soares
 */
public class Corvette implements AbstractSportsCarIF {
   
   public void driveFast() {
      Buffer.getInstance().append("Corvette.driveFast() called.");
   }
}
