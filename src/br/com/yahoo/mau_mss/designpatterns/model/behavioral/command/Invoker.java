package br.com.yahoo.mau_mss.designpatterns.model.behavioral.command;

/**
 * Título: Invoker
 * Descrição:
 * Data: Feb 19, 2011, 11:07:08 AM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Invoker {
  private CommandAbstract command;
  
  public void storeCommand(CommandAbstract cmd) {
    this.command = cmd;
  }

  public void invoke() {
    command.execute();
  }

}
