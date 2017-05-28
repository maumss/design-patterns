package br.com.yahoo.mau_mss.designpatterns.model.behavioral.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Título: ConcreteCollection
 * Descrição:
 * Data: Feb 19, 2011, 12:15:22 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteCollection implements CollectionIF {
  // Builds an iterable list of elements
  private List<Object> list = new ArrayList<Object>();

  public ConcreteCollection(Object[] objectList) {
    this.list.addAll(Arrays.asList(objectList));
  }

  @Override
  public IteratorIF iterator() {
    return new ConcreteIterator(this);
  }

  @Override
  public Collection<Object> elements() {
    return Collections.unmodifiableList(this.list);
  }

}
