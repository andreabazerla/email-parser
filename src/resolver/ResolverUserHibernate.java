package resolver;

import model.User;
import parser.ParserExtended;
import service.UserService;

public class ResolverUserHibernate implements ParserExtended.Resolver<User, Integer>
{

	private UserService userService;

	public UserService getUserService()
	{
		return userService;
	}

	public void setUserService(UserService userService)
	{
		this.userService = userService;
	}
	
	@Override
	public User getItem(Integer userId)
	{
		return userService.read((int) userId);
	}

}
