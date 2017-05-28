package br.com.yahoo.mau_mss.designpatterns.model.behavioral.iterator;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: IteratorPattern
 * Descrição:
 * Data: Feb 19, 2011, 12:09:46 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class IteratorPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Iterator pattern’s intent is to provide a way to access the " +
             "elements of an aggregate object sequentially without exposing "+
             "its underlying implementation.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Iterator Pattern Demonstration.");
      buffer.append("--------------------------------");
      buffer.append("Building string array of books.");
      String[] books = new String[8];
      books[0] = "PowerBuilder Developers Guide, 1994";
      books[1] = "Informix Developers Guide, 1995";
      books[2] = "Informix Universal Data Option, 1996";
      books[3] = "SQL Server Developers Guide, 1999";
      books[4] = "SilverStream Success I, 1999";
      books[5] = "SilverStream Success II, 2000";
      books[6] = "J2EE Unleashed, 2001";
      books[7] = "Enterprise Architect Study Guide, 2002";
      // Turn the string array into a collection.
      buffer.append("Turning string array into a collection.");
      CollectionIF collection = new ConcreteCollection(books);
      // Get an iterator for the collection.
      buffer.append("Getting an iterator for the collection..");
      IteratorIF iterator = collection.iterator();
      // Iterate through and print each object in the list.
      buffer.append("Iterate through the list.");
      int i = 0;
      while (iterator.hasNext()) {
      buffer.append((++i) + " " + iterator.next());
      }
      buffer.append("");
   }

}
