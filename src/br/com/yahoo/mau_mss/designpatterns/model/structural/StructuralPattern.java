package br.com.yahoo.mau_mss.designpatterns.model.structural;

/**
 * Structural patterns
 * @author mauricio.soares
 */
public enum StructuralPattern {
   ADAPTER, BRIDGE, COMPOSITE, DECORATOR, FACADE, FLYWEIGHT, PROXY;

   @Override
   public String toString() {
     switch(this) {
       case ADAPTER   : return "Adapter";
       case BRIDGE    : return "Bridge";
       case COMPOSITE : return "Composite";
       case DECORATOR : return "Decorator";
       case FACADE    : return "Facade";
       case FLYWEIGHT : return "Flyweight";
       case PROXY     : return "Proxy";
       default        : return "Não Especificado";
     }
   }

}
