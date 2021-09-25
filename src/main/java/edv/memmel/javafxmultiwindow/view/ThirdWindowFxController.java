package edv.memmel.javafxmultiwindow.view;

import javafx.fxml.FXML;

/**
 * FX controller class for main window.
 */
public class ThirdWindowFxController implements FxController {

  @FXML
  void loadStartWindow() {
    WindowManager.getInstance().loadWindow(WindowState.START_WINDOW);
  }

  @FXML
  void loadSecondWindow() {
    WindowManager.getInstance().loadWindow(WindowState.SECOND_WINDOW);
  }

  @Override
  public void cleanup() {

  }
}
