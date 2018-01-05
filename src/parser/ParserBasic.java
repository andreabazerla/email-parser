package parser;

import exception.ExceptionParser;
import exception.ExceptionReader;
import exception.ExceptionWriter;
import reader.Reader;
import writer.Writer;

public class ParserBasic<T> implements Parser<T> {

  protected Reader<T> reader;
  protected Writer<T> writer;

  public ParserBasic(Reader<T> reader, Writer<T> writer) {
    this.reader = reader;
    this.writer = writer;
  }

  @Override
  public void loop() throws ExceptionParser, ExceptionReader, ExceptionWriter {
    while (reader.hasNext()) {
      T t = reader.readItem();
      if (t.toString() != null && !t.toString().trim().isEmpty()) {
        writer.write(t);
      }
    }
  }

}
