package dao;

import model.User;

public interface UserDAO
{

	public void createUser(User user);

	public User readUser(int userId);

	public User updateUser(User user);

	public void deleteUser(int userId);

}
