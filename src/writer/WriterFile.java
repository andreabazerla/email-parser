package writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import exception.ExceptionWriter;
import validator.Validator;

public class WriterFile<T> extends WriterBasic<T> {

  private File file;
  private FileWriter fileWriter;
  protected BufferedWriter bufferedWriter;

  public WriterFile(Validator<T> validator) {
    
    super(validator);
    
    this.file = new File("temp.txt");

    try {
      fileWriter = new FileWriter(file);
      bufferedWriter = new BufferedWriter(fileWriter);
    } catch (IOException e) {
      if (fileWriter != null) {
        close();
      }
      e.printStackTrace();
    }

  }

  @Override
  public void close() {
    try {
      fileWriter.close();
      bufferedWriter.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void print(T t) throws ExceptionWriter {
    try {
      bufferedWriter.write(t.toString());
      bufferedWriter.newLine();
      bufferedWriter.flush();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
