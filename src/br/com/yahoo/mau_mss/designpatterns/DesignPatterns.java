package br.com.yahoo.mau_mss.designpatterns;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author mauricio.soares
 */
public class DesignPatterns extends Application {
  private static final String MAIN_SCREEN = "/br/com/yahoo/mau_mss/designpatterns/view/FxmlPatterns.fxml";
  
  @Override
  public void start(Stage stage) throws Exception {
    Parent root = FXMLLoader.load(getClass().getResource(DesignPatterns.MAIN_SCREEN));
    
    Scene scene = new Scene(root);
    
    stage.setTitle("Design Patterns");
    stage.setScene(scene);
    stage.show();
  }

  /**
   * The main() method is ignored in correctly deployed JavaFX application.
   * main() serves only as fallback in case the application can not be launched
   * through deployment artifacts, e.g., in IDEs with limited FX support.
   * NetBeans ignores main().
   *
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
}
