package br.com.yahoo.mau_mss.designpatterns.model.behavioral.visitor;

/**
 * Título: VisitorIF
 * Descrição:
 * Data: Feb 19, 2011, 6:36:46 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public interface VisitorIF {

  public void visitConcreteElementA(ConcreteElementA parm);

  public void visitConcreteElementB(ConcreteElementB parm);
}
