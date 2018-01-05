package parser;

import exception.ExceptionReader;
import exception.ExceptionWriter;
import objects.Email;
import reader.Reader;
import writer.Writer;

public class ParserEmail extends ParserBasic<Email> {

  public ParserEmail(Reader<Email> reader, Writer<Email> writer) {
    super(reader, writer);
  }

  @Override
  public void loop() throws ExceptionReader, ExceptionWriter {
    while (reader.hasNext()) {
      Email email = reader.readItem();
      if (email.toString() != null && !email.toString().trim().isEmpty()) {
        if (!Regex.isValidEmail(Regex.EMAIL_REGEX_CUSTOM, email)) {
          writer.write(email);
        }
      }
    }
  }

}
