package br.com.yahoo.mau_mss.designpatterns.model.behavioral.memento;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: Caretaker
 * Descrição:
 * Data: Feb 19, 2011, 5:39:14 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Caretaker {

  public static void run() {
    Buffer buffer = Buffer.getInstance();
    // Create originator and set initial values.
    buffer.append("Creating originator and setting initial values.");
    Originator originator = new Originator();
    originator.setState(true);
    originator.setName("The Originator");
    // Create memento.
    buffer.append("Creating memento.");
    Memento memento = originator.createMemento();
    buffer.append(originator.toString());
    // Change originator values.
    buffer.append("Changing originator values.");
    originator.setState(false);
    originator.setName("To be undone.");
    buffer.append(originator.toString());
    // Recover state from memento.
    buffer.append("Recovering originator values from memento.");
    originator.recoverFromMemento(memento);
    buffer.append(originator.toString());
  }
}
