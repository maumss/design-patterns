package br.com.yahoo.mau_mss.designpatterns.model.behavioral.mediator;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: MediatorPattern
 * Descrição:
 * Data: Feb 19, 2011, 12:29:33 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class MediatorPattern implements ShowPattern {

  @Override
   public String getAbout() {
      return "The Mediator pattern’s intent is to define an object that " +
             "encapsulates how a set of objects interacts. It helps to " +
             "promote a looser coupling by keeping objects from referring " +
             "to each other explicitly, therefore allowing any interaction " +
             "to vary independently.";
   }

   @Override
   public void doIt() {
      Buffer buffer = Buffer.getInstance();
      buffer.append("Mediator Pattern Demonstration.");
      buffer.append("--------------------------------");
      // Construct mediator and colleagues
      buffer.append("Constructing mediator and colleagues.");
      MediatorIF mediator = new ConcreteMediator();
      ColleagueIF colleague1 = new ConcreteColleague1(mediator);
      ColleagueIF colleague2 = new ConcreteColleague2(mediator);
      // Display colleague values.
      buffer.append("Displaying colleague states.");
      buffer.append("colleague1.toString()=" + colleague1);
      buffer.append("colleague2.toString()=" + colleague2);
      // Change state on colleague1 and the mediator
      // will coordinate the change with colleague2.
      buffer.append("Calling colleague1.changeState()");
      ((ConcreteColleague1) colleague1).changeState();
      // Display colleague values now.
      buffer.append("Displaying colleague states now.");
      buffer.append("colleague1.toString()=" + colleague1);
      buffer.append("colleague2.toString()=" + colleague2);
      // Change state on colleague2 and see what happens.
      buffer.append("Calling colleague2.changeState()");
      ((ConcreteColleague2) colleague2).changeState();
      // Display colleague values now.
      buffer.append("Displaying colleague states again.");
      buffer.append("colleague1.toString()=" + colleague1);
      buffer.append("colleague2.toString()=" + colleague2);
      buffer.append("");
   }

}
