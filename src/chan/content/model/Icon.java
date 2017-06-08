package chan.content.model;

import java.io.Serializable;

import chan.content.ChanLocator;

import android.net.Uri;

/**
 * <p>Model containing post icon.</p>
 */
public final class Icon implements Serializable {
	/**
	 * <p>Constructor for {@link Icon}.</p>
	 *
	 * @param locator {@link ChanLocator} instance to encode URI in model.
	 * @param uri Icon URI.
	 * @param title Icon title.
	 */
	public Icon(ChanLocator locator, Uri uri, String title) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns icon URI.</p>
	 *
	 * @param locator {@link ChanLocator} instance to decode URI in model.
	 */
	public Uri getUri(ChanLocator locator) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns icon title.</p>
	 */
	public String getTitle() {
		throw new IllegalAccessError();
	}
}
