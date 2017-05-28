package br.com.yahoo.mau_mss.designpatterns.model.behavioral.interpreter;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: InterpreterPattern
 * Descrição:
 * Data: Feb 19, 2011, 11:22:52 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class InterpreterPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Interpreter pattern’s intent is to define a representation " +
             "of the grammar of a given language, along with an interpreter " +
             "that uses this representation to interpret sentences in the language.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Interpreter Pattern Demonstration.");
      buffer.append("--------------------------------");
      BookInterpreterContext bookInterpreterContext = new BookInterpreterContext();
      bookInterpreterContext.addTitle("Pickwick Papers");
      bookInterpreterContext.addTitle("Great Expectations");
      bookInterpreterContext.addTitle("Wuthering Heights");
      bookInterpreterContext.addTitle("Crossfile");
      bookInterpreterContext.addAuthor("William Shakespeare");
      bookInterpreterContext.addAuthor("Emily Bronte");
      bookInterpreterContext.addAuthor("James Marathon");
      bookInterpreterContext.addTitleAndAuthor(
      new TitleAndAuthor("Pickwick Papers", "William Shakespeare"));
      bookInterpreterContext.addTitleAndAuthor(
      new TitleAndAuthor("Great Expectations", "William Shakespeare"));
      bookInterpreterContext.addTitleAndAuthor(
      new TitleAndAuthor("Wuthering Heights", "Emily Bronte"));
      bookInterpreterContext.addTitleAndAuthor(
      new TitleAndAuthor("Crossfire", "James Marathon"));
      BookInterpreterClient bookInterpreterClient =
        new BookInterpreterClient(bookInterpreterContext);
      buffer.append("show author ->" +
         bookInterpreterClient.interpret("show author"));
      buffer.append("show title ->" +
         bookInterpreterClient.interpret("show title"));
      buffer.append("show author for title <Crossfire> ->" +
         bookInterpreterClient.interpret("show author for title <Crossfire>"));
      buffer.append("show title for author <William Shakespeare> ->" +
         bookInterpreterClient.interpret(
         "show title for author <William Shakespeare>"));
      buffer.append("");
   }

}
