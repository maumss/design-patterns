package br.com.yahoo.mau_mss.designpatterns.model.behavioral.interpreter;

/**
 * Título: TitleAndAuthor
 * Descrição:
 * Data: Feb 19, 2011, 11:56:35 AM
 * @author Mauricio Soares da Silva (Mau)
 */
class TitleAndAuthor {
  private String title;
  private String author;

  public TitleAndAuthor(String parm1, String parm2) {
    title = parm1;
    author = parm2;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

}
