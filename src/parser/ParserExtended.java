package parser;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import exception.ExceptionParser;
import exception.ExceptionReader;
import exception.ExceptionValidator;
import exception.ExceptionWriter;
import model.User;
import reader.Reader;
import validator.Validator;
import writer.Writer;

public class ParserExtended<T extends User, K> implements Parser<T>
{

	private Reader<K> reader;
	private Writer<T> writer;
	private Resolver<T, K> resolver;
	private List<Validator<User>> validatorList;
	private SessionFactory sessionFactory;

	public static interface Resolver<T, K>
	{
		public T getItem(K k);
	}

	public ParserExtended(Reader<K> reader,
	                      Writer<T> writer,
	                      Resolver<T, K> resolver)
	{
		this.reader = reader;
		this.writer = writer;
		this.resolver = resolver;
	}

	public void setSessionFactory(SessionFactory sessionFactory)
	{
		this.sessionFactory = sessionFactory;
	}

	public void setValidatorList(List<Validator<User>> validatorList)
	{
		this.validatorList = validatorList;
	}

	@Override
	public void loop() throws ExceptionParser, ExceptionReader, ExceptionWriter, ExceptionValidator, InterruptedException
	{

		while (reader.hasNext())
		{

			Session session = null;
			Transaction transaction = null;

			try
			{
				session = sessionFactory.openSession();
				transaction = session.beginTransaction();

				T t = null;

				K id = reader.readItem();

				t = resolver.getItem(id);

				boolean writeUser = true;
				if (validatorList != null)
				{
					for (Validator<User> validator : validatorList)
					{
						if (!validator.validate(t))
							writeUser = false;
					}
				}

				if (writeUser)
					
					writer.write(t);

				transaction.commit();

			}
			catch (HibernateException e)
			{
				if (transaction != null)
				{
					transaction.rollback();
				}
				e.printStackTrace();
			}
			finally
			{
				session.close();
			}
		}
	}
}
