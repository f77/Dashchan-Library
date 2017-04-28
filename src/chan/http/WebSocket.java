package chan.http;

import android.net.Uri;

/**
 * <p>Web socket request builder and executor.</p>
 */
public final class WebSocket {
	/**
	 * <p>Read data holder.</p>
	 */
	public static class Event {
		Event() {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Converts and results event data as {@link HttpResponse} instance.</p>
		 */
		public HttpResponse getResponse() {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Returns whether event data is binary.</p>
		 */
		public boolean isBinary() {
			throw new IllegalAccessError();
		}

		/**
		 * @see Connection#store(String, Object)
		 */
		public void store(String key, Object object) {
			throw new IllegalAccessError();
		}

		/**
		 * @see Connection#get(String)
		 */
		public <T> T get(String key) {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Stores result to {@link Connection} instance to unlock running {@link Connection#await(Object...)}
		 * method.</p>
		 *
		 * @see Connection#await(Object...)
		 */
		public void complete(Object result) {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Safe close of {@link Connection} instance. Use this method instead of {@link Connection#close()}
		 * directly.</p>
		 */
		public void close() {
			throw new IllegalAccessError();
		}
	}

	/**
	 * <p>Callback for read socket data.</p>
	 */
	public interface EventHandler {
		/**
		 * <p>Callback method.</p>
		 *
		 * <p>This method is invoked from a separate thread, so you should use synchronization
		 * to access data from thread with running web socket. You can use {@link Event#store(String, Object)}
		 * and {@link Event#get(String)} methods for this purpose.</p>
		 *
		 * @param event Event data.
		 */
		public void onEvent(Event event);
	}

	/**
	 * <p>Constructor for {@link WebSocket}.</p>
	 *
	 * @param uri URI for request.
	 * @param holder {@link HttpHolder} instance. May be null.
	 * @param preset Preset with configuration.
	 */
	public WebSocket(Uri uri, HttpHolder holder, HttpRequest.Preset preset) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Constructor for {@link WebSocket} without preset.</p>
	 *
	 * @param uri URI for request.
	 * @param holder {@link HttpHolder} instance. May be null.
	 */
	public WebSocket(Uri uri, HttpHolder holder) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Constructor for {@link WebSocket}. In most cases {@link HttpRequest.Preset} can provide it's own
	 * {@link HttpHolder}, so you can use this constructor.</p>
	 *
	 * @param uri URI for request.
	 * @param preset Preset with configuration.
	 */
	public WebSocket(Uri uri, HttpRequest.Preset preset) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Add a header with given {@code name} and {@code value}.</p>
	 *
	 * @param name Header name.
	 * @param value Header value.
	 * @return This builder.
	 */
	public WebSocket addHeader(String name, String value) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Add a cookie with given {@code name} and {@code value}.</p>
	 *
	 * @param name Cookie name.
	 * @param value Cookie value.
	 * @return This builder.
	 * @see CookieBuilder
	 */
	public WebSocket addCookie(String name, String value) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Add a cookie string.</p>
	 *
	 * @param cookie Cookie string.
	 * @return This builder.
	 * @see CookieBuilder
	 */
	public WebSocket addCookie(String cookie) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Add a {@link CookieBuilder} and concatenate it with existing one.</p>
	 *
	 * @param builder {@link CookieBuilder} instance.
	 * @return This builder.
	 * @see CookieBuilder
	 */
	public WebSocket addCookie(CookieBuilder builder) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Sets the timeouts of connection.</p>
	 *
	 * @param connectTimeout TCP handshake timeout in milliseconds.
	 * @param readTimeout Max delay in milliseconds between reading data.
	 * @return This builder.
	 */
	public WebSocket setTimeouts(int connectTimeout, int readTimeout) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Opens a WebSocket connection.</p>
	 *
	 * @param handler Event handler for incoming data.
	 * @return Connection instance.
	 * @throws HttpException if HTTP exception occurred.
	 */
	public Connection open(EventHandler handler) throws HttpException {
		throw new IllegalAccessError();
	}

	/**
	 * <p>WebSocker connection instance.</p>
	 */
	public class Connection {
		/**
		 * <p>Sends a text data to socket.</p>
		 *
		 * @param text Text data.
		 * @return this connection.
		 * @throws HttpException if HTTP exception occurred.
		 */
		public Connection sendText(String text) throws HttpException {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Sends a binary data to socket.</p>
		 *
		 * @param data Binary data.
		 * @return this connection.
		 * @throws HttpException if HTTP exception occurred.
		 */
		public Connection sendBinary(byte[] data) throws HttpException {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Wait until {@link Event#complete(Object)} call. You can provide multiple {@code results}
		 * and wait until at least one of them will be gotten.</p>
		 *
		 * @param results Array of results to await.
		 * @return this connection.
		 * @throws HttpException if HTTP exception occurred.
		 * @see Event#complete(Object)
		 */
		public Connection await(Object... results) throws HttpException {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Adds data to thread-safe container.</p>
		 *
		 * @param key Data key.
		 * @param data Data value.
		 * @return this connection.
		 */
		public Connection store(String key, Object data) {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Retrieves data from thread-safe container.</p>
		 *
		 * @param key Data key.
		 * @return Data value.
		 */
		public <T> T get(String key) {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Closes websocket connection.</p>
		 *
		 * @return this connection.
		 * @throws HttpException if HTTP exception occurred.
		 */
		public Result close() throws HttpException {
			throw new IllegalAccessError();
		}
	}

	/**
	 * <p>Connection result holder.</p>
	 */
	public class Result {
		/**
		 * <p>Retrieves data from thread-safe container.</p>
		 *
		 * @param key Data key.
		 * @return Data value.
		 */
		public <T> T get(String key) {
			throw new IllegalAccessError();
		}
	}
}