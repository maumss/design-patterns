package br.com.yahoo.mau_mss.designpatterns.model.behavioral.visitor;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Título: ObjectStructure
 * Descrição:
 * Data: Feb 19, 2011, 6:41:38 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ObjectStructure {
  private List<ElementIF> objectStruct;
  private VisitorIF visitor;

  public ObjectStructure(ElementIF[] parm) {
    objectStruct = Arrays.asList(parm);
  }

  @SuppressWarnings("unchecked")
  public void visitElements() {
    if (visitor == null) { visitor = new ConcreteVisitor(); }
    for (Iterator<ElementIF> i = objectStruct.iterator(); i.hasNext();) {
      (i.next()).accept(visitor);
    }
  }

}
