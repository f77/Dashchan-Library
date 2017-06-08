package chan.content.model;

import android.net.Uri;

/**
 * <p>This class can handle some embedded links. See {@link EmbeddedAttachment#obtain(String)}.</p>
 */
public final class EmbeddedAttachment implements Attachment {
	/**
	 * Embedded file content type.
	 */
	public enum ContentType {
		/**
		 * Audio file.
		 */
		AUDIO,

		/**
		 * Video file.
		 */
		VIDEO
	}

	/**
	 * <p>Constructor for {@link EmbeddedAttachment}.</p>
	 *
	 * <p>By default file name will be obtain from the last path segment of file URI. You can override this name
	 * with {@code forcedName} argument.</p>
	 *
	 * @param fileUri File or page URI.
	 * @param thumbnailUri Thumbnail URI.
	 * @param embeddedType Embedded file type string. For example, "YouTube".
	 * @param contentType Content type.
	 * @param canDownload If fileUri is direct file URI, you can pass {@code true}. This allows user to download file.
	 * @param forcedName Overridden file name.
	 */
	public EmbeddedAttachment(Uri fileUri, Uri thumbnailUri, String embeddedType, ContentType contentType,
			boolean canDownload, String forcedName) {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns attachment file URI.</p>
	 */
	public Uri getFileUri() {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns attachment thumbnail URI.</p>
	 */
	public Uri getThumbnailUri() {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns attachment embedded type.</p>
	 */
	public String getEmbeddedType() {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns attachment content type.</p>
	 */
	public ContentType getContentType() {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether attachment could be downloaded by it's file URI.</p>
	 */
	public boolean isCanDownload() {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns forced file name.</p>
	 */
	public String getForcedName() {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns {@link EmbeddedAttachment} if client support this type by itself.</p>
	 *
	 * <p>List of supported embedded types:</p>
	 *
	 * <ul>
	 * <li>YouTube</li>
	 * <li>Vimeo</li>
	 * <li>Vocaroo</li>
	 * </ul>
	 *
	 * <p>You can pass any string as {@code data} argument that contains links from the list above including strings
	 * with {@code embed} or {@code iframe} HTML tags. Application will try to find links by itself.</p>
	 *
	 * @param data String with URI.
	 * @return {@link EmbeddedAttachment} instance or {@code null} if embedded link is not supported.
	 */
	public static EmbeddedAttachment obtain(String data) {
		throw new IllegalAccessError();
	}
}
