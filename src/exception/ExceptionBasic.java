package exception;

public class ExceptionBasic extends Exception {

  private static final long serialVersionUID = 1L;

  public ExceptionBasic(Exception e) {
    super(e);
  }

}
