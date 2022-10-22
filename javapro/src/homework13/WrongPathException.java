package homework13;

public class WrongPathException extends RuntimeException {

  private String path;

  public WrongPathException(String message, String path) {
    super(message);
    this.path = path;
  }
}
