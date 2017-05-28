package br.com.yahoo.mau_mss.designpatterns.model.creational.abstractfactory;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 *
 * @author mauricio.soares
 */
public class Cavalier implements AbstractEconomyCarIF {
   
    public void driveSlow() {
       Buffer.getInstance().append("Cavalier.driveSlow() called.");
    }
}
