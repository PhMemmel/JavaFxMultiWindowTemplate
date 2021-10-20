package edv.memmel.example;

public class DataManager {

  private static DataManager instance = new DataManager();;
  private String content;

  private DataManager() {

  }

  public static DataManager getInstance() {
    return instance;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
