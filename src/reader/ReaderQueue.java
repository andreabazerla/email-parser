package reader;

import java.util.Random;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

import exception.ExceptionReader;
import main.Main;

public class ReaderQueue<T> implements Reader<T>
{

	BlockingQueue<T> queue = new LinkedBlockingQueue<>();

	public ReaderQueue(BlockingQueue<T> queue)
	{
		this.queue = queue;
	}

	@Override
	public boolean hasNext() throws ExceptionReader
	{
		return !queue.isEmpty();
	}

	@Override
	public T readItem() throws ExceptionReader, InterruptedException
	{
		return queue.take();
	}

	@Override
	public void close() throws ExceptionReader
	{}

	public static Object getQueue()
	{

		BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();

		Random random = new Random();
		for (int i = 0; i < Main.RECORD_NUMBER; i++)
			queue.add(random.nextInt(400000));
		
		return new ReaderQueue<>(queue);

	}

}
