package parser;

import java.util.regex.Pattern;
import objects.Email;

public final class Regex {

  public static final String EMAIL_REGEX_CUSTOM =
      "^((([a-zA-Z0-9'!#$%’*+\\-/=?^_`{|}~]+)\\.)*([a-zA-Z0-9'!#$%’*+\\-/=?^_`{|}~])+@(([a-zA-Z0-9]+\\-+)|([a-zA-Z0-9]+\\.))*([a-zA-Z0-9]+)\\.([a-zA-Z]{2,})){1,255}$";

  public static final String EMAIL_REGEX_JAVASCRIPT =
      "^([a-zA-Z0-9_\\-])([a-zA-Z0-9_\\-\\.\\']*)@(\\[((25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\.){3}|((([a-zA-Z0-9\\-]+)\\.)+))([a-zA-Z]{2,}|(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9][0-9]|[0-9])\\])$";

  public static final String EMAIL_REGEX_JAVA =
      "^(([A-Za-z0-9]+_+)|([A-Za-z0-9]+\\-+)|([A-Za-z0-9]+\\.+)|([A-Za-z0-9]+\\'+)|([A-Za-z0-9]+\\++))*[A-Za-z0-9\\-_]+@((\\w+\\-+)|(\\w+\\.))*\\w{1,63}\\.[a-zA-Z]{2,9}$";
  
  public static boolean isValidEmail(String regex, Email email) {
    if (email.toString() != null && !email.toString().trim().isEmpty()) {
      return Pattern.matches(regex, email.toString());
    }
    return true;
  }
  
}
