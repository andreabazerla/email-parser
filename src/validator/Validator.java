package validator;

import exception.ExceptionValidator;

public interface Validator<T> {

  public boolean validate(T t) throws ExceptionValidator;
  
}
