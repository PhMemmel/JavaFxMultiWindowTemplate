package edv.memmel.example.view;

import edv.memmel.example.DataManager;
import java.io.IOException;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/** FX controller class for main window. */
public class MainWindowFxController {

  @FXML TextField textField;

  @FXML
  void send() {
    DataManager.getInstance().setContent(textField.getText());
  }

  @FXML
  void nextWindow() {
    FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/SecondWindow.fxml"));
    Parent root = null;
    try {
      root = fxmlLoader.load();
    } catch (IOException e) {
      e.printStackTrace();
    }
    Stage stage = (Stage) textField.getScene().getWindow();
    stage.setTitle("Zweites Fenster");
    stage.setScene(new Scene(root, 300, 275));
  }
}
