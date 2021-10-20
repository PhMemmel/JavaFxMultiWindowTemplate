package edv.memmel.example.view;

import edv.memmel.example.DataManager;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SecondWindowFxController {

  @FXML
  Label contentLabel;

  @FXML
  void initialize() {
    contentLabel.setText(DataManager.getInstance().getContent());
  }

}
