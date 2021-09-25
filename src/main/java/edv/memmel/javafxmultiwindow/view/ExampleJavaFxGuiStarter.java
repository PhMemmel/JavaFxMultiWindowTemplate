package edv.memmel.javafxmultiwindow.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * JavaFX Application starter class.
 */
public class ExampleJavaFxGuiStarter extends Application {


  public static void main(String[] args) {
    launch();
  }

  @Override
  public void start(Stage primaryStage) throws Exception {
    WindowManager.createInstance(primaryStage);
    WindowManager.getInstance().loadWindow(WindowState.START_WINDOW);
    primaryStage.show();
  }
}
