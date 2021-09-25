package edv.memmel.javafxmultiwindow.view;

/**
 * Enum including all information about the different window states.
 */
public enum WindowState {
  START_WINDOW(
      StartWindowFxController.class,
      "/StartWindow.fxml",
      "Start Window"),
  SECOND_WINDOW(
      SecondWindowFxController.class,
      "/SecondWindow.fxml",
      "Second Window"),
  THIRD_WINDOW(
      ThirdWindowFxController.class,
      "/ThirdWindow.fxml",
      "Third Window");

  private final Class<?> controllerClass;
  private final String fxmlFileString;
  private final String title;

  WindowState(Class<?> controllerClass, String fxmlFileString, String title) {
    this.controllerClass = controllerClass;
    this.fxmlFileString = fxmlFileString;
    this.title = title;
  }

  public Class<?> getControllerClass() {
    return controllerClass;
  }

  public String getFxmlFileString() {
    return fxmlFileString;
  }

  public String getTitle() {
    return title;
  }
}
