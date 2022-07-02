package service;

import dao.UserDAO;
import model.User;

public class UserBasicService implements UserService
{

	private UserDAO userDao;

	public void setUserDao(UserDAO userDao)
	{
		this.userDao = userDao;
	}

	@Override
	public User read(int userId)
	{
		User user = userDao.readUser(userId);
		return user;
	}

}
