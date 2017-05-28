package br.com.yahoo.mau_mss.designpatterns.model.behavioral;

/**
 * Behavioral patterns
 * @author mauricio.soares
 */
public enum BehavioralPattern {
   CHAIN_OF_RESPONSIBILITY, COMMAND, INTERPRETER, ITERATOR, MEDIATOR,
   MEMENTO, OBSERVER, STATE, STRATEGY, TEMPLATE_METHOD, VISITOR;

   @Override
   public String toString() {
     switch(this) {
       case CHAIN_OF_RESPONSIBILITY : return "Chain Of Responsibility";
       case COMMAND                 : return "Command";
       case INTERPRETER             : return "Interpreter";
       case ITERATOR                : return "Iterator";
       case MEDIATOR                : return "Mediator";
       case MEMENTO                 : return "Memento";
       case OBSERVER                : return "Observer";
       case STATE                   : return "State";
       case STRATEGY                : return "Strategy";
       case TEMPLATE_METHOD         : return "Template Method";
       case VISITOR                 : return "Visitor";
       default                      : return "Não Especificado";
     }
   }

}
