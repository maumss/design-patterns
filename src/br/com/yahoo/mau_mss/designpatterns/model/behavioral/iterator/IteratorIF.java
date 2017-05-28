package br.com.yahoo.mau_mss.designpatterns.model.behavioral.iterator;

/**
 * Título: IteratorIF
 * Descrição:
 * Data: Feb 19, 2011, 12:14:16 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public interface IteratorIF {

  // Interface for Iterators.
  public boolean hasNext();

  public Object next();
}
