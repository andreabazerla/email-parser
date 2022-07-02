package validator;

import exception.ExceptionValidator;
import model.User;

public class ValidatorID implements Validator<User>
{

	@Override
	public boolean validate(User user) throws ExceptionValidator
	{
		if (user.getIDAnagUnica() % 2 == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
