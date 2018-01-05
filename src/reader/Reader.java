package reader;

import exception.ExceptionReader;

public interface Reader<T> {

  public T readItem() throws ExceptionReader;

  public boolean hasNext() throws ExceptionReader;

  public void close() throws ExceptionReader;

}
