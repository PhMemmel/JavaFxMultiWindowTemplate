package edv.memmel.javafxmultiwindow.view;

import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/** The WindowManager singleton handling the state of the currently loaded/shown JavaFX window. */
public class WindowManager {

  private static WindowManager instance;
  private final Stage stage;
  private WindowState windowState;

  public WindowManager(Stage stage) {
    this.stage = stage;
  }

  /**
   * Creates the singleton instance and provides it with the JavaFX stage object.
   *
   * @param stage The JavaFX stage to render the different views to
   */
  public static synchronized void createInstance(Stage stage) {
    if (instance == null) {
      instance = new WindowManager(stage);
    } else {
      System.out.println("Instance already created.");
    }
  }

  /**
   * Returns the singleton instance.
   *
   * @return the singleton instance or null if it has not been initialized yet.
   */
  public static synchronized WindowManager getInstance() {
    return instance;
  }

  /**
   * Unloads current window including calling cleaning up method and loads new window.
   *
   * @param windowState The WindowState to load
   */
  public void loadWindow(WindowState windowState) {
    FXMLLoader fxmlLoader =
        new FXMLLoader(getClass().getResource(windowState.getFxmlFileString()));
    try {
      Parent root = fxmlLoader.load();
      stage.setTitle(windowState.getTitle());
      stage.setScene(new Scene(root, 300, 275));
    } catch (IOException e) {
      e.printStackTrace();
    }
    this.windowState = windowState;
  }

  /**
   * Returns the current window state.
   *
   * @return the current WindowState enum or null if no state is set
   */
  public WindowState getWindowState() {
    return windowState;
  }
}
