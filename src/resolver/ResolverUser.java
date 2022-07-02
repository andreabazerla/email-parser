package resolver;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import database.DatabaseConfig;
import database.Query;
import model.User;
import parser.ParserExtended;

public class ResolverUser implements ParserExtended.Resolver<User, Integer>
{

	private DataSource dataSource;

	public ResolverUser()
	{}

	public void setDataSource(DataSource dataSource)
	{
		this.dataSource = dataSource;
	}

	@Override
	public User getItem(Integer id)
	{

		User user = null;

		Query query = new Query("AltriDatiAnagraficaUnica",
		                        id);

		try
		{
			Class.forName(DatabaseConfig.DATABASE_DRIVER_MSSQL);

			try (Connection connection = dataSource.getConnection(); Statement statement = connection.createStatement(); ResultSet resultSet = statement.executeQuery(query.toString()))
			{

				resultSet.next();

				int columnNumber = 0;

				try
				{
					columnNumber = resultSet.getMetaData()
					                        .getColumnCount();
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
				}

				List<String> resultArray = new ArrayList<>();
				for (int i = 0; i < columnNumber; i++)
				{
					String field = null;
					try
					{
						field = resultSet.getString(i + 1);
						resultArray.add(field);
					}
					catch (SQLException e)
					{
						e.printStackTrace();
					}
				}

				return new User(Integer.parseInt(resultArray.get(0)),
				                resultArray.get(1),
				                resultArray.get(2),
				                resultArray.get(3),
				                resultArray.get(4),
				                resultArray.get(5),
				                resultArray.get(6),
				                resultArray.get(7),
				                resultArray.get(8),
				                resultArray.get(9),
				                resultArray.get(10),
				                resultArray.get(11),
				                resultArray.get(12),
				                resultArray.get(13),
				                resultArray.get(14),
				                resultArray.get(15),
				                resultArray.get(16),
				                resultArray.get(17),
				                resultArray.get(18),
				                resultArray.get(19),
				                resultArray.get(20),
				                resultArray.get(21),
				                resultArray.get(22),
				                resultArray.get(23),
				                resultArray.get(24),
				                resultArray.get(25),
				                resultArray.get(26),
				                resultArray.get(27),
				                resultArray.get(28),
				                resultArray.get(29),
				                resultArray.get(30),
				                resultArray.get(31),
				                resultArray.get(32),
				                resultArray.get(33),
				                resultArray.get(34),
				                resultArray.get(35),
				                resultArray.get(36),
				                resultArray.get(37),
				                resultArray.get(38),
				                resultArray.get(39));
			}
			catch (Exception e)
			{
				e.printStackTrace();
			}
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}

		return user;

	}

	

}
