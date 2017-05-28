package br.com.yahoo.mau_mss.designpatterns.model.behavioral.interpreter;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Título: BookInterpreterContext
 * Descrição:
 * Data: Feb 19, 2011, 11:33:06 AM
 * @author Mauricio Soares da Silva (Mau)
 */
class BookInterpreterContext {
  private ArrayList<String> titles = new ArrayList<String>();
  private ArrayList<String> authors = new ArrayList<String>();
  private ArrayList<TitleAndAuthor> titlesAndAuthors = new ArrayList<TitleAndAuthor>();

  public void addTitle(String title) {
    titles.add(title);
  }

  public void addAuthor(String author) {
    authors.add(author);
  }

  public void addTitleAndAuthor(TitleAndAuthor titleAndAuthor) {
    titlesAndAuthors.add(titleAndAuthor);
  }

  public ArrayList<String> getAllTitles() {
    return titles;
  }

  public ArrayList<String> getAllAuthors() {
    return authors;
  }

  public ArrayList<String> getAuthorsForTitle(String titleIn) {
    ArrayList<String> authorsForTitle = new ArrayList<String>();
    TitleAndAuthor tempTitleAndAuthor;
    ListIterator<TitleAndAuthor> titlesAndAuthorsIterator = titlesAndAuthors.listIterator();
    while (titlesAndAuthorsIterator.hasNext()) {
      tempTitleAndAuthor = titlesAndAuthorsIterator.next();
      if (titleIn.equals(tempTitleAndAuthor.getTitle())) {
        authorsForTitle.add(tempTitleAndAuthor.getAuthor());
      }
    }
    return authorsForTitle;
  }

  public ArrayList<String> getTitlesForAuthor(String authorIn) {
    ArrayList<String> titlesForAuthor = new ArrayList<String>();
    TitleAndAuthor tempTitleAndAuthor;
    ListIterator<TitleAndAuthor> authorsAndTitlesIterator = titlesAndAuthors.listIterator();
    while (authorsAndTitlesIterator.hasNext()) {
      tempTitleAndAuthor = authorsAndTitlesIterator.next();
      if (authorIn.equals(tempTitleAndAuthor.getAuthor())) {
        titlesForAuthor.add(tempTitleAndAuthor.getTitle());
      }
    }
    return titlesForAuthor;
  }

}
