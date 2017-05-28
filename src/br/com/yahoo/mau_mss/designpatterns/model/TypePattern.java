package br.com.yahoo.mau_mss.designpatterns.model;

/**
 *
 * @author mauricio.soares
 */
public enum TypePattern {
   CREATIONAL, STRUCTURAL, BEHAVIORAL;

   @Override
   public String toString() {
     switch(this) {
       case CREATIONAL : return "Creational";
       case STRUCTURAL : return "Structural";
       case BEHAVIORAL : return "Behavioral";
       default         : return "Não Especificado";
     }
   }

}
