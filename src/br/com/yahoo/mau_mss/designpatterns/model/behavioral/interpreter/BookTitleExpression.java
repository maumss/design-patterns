package br.com.yahoo.mau_mss.designpatterns.model.behavioral.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Título: BookTitleExpression
 * Descrição:
 * Data: Feb 19, 2011, 11:49:43 AM
 * @author Mauricio Soares da Silva (Mau)
 */
class BookTitleExpression extends BookAbstractExpression {

  @Override
  public String interpret(BookInterpreterContext parm) {
    @SuppressWarnings("unchecked")
    ArrayList<String> titles = parm.getAllTitles();
    ListIterator<String> titlesIterator = titles.listIterator();
    StringBuffer titleBuffer = new StringBuffer("");
    boolean first = true;
    while (titlesIterator.hasNext()) {
      if (!first) {
        titleBuffer.append(", ");
      } else {
        first = false;
      }
      titleBuffer.append(titlesIterator.next());
    }
    return titleBuffer.toString();
  }

}
