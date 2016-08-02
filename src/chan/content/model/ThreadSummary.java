package chan.content.model;

import android.net.Uri;
import chan.content.ChanLocator;

/**
 * <p>Model containing thread summary: board name, thread number and short description.
 * This model is used in archived threads page, for example.</p>
 */
public final class ThreadSummary
{
	/**
	 * <p>Constructor for {@link ThreadSummary}.</p>
	 * 
	 * @param boardName Board name.
	 * @param threadNumber Thread number.
	 * @param description Short description, may be subject or some first sentences of comment.
	 */
	public ThreadSummary(String boardName, String threadNumber, String description)
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Returns board name.</p>
	 */
	public String getBoardName()
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Returns thread number.</p>
	 */
	public String getThreadNumber()
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Returns thread short description.</p>
	 */
	public String getDescription()
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Returns posts count.</p>
	 */
	public int getPostsCount()
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Stores posts count in this model.</p>
	 */
	public ThreadSummary setPostsCount(int postsCount)
	{
		throw new IllegalAccessError();
	}
}