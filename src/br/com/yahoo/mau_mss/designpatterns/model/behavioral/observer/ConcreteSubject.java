package br.com.yahoo.mau_mss.designpatterns.model.behavioral.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ConcreteSubject
 * Descrição:
 * Data: Feb 19, 2011, 5:58:04 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteSubject implements SubjectIF {
  List<ObserverIF> observers = new ArrayList<ObserverIF>();

  @Override
  public void addObserver(ObserverIF parm) {
    observers.add(parm);
  }

  @Override
  public void removeObserver(ObserverIF parm) {
    observers.remove(observers.indexOf(parm));
  }

  @Override
  @SuppressWarnings("unchecked")
  public void notifyObservers() {
    for (Iterator<ObserverIF> i = observers.iterator(); i.hasNext();) {
      (i.next()).update();
    }
  }

  public void doSomething() {
    double d = Math.random();
    if (d<0.25 || d>0.75) {
      Buffer.getInstance().append("Yes");
      notifyObservers();
    } else {
      Buffer.getInstance().append("No");
    }
  }

}
