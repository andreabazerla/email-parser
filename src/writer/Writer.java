package writer;

import exception.ExceptionWriter;

public interface Writer<T> {

  public void write(T t) throws ExceptionWriter;

  public void close() throws ExceptionWriter;

}
