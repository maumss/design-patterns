package br.com.yahoo.mau_mss.designpatterns.model.structural.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

/**
 * Título: Composite
 * Descrição:
 * Data: Feb 18, 2011, 10:47:36 PM
 * @author Mauricio Soares da Silva (Mau)
 */
public class Composite extends Component {
  String name = null;
  List<Component> children = new ArrayList<Component>();
  
  public Composite(String parm) {
    this.name = parm;
    Buffer.getInstance().append(parm.trim() + " constructed.");
  }

  @Override
  public String getName() { 
    return name; 
  }

  @Override
  public Component getChild(int parm) {
    Component child;
    try {
      child = children.get(parm);
    } catch (IndexOutOfBoundsException ioobe) {
      child = null;
    }
    return child;
  }

  @Override
  public void add(Component parm) {
    try {
      Buffer.getInstance().append("Adding " + parm.getName().trim() +
        " to " + this.getName().trim());
      children.add(parm);
    } catch (Exception e) {
      Logger.getLogger(Composite.class.getName()).log(Level.SEVERE,
                 e.getMessage(), e);
    }
  }

  @Override
  public void remove(Component parm) {
    try {
      Buffer.getInstance().append("Removing " + parm.getName().trim() +
        " from "+this.getName().trim());
      children.remove(parm);
    } catch (Exception e) {
      Logger.getLogger(Composite.class.getName()).log(Level.SEVERE,
                 e.getMessage(), e);
    }
  }

  public void display() {
    Iterator<Component> iterator = children.iterator();
    Buffer.getInstance().append(this.getName() +
      (iterator.hasNext() ? " with the following: " : " that is bare."));
    while (iterator.hasNext()) {
      (iterator.next()).display();
    }
  }

}
