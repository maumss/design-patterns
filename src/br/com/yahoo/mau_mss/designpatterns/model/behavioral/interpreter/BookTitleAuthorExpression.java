package br.com.yahoo.mau_mss.designpatterns.model.behavioral.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Título: BookTitleAuthorExpression
 * Descrição:
 * Data: Feb 19, 2011, 11:52:06 AM
 * @author Mauricio Soares da Silva (Mau)
 */
class BookTitleAuthorExpression extends BookAbstractExpression {
  String title;

  public BookTitleAuthorExpression(String parm) {
    title = parm;
  }

  @Override
  public String interpret(BookInterpreterContext parm) {
    @SuppressWarnings("unchecked")
    ArrayList<String> titlesAndAuthors = parm.getTitlesForAuthor(title);
    ListIterator<String> titlesAndAuthorsIterator = titlesAndAuthors.listIterator();
    StringBuffer titleBuffer = new StringBuffer("");
    boolean first = true;
    while (titlesAndAuthorsIterator.hasNext()) {
      if (!first) {
        titleBuffer.append(", ");
      } else {
        first = false;
      }
      titleBuffer.append(titlesAndAuthorsIterator.next());
    }
    return titleBuffer.toString();
  }

}
