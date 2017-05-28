package br.com.yahoo.mau_mss.designpatterns.model.creational;

/**
 * Creational patterns
 * @author mauricio.soares
 */
public enum CreationalPattern {
   ABSTRACT_FACTORY, BUILDER, FACTORY_METHOD, PROTOTYPE, SINGLETON;

   @Override
   public String toString() {
     switch(this) {
       case ABSTRACT_FACTORY : return "Abstract Factory";
       case BUILDER          : return "Builder";
       case FACTORY_METHOD   : return "Factory Method";
       case PROTOTYPE        : return "Prototype";
       case SINGLETON        : return "Singleton";
       default               : return "Não Especificado";
     }
   }

}
