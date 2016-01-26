package chan.content.model;

import java.util.Collection;

/**
 * <p>Model containing threads data.</p>
 * 
 * <p>This class holds an array of threads ({@link Posts} instances). Use default constructors to store an array.</p>
 * 
 * <p>If your chan provides board speed data, you can use {@link #setBoardSpeed(int)} to store it.</p>
 */
public final class Threads
{
	/**
	 * <p>Returns board speed value.</p>
	 */
	public int getBoardSpeed()
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Stores board speed value (number of posts per hour) in this model.</p>
	 * 
	 * @param boardSpeed Number of posts per hour.
	 * @return This model.
	 */
	public Threads setBoardSpeed(int boardSpeed)
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Constructor for {@link Threads} with given {@code threads}.</p>
	 * 
	 * @param threads Array of {@link Posts}.
	 */
	public Threads(Posts... threads)
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Constructor for {@link Threads} with given {@code threads} that will be transformed to array.</p>
	 * 
	 * @param threads Collection of {@link Posts}.
	 */
	public Threads(Collection<? extends Posts> threads)
	{
		throw new IllegalAccessError();
	}
}