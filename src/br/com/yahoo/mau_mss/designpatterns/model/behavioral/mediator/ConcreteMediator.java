package br.com.yahoo.mau_mss.designpatterns.model.behavioral.mediator;

/**
 * Título: ConcreteMediator
 * Descrição:
 * Data: Feb 19, 2011, 5:31:45 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteMediator implements MediatorIF {
  ColleagueIF colleague1;
  ColleagueIF colleague2;

  @Override
  public void registerColleague1(ColleagueIF parm) {
    this.colleague1 = (ConcreteColleague1) parm;
  }

  @Override
  public void registerColleague2(ColleagueIF parm) {
    this.colleague2 = (ConcreteColleague2) parm;
  }

  @Override
  public void state1Changed() {
    String s = (colleague2.toString().equals("true")) ? "false" : "true";
    ((ConcreteColleague2) colleague2).setState(s);
  }

  @Override
  public void state2Changed() {
    boolean b = (colleague1.toString().equals("true")) ? false : true;
    ((ConcreteColleague1) colleague1).setState(b);
  }
}
