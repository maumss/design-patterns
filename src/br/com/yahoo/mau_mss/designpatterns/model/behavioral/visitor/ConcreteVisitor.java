package br.com.yahoo.mau_mss.designpatterns.model.behavioral.visitor;

/**
 * Título: ConcreteVisitor
 * Descrição:
 * Data: Feb 19, 2011, 6:40:28 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteVisitor implements VisitorIF {

  @Override
  public void visitConcreteElementA(ConcreteElementA parm) {
    parm.operationA();
  }

  @Override
  public void visitConcreteElementB(ConcreteElementB parm) {
    parm.operationB();
  }

}
