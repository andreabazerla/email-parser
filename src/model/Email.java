package model;

public class Email {

  private String email;
  
  public Email(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
  
  public char getChar() {
    return email.charAt(0);
  }

  @Override
  public String toString() {
    return email;
  }
  
}
