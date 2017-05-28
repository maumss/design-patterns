package br.com.yahoo.mau_mss.designpatterns.model.behavioral.iterator;

import java.util.Collection;

/**
 * Título: CollectionIF
 * Descrição:
 * Data: Feb 19, 2011, 12:13:12 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public interface CollectionIF {

  // Interface for creating a
  // collection that needs iterating.
  public IteratorIF iterator();

  public Collection<Object> elements();
}
