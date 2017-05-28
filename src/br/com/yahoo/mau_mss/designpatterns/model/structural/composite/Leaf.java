package br.com.yahoo.mau_mss.designpatterns.model.structural.composite;

import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: Leaf
 * Descrição:
 * Data: Feb 18, 2011, 10:51:13 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Leaf extends Component {
  private String name;

  public Leaf(String parm) {
    this.name = parm;
    Buffer.getInstance().append(parm.trim() + " constructed.");
  }

  @Override
  public void display() {
    Buffer.getInstance().append(this.getName());
  }

  @Override
  public String getName() {
    return name;
  }

}
