package validator;

import model.User;

public class ValidatorCognome extends ValidatorUser
{

	public boolean validate(User user)
	{
		if (user.getCognomeConiuge() != null && !user.getCognomeConiuge()
		                                             .trim()
		                                             .isEmpty()
		    && user.getCognomeConiuge()
		           .substring(0,
		                      1)
		           .equals("C"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}
