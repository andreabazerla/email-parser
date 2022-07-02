package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.User;

public class UserBasicDAO implements UserDAO
{

	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void createUser(User user)
	{}

	@Override
	public User readUser(int userId)
	{
		Session session = sessionFactory.getCurrentSession();
		Transaction transaction = session.beginTransaction();
		User user = (User) session.get(model.User.class,
		                               userId);
		transaction.commit();
		return user;
	}

	@Override
	public User updateUser(User user)
	{
		return null;
	}

	@Override
	public void deleteUser(int userId)
	{}

}
