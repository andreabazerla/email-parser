package main;

import java.util.regex.Pattern;
import database.Database;
import database.Query;
import exception.ExceptionParser;
import exception.ExceptionReader;
import exception.ExceptionValidator;
import exception.ExceptionWriter;
import objects.Email;
import parser.Parser;
import parser.ParserBasic;
import parser.Regex;
import reader.Reader;
import reader.ReaderDatabaseMSSQL;
import validator.Validator;
import writer.Writer;
import writer.WriterConsole;
import writer.WriterFile;

public class Main {

  public static void main(String[] args) {

    String username = "fqprod_wrk";
    String password = "fqprod_1Qweb";
    String serverName = "192.168.44.25";
    String databaseName = "QWEBACLI_SUITE";

    String tableName = "AltriDatiAnagraficaUnica";
    String primaryKey = "IDANAGUNICA";
    String emailColumn = "Email";

    Database database = new Database(username, password, serverName, databaseName);
    Query query = new Query(tableName, primaryKey, emailColumn);
    
    Validator<Email> validator = new Validator<Email>() {
      @Override
      public boolean validate(Email email) throws ExceptionValidator {
        return !Pattern.matches(Regex.EMAIL_REGEX_CUSTOM, email.toString());
      }
    };

    Reader<Email> reader = new ReaderDatabaseMSSQL<Email>(database, query);
    Writer<Email> writer = new WriterConsole<Email>(validator);
    Parser<Email> parser = new ParserBasic<Email>(reader, writer);

    try {
      try {
        parser.loop();
      } catch (ExceptionReader e) {
        e.printStackTrace();
      } catch (ExceptionWriter e) {
        e.printStackTrace();
      }
    } catch (ExceptionParser e) {
      e.printStackTrace();
    }
  }

}
