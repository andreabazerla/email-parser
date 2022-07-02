package resolver;

public class ResolverFactory
{

	public enum ItemType
	{
		USER,
		USER_HIBERNATE
	};

	public static Object getResolver(ItemType itemType)
	{
		switch (itemType)
		{
			case USER:
				return new ResolverUser();
				
			case USER_HIBERNATE:
				return new ResolverUserHibernate();
		}

		throw new RuntimeException("Error about type: " + itemType);
	}
}
