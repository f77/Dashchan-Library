package chan.content;

/**
 * <p>Thrown to inform client about thread redirection. This exceptions is thrown by
 * {@link ChanPerformer#onReadPosts(chan.content.ChanPerformer.ReadPostsData)} when server returned data for
 * another thread or another data that might be considered as redirect to another thread.</p>
 */
public class ThreadRedirectException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * <p>Constructor for {@link ThreadRedirectException}.</p>
	 * 
	 * @param boardName Redirected board name.
	 * @param threadNumber Redirected thread number.
	 * @param postNumber Redirected post number.
	 */
	public ThreadRedirectException(String boardName, String threadNumber, String postNumber)
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Constructor for {@link ThreadRedirectException}. This exception will cause keeping old board name.</p>
	 * 
	 * @param threadNumber Redirected thread number.
	 * @param postNumber Redirected post number.
	 */
	public ThreadRedirectException(String threadNumber, String postNumber)
	{
		throw new IllegalAccessError();
	}
}