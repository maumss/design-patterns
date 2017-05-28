package br.com.yahoo.mau_mss.designpatterns.model.behavioral.command;

/**
 * Título: ConcreteCommand
 * Descrição:
 * Data: Feb 19, 2011, 11:05:55 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class ConcreteCommand extends CommandAbstract {
  // The binding between action and receiver
  private ReceiverIF receiver;

  public ConcreteCommand(ReceiverIF receive) {
    this.receiver = receive;
  }

  @Override
  public void execute() {
    receiver.action();
  }

}
