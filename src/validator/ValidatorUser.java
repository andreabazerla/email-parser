package validator;

import exception.ExceptionValidator;
import model.User;

public class ValidatorUser implements Validator<User>
{

	@Override
	public boolean validate(User user) throws ExceptionValidator
	{
		if (user.getCognomeConiuge() != null && !user.getCognomeConiuge()
		                                             .trim()
		                                             .isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
