package br.com.yahoo.mau_mss.designpatterns.model.behavioral.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Título: BookAuthorTitleExpression
 * Descrição:
 * Data: Feb 19, 2011, 11:46:56 AM
 * @author Mauricio Soares da Silva (Mau)
 */
class BookAuthorTitleExpression extends BookAbstractExpression {
  String title;

  public BookAuthorTitleExpression(String parm) {
    title = parm;
  }

  @Override
  public String interpret(BookInterpreterContext parm) {
    @SuppressWarnings("unchecked")
    ArrayList<String> authorsAndTitles = parm.getAuthorsForTitle(title);
    ListIterator<String> authorsAndTitlesIterator = authorsAndTitles.listIterator();
    StringBuffer authorBuffer = new StringBuffer("");
    boolean first = true;
    while (authorsAndTitlesIterator.hasNext()) {
      if (!first) {
        authorBuffer.append(", ");
      } else {
        first = false;
      }
      authorBuffer.append(authorsAndTitlesIterator.next());
    }
    return authorBuffer.toString();
  }

}
