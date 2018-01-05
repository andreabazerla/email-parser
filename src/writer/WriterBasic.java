package writer;

import exception.ExceptionWriter;
import validator.Validator;

public abstract class WriterBasic<T> implements Writer<T> {

  private Validator<T> validator;

  public WriterBasic(Validator<T> validator) {
    this.validator = validator;
  }

  public abstract void print(T t) throws ExceptionWriter;

  @Override
  public final void write(T t) throws ExceptionWriter {
    
    try {
      boolean temp = validator == null || validator.validate(t);

      if (temp)
        print(t);
      
    } catch (Exception e) {
      throw new ExceptionWriter(e);
    }
    
  }

}
