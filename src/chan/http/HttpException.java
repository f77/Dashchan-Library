package chan.http;

import chan.content.ChanPerformer;

/**
 * <p>Thrown by HTTP client and {@link ChanPerformer} methods.</p>
 */
public class HttpException extends Exception
{
	private static final long serialVersionUID = 1L;
	
	/**
	 * <p>Constructor for a {@link HttpException} with response code and message.</p>
	 * 
	 * @param responseCode Response code.
	 * @param detailMessage Response message.
	 */
	public HttpException(int responseCode, String detailMessage)
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Constructor for a {@link HttpException} with response code, message and cause.</p>
	 * 
	 * @param responseCode Response code.
	 * @param detailMessage Response message.
	 */
	public HttpException(int responseCode, String detailMessage, Throwable throwable)
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Returns response code.</p>
	 * 
	 * @return Response code.
	 */
	public int getResponseCode()
	{
		throw new IllegalAccessError();
	}
	
	/**
	 * <p>Creates a new instance of {@link HttpException} with {@code 404 (Not Found)} response code and
	 * an appropriate message.</p>
	 * 
	 * @return Exception object.
	 */
	public static HttpException createNotFoundException()
	{
		throw new IllegalAccessError();
	}
}