package br.com.yahoo.mau_mss.designpatterns.util;

/**
 *
 * @author mauricio.soares
 */
public class Buffer {
  private static Buffer instance;
  private StringBuffer stringBuffer;

  private Buffer() {
    this.stringBuffer = new StringBuffer();
  }

  public static Buffer getInstance() {
    if (instance == null) {
      instance = new Buffer();
    }
    return instance;
  }

  public void initialize() {
     this.stringBuffer = new StringBuffer();
  }

  public void append(String value) {
     this.stringBuffer.append(value).append("\n");
  }

  @Override
  public String toString() {
     return this.stringBuffer.toString();
  }
}
