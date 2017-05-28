package br.com.yahoo.mau_mss.designpatterns.controller;

import br.com.yahoo.mau_mss.designpatterns.model.ShowPattern;
import br.com.yahoo.mau_mss.designpatterns.model.TypePattern;
import br.com.yahoo.mau_mss.designpatterns.model.WhichPattern;
import br.com.yahoo.mau_mss.designpatterns.model.behavioral.BehavioralPattern;
import br.com.yahoo.mau_mss.designpatterns.model.creational.CreationalPattern;
import br.com.yahoo.mau_mss.designpatterns.model.structural.StructuralPattern;
import br.com.yahoo.mau_mss.designpatterns.util.Buffer;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * FXML Controller class
 *
 * @author mauricio.soares
 */
public class FxmlPatternsController implements Initializable {
  @FXML
  private ComboBox<String> comboBoxType;
  @FXML
  private ComboBox<String> comboBoxPattern;
  @FXML
  private TextArea textAreaType;
  @FXML
  private TextArea textAreaPattern;
  @FXML
  private TextArea textAreaOut;
  @FXML
  private ImageView imageViewUml;
  private static final String IMAGE_DEFAULT = "/br/com/yahoo/mau_mss/designpatterns/resources/patterns.png";

  private TypePattern getJComboBoxType() {
     return TypePattern.valueOf(this.comboBoxType.getSelectionModel().getSelectedItem().toUpperCase());
  }

  @FXML
  private void handleComboBoxTypeAction(ActionEvent event) {
    clearScreen();
    TypePattern type = getJComboBoxType();
    String[] values;
    if (type == TypePattern.CREATIONAL) {
      this.textAreaType.setText("Creational design patterns are concerned with the way objects are created.");
      values = new String[CreationalPattern.values().length];
      int i = 0;
      for (CreationalPattern val : CreationalPattern.values()) {
         values[i++] = val.toString();
      }
    } else if (type == TypePattern.STRUCTURAL) {
      this.textAreaType.setText("Structural patterns are concerned with composition or the organization of classes " +
        "and objects, how classes inherit from each other, and how they are composed from " +
        "other classes.");
      values = new String[StructuralPattern.values().length];
      int i = 0;
      for (StructuralPattern val : StructuralPattern.values()) {
         values[i++] = val.toString();
      }
    } else {
      values = new String[BehavioralPattern.values().length];
      int i = 0;
      for (BehavioralPattern val : BehavioralPattern.values()) {
         values[i++] = val.toString();
      }
      this.textAreaType.setText("Behavioral patterns are concerned with the interaction and responsibility of objects.");
    }
    this.comboBoxPattern.getItems().addAll(values);
  }

  private WhichPattern getWhichPattern() {
    String patternStr = this.comboBoxPattern.getSelectionModel().getSelectedItem();
    if (patternStr == null || patternStr.length() == 0)
      return null;
    WhichPattern whichPattern;
    try {
        Logger.getLogger(ShowPattern.class.getName()).log(
                Level.INFO, "Vai disparar o padr\u00e3o {0}", patternStr);
      whichPattern = new WhichPattern(getJComboBoxType().toString(), patternStr);
        if (whichPattern.getPatternImage() == null) {
          String msg = "Url da imagem não pode ser nula.";
          Logger.getLogger(ShowPattern.class.getName()).log(Level.INFO, msg);
          throw new IllegalStateException(msg);
        }
    } catch(ClassCastException e) {
      String msg = "Não é possível converter a posição " +
      this.comboBoxPattern.getSelectionModel().getSelectedIndex() + " em String";
      Logger.getLogger(ShowPattern.class.getName()).log(Level.SEVERE, msg, e);
      throw new IllegalStateException(msg);
    }
    return whichPattern;
  }

  private void doPattern() {
    this.textAreaOut.setText(null);
    WhichPattern whichPattern = getWhichPattern();
    ShowPattern showPattern = whichPattern.getPattern();
    if (showPattern == null)
      return;
    this.textAreaPattern.setText(showPattern.getAbout());
    Image image = new Image(whichPattern.getPatternImage());
    this.imageViewUml.setImage(image);
    Buffer buffer = Buffer.getInstance();
    buffer.initialize();
    showPattern.doIt();
    this.textAreaOut.setText(buffer.toString());
  }

  @FXML
  private void handleComboBoxPatternAction(ActionEvent event) {
    if (getWhichPattern() == null) {
      clearScreen();
      return;
    }
    this.textAreaPattern.setText(getWhichPattern().getPattern().getAbout());
    doPattern();
  }

  /**
   * Initializes the controller class.
   * @param url URL
   * @param rb ResourceBundle
   */
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    this.comboBoxType.getItems().addAll("CREATIONAL", "STRUCTURAL", "BEHAVIORAL");
    clearScreen();
  }

  private void clearScreen() {
    Image image = new Image(getClass().getResourceAsStream(FxmlPatternsController.IMAGE_DEFAULT));
    this.imageViewUml.setImage(image);
    this.textAreaPattern.setText("");
    this.textAreaOut.setText("");
    this.comboBoxPattern.getItems().clear();
  }
}
