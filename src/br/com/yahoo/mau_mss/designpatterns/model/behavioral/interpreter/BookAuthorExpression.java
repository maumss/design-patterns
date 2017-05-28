package br.com.yahoo.mau_mss.designpatterns.model.behavioral.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Título: BookAuthorExpression
 * Descrição:
 * Data: Feb 19, 2011, 11:42:14 AM
 * @author Mauricio Soares da Silva (Mau)
 */
class BookAuthorExpression extends BookAbstractExpression {

  @Override
  public String interpret(BookInterpreterContext parm) {
    @SuppressWarnings("unchecked")
    ArrayList<String> authors = parm.getAllAuthors();
    ListIterator<String> authorsIterator = authors.listIterator();
    StringBuffer titleBuffer = new StringBuffer("");
    boolean first = true;
    while (authorsIterator.hasNext()) {
      if (!first) {
        titleBuffer.append(", ");
      } else {
        first = false;
      }
      titleBuffer.append(authorsIterator.next());
    }
    return titleBuffer.toString();
  }

}
