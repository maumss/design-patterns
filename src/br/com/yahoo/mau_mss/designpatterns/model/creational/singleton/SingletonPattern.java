package br.com.yahoo.mau_mss.designpatterns.model.creational.singleton;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: SingletonPattern
 * Descrição:
 * Data: Feb 18, 2011, 10:00:27 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class SingletonPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Singleton pattern’s intent is to ensure that a class has " +
             "only one instance and provides a global point of access to it.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Singleton Pattern Demonstration.");
      buffer.append("---------------------------------------");
      buffer.append("Getting Singleton instance (s1)");
      Singleton s1 = Singleton.getInstance();
      buffer.append("s1.getInfo()="+s1.getInfo());
      buffer.append("Getting Singleton instance (s2)");
      Singleton s2 = Singleton.getInstance();
      buffer.append("s2.getInfo()="+s2.getInfo());
      buffer.append("s1.setValue(42)");
      s1.setValue(42);
      buffer.append("s1.getValue()="+s1.getValue());
      buffer.append("s2.getValue()="+s2.getValue());
      buffer.append("s1.equals(s2)="+s1.equals(s2)
      + ", s2.equals(s1)="+s2.equals(s1));
      // The following will not compile
      // Singleton s3 = (Singleton) s1.clone();
      buffer.append("");
   }

}
