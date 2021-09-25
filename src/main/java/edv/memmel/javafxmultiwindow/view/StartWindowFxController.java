package edv.memmel.javafxmultiwindow.view;

import javafx.fxml.FXML;

/**
 * FX controller class for main window.
 */
public class StartWindowFxController implements FxController {

  @FXML
  void loadSecondWindow() {
    WindowManager.getInstance().loadWindow(WindowState.SECOND_WINDOW);
  }

  @FXML
  void loadThirdWindow() {
    WindowManager.getInstance().loadWindow(WindowState.THIRD_WINDOW);
  }

  @Override
  public void cleanup() {

  }
}
