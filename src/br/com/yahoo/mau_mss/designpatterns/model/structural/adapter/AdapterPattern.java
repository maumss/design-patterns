package br.com.yahoo.mau_mss.designpatterns.model.structural.adapter;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: AdapterPattern
 * Descrição:
 * Data: Feb 18, 2011, 10:11:57 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class AdapterPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Adapter pattern converts the interface of a class into an "+
             "interface that a client requires.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Adapter Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Create targets.
      buffer.append("Creating targets.");
      TargetIF target1 = new AdapterByClass();
      TargetIF target2 = new AdapterByObject();
      // Call target requests
      buffer.append("Calling targets.");
      buffer.append("target1.newRequest()->"+target1.newRequest());
      buffer.append("target2.newRequest()->"+target2.newRequest());
      buffer.append("");
   }

}
