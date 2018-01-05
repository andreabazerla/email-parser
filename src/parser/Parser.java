package parser;

import exception.ExceptionParser;
import exception.ExceptionReader;
import exception.ExceptionWriter;

public interface Parser<T> {

  void loop() throws ExceptionParser, ExceptionReader, ExceptionWriter;

}
