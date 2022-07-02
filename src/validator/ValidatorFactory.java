package validator;

import java.util.ArrayList;
import java.util.List;

public class ValidatorFactory
{

	List<ValidatorType> validatorTypeList;

	public ValidatorFactory(List<ValidatorType> validatorTypeList)
	{
		this.validatorTypeList = validatorTypeList;
	}

	public enum ValidatorType
	{
		ID, USER, COGNOME
	}

	public static Object getValidatorList(List<ValidatorType> validatorTypeList)
	{

		List<Object> validatorList = new ArrayList<>();	
		
		for (ValidatorType validatorType : validatorTypeList)
		{
			switch (validatorType)
			{
				case ID:
					validatorList.add(new ValidatorID());
					break;
				
				case USER:
					validatorList.add(new ValidatorUser());
					break;

				case COGNOME:
					validatorList.add(new ValidatorCognome());
					break;

				default:
					throw new RuntimeException("Error of type");
			}
		}

		return validatorList;

	}

}
