package br.com.yahoo.mau_mss.designpatterns.model.behavioral.iterator;

import java.util.List;

/**
 * Título: ConcreteIterator
 * Descrição:
 * Data: Feb 19, 2011, 12:20:48 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteIterator implements IteratorIF {
  private List<Object> list;
  private int index;

  public ConcreteIterator(CollectionIF parm) {
    list = (List<Object>) parm.elements();
    index = 0;
  }

  @Override
  public Object next() throws RuntimeException {
    try {
      return list.get(index++);
    } catch (IndexOutOfBoundsException ioobe) {
      throw new RuntimeException("No Such Element");
    }
  }

  @Override
  public boolean hasNext() {
    return (index < list.size()) ? true : false;
  }

}
