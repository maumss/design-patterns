package br.com.yahoo.mau_mss.designpatterns.model.behavioral.mediator;

/**
 * Título: MediatorIF
 * Descrição:
 * Data: Feb 19, 2011, 5:33:07 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public interface MediatorIF {

  //Interface for communicating with colleagues
  public void registerColleague1(ColleagueIF parm);

  public void registerColleague2(ColleagueIF parm);

  public void state1Changed();

  public void state2Changed();
}
