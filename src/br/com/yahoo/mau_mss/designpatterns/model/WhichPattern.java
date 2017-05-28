package br.com.yahoo.mau_mss.designpatterns.model;

import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mauricio.soares
 */
public class WhichPattern {
  private String patternType;
  private String patternStr;

  public WhichPattern(String patternType, String patternStr) {
    this.patternType = patternType;
    this.patternStr = patternStr;
  }

   public InputStream getPatternImage() {
      if (this.patternStr == null)
        return null;
	  String imageName = this.patternStr.replace(" ", "") + ".png";
	  imageName = imageName.substring(0, 1).toLowerCase() +
	              imageName.substring(1);
      return getClass().getResourceAsStream("/br/com/yahoo/mau_mss/designpatterns/resources/" +
              imageName);
   }

   public ShowPattern getPattern() {
      ShowPattern result = null;
      if (this.patternStr == null)
        return result;
     String pack = "br.com.yahoo.mau_mss.designpatterns.model." + this.patternType.toLowerCase() + "." + this.patternStr.replace(" ", "").toLowerCase();
      String clazzS = this.patternStr.replace(" ", "") + "Pattern";
      try {
         Class<?> clazz = Class.forName(pack + "." + clazzS);
         result = (ShowPattern)clazz.newInstance();
      }catch(ClassNotFoundException | InstantiationException | IllegalAccessException e) {
         Logger.getLogger(ShowPattern.class.getName()).log(Level.SEVERE, null, e);
      }
      return result;
   }

}
