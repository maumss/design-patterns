package br.com.yahoo.mau_mss.designpatterns.model.behavioral.observer;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: ObserverPattern
 * Descrição:
 * Data: Feb 19, 2011, 5:48:56 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ObserverPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Observer pattern’s intent is to define a one-to-many " +
             "dependency so that when one object changes state, all its " +
             "dependents are notified and updated automatically.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Observer Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Constructing observers.
      buffer.append("Constructing observer1 and observer2.");
      ObserverIF observer1 = new ConcreteObserver();
      ObserverIF observer2 = new ConcreteObserver();
      // Constructing observable (subject).
      buffer.append("Constructing observerable (subject).");
      ConcreteSubject subject = new ConcreteSubject();
      // Add observer object references to the subject.
      buffer.append("Registering observers with subject.");
      subject.addObserver(observer1);
      subject.addObserver(observer2);
      buffer.append("Doing something in the subject over time...");
      buffer.append("");
      buffer.append(" Observable Observer1 Observer2");
      buffer.append("Iteration changed? notified? notified?");
      // Use loop to simulate time.
      for (int i=0; i<10; i++) {
        buffer.append(i+": ");
        subject.doSomething();
        buffer.append("");
      }
      buffer.append("");
      buffer.append("Removing observer1 from the subject...repeating...");
      buffer.append("");
      subject.removeObserver(observer1);
      // Another loop to simulate time.
      for (int i=0; i<10; i++) {
        buffer.append("");
        buffer.append(i + ": ");
        subject.doSomething();
        buffer.append("");
      }
  }
}
