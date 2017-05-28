package br.com.yahoo.mau_mss.designpatterns.model.behavioral.observer;

/**
 * Título: SubjectIF
 * Descrição:
 * Data: Feb 19, 2011, 5:55:29 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public interface SubjectIF {

  public void addObserver(ObserverIF parm);

  public void removeObserver(ObserverIF parm);

  public void notifyObservers();
}
