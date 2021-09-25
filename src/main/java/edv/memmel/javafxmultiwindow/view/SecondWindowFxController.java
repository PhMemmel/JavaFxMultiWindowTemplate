package edv.memmel.javafxmultiwindow.view;

import javafx.fxml.FXML;

/**
 * FX controller class for main window.
 */
public class SecondWindowFxController implements FxController {

  @FXML
  void loadStartWindow() {
    WindowManager.getInstance().loadWindow(WindowState.START_WINDOW);
  }

  @FXML
  void loadThirdWindow() {
    WindowManager.getInstance().loadWindow(WindowState.THIRD_WINDOW);
  }

  @Override
  public void cleanup() {

  }
}
