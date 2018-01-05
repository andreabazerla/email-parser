package writer;

import exception.ExceptionWriter;
import validator.Validator;

public class WriterConsole<T> extends WriterBasic<T> {

  public WriterConsole() {
    super(null);
  }

  public WriterConsole(Validator<T> validator) {
    super(validator);
  }

  @Override
  public void print(T t) throws ExceptionWriter {
    System.out.println(t.toString());
  }

  @Override
  public void close() throws ExceptionWriter {}

}
