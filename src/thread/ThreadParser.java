package thread;

import parser.Parser;

public class ThreadParser<T> implements Runnable
{

	private Parser<T> parser;

	public ThreadParser(Parser<T> parser)
	{
		this.parser = parser;

		System.out.format("%-10s %s\n",
		                  Thread.currentThread()
		                        .getName(),
		                  "THREAD CREATED");
	}

	@Override
	public void run()
	{

		System.out.format("%-10s %s\n",
		                  Thread.currentThread()
		                        .getName(),
		                  "THREAD RUN");

		try
		{
			parser.loop();
		}
		catch (Exception e)
		{
			throw new RuntimeException(e);
		}

		System.out.format("%-10s %s\n",
		                  Thread.currentThread()
		                        .getName(),
		                  "THREAD ENDED");
		

	}

}
