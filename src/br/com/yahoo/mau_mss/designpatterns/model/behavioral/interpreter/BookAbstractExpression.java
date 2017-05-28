package br.com.yahoo.mau_mss.designpatterns.model.behavioral.interpreter;

/**
 * Título: BookAbstractExpression
 * Descrição:
 * Data: Feb 19, 2011, 11:41:02 AM
 * @author Mauricio Soares da Silva (Mau)
 */
abstract class BookAbstractExpression {

  public abstract String interpret(BookInterpreterContext parm);

}
