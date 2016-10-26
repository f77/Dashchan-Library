package chan.content.model;

import java.io.Serializable;
import java.util.Collection;

import chan.content.ChanMarkup;

/**
 * <p>Model containing post data.</p>
 *
 * <p>You can describe thread number and post number with the following methods:</p>
 *
 * <ul>
 * <li>{@link Post#setThreadNumber(String)}</li>
 * <li>{@link Post#setParentPostNumber(String)}</li>
 * <li>{@link Post#setPostNumber(String)}</li>
 * </ul>
 */
public final class Post implements Serializable, Comparable<Post>
{
	private static final long serialVersionUID = 1L;

	/**
	 * <p>Returns real thread number with this post.</p>
	 */
	public String getThreadNumber()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores thread number in this model. Usually thread number equals original post number, so in most cases
	 * you shouldn't use this method.</p>
	 *
	 * @param threadNumber Thread number.
	 * @return This model.
	 */
	public Post setThreadNumber(String threadNumber)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns parent post number.</p>
	 */
	public String getParentPostNumber()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores parent post number for this post. In chan context parent post number must be equal original post
	 * number which means all posts are replies to original one. The parent post number stored for original post
	 * must be {@code null}.</p>
	 *
	 * @param parentPostNumber Parent post number.
	 * @return This model.
	 */
	public Post setParentPostNumber(String parentPostNumber)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns post number.</p>
	 */
	public String getPostNumber()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores post number for this post.</p>
	 *
	 * @param postNumber Post number.
	 * @return This model.
	 */
	public Post setPostNumber(String postNumber)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns date of post created.</p>
	 */
	public long getTimestamp()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores date of post created in this model.</p>
	 *
	 * @param timestamp UNIX timestamp.
	 * @return This model.
	 */
	public Post setTimestamp(long timestamp)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns post subject.</p>
	 */
	public String getSubject()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores post subject in this model.</p>
	 *
	 * @param subject Post subject.
	 * @return This model.
	 */
	public Post setSubject(String subject)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns post comment.</p>
	 */
	public String getComment()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores post comment in this model.</p>
	 *
	 * @param comment Post comment.
	 * @return This model.
	 */
	public Post setComment(String comment)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns post original comment markup.</p>
	 *
	 * <p>This method calls when application want to get original comment markup. By default {@link ChanMarkup} provides
	 * unmark operation, but you can override this method and provide more correct operation if it possible.</p>
	 */
	public String getCommentMarkup()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores post original comment markup in this model.</p>
	 *
	 * <p>By default {@link ChanMarkup} provides unmark operation. Some chans stores original markup along with
	 * parsed comment, so you can simplify and precisify unmark operation with this method.</p>
	 *
	 * @param commentMarkup Post comment markup.
	 * @return This model.
	 */
	public Post setCommentMarkup(String commentMarkup)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns poster name.</p>
	 */
	public String getName()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores poster name in this model.</p>
	 *
	 * @param name Poster name.
	 * @return This model.
	 */
	public Post setName(String name)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns poster identifier.</p>
	 */
	public String getIdentifier()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores poster identifier (an unique poster number or name within the thread) in this model.</p>
	 *
	 * @param identifier Poster identifier.
	 * @return This model.
	 */
	public Post setIdentifier(String identifier)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns poster tripcode.</p>
	 */
	public String getTripcode()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores poster tripcode in this model. Tripcode <strong>must include</strong> {@code !} characters.</p>
	 *
	 * @param tripcode Poster tripcode.
	 * @return This model.
	 */
	public Post setTripcode(String tripcode)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns poster capcode.</p>
	 */
	public String getCapcode()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores poster capcode in this model. Capcode <strong>must not contain</strong> {@code #} characters.</p>
	 *
	 * @param capcode Poster capcode.
	 * @return This model.
	 */
	public Post setCapcode(String capcode)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns poster email.</p>
	 */
	public String getEmail()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores poster email in this model. You must handle "sage" mails by yourself using
	 * {@link #setSage(boolean)} method.</p>
	 *
	 * @param email Poster email.
	 * @return This model.
	 */
	public Post setEmail(String email)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns attachments count.</p>
	 */
	public int getAttachmentsCount()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns attachment at given {@code index}.</p>
	 */
	public Attachment getAttachmentAt(int index)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores attachments in this model.</p>
	 *
	 * @param attachments Array of {@link Attachment}.
	 * @return This model.
	 */
	public Post setAttachments(Attachment... attachments)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores attachments in this model.</p>
	 *
	 * @param attachments Collection of {@link Attachment}.
	 * @return This model.
	 */
	public Post setAttachments(Collection<? extends Attachment> attachments)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns icons count.</p>
	 */
	public int getIconsCount()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns icon at given {@code index}.</p>
	 */
	public Icon getIconAt(int index)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores icons in this model.</p>
	 *
	 * @param icons Array of {@link Icon}.
	 * @return This model.
	 */
	public Post setIcons(Icon... icons)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores icons in this model.</p>
	 *
	 * @param icons Collection of {@link Icon}.
	 * @return This model.
	 */
	public Post setIcons(Collection<? extends Icon> icons)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether post contains sage mark.</p>
	 */
	public boolean isSage()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether post contains sage mark (in email or another field) and doesn't bump a thread.</p>
	 *
	 * @param sage True if post contains sage mark, false otherwise.
	 * @return This model.
	 */
	public Post setSage(boolean sage)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether thread is sticky.</p>
	 */
	public boolean isSticky()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether thread is sticky. Will be ignored by application if post is not original.</p>
	 *
	 * @param sticky True if thread is sticky, false otherwise.
	 * @return This model.
	 */
	public Post setSticky(boolean sticky)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether thread is closed.</p>
	 */
	public boolean isClosed()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether thread is closed. Will be ignored by application if post is not original.</p>
	 *
	 * @param closed True if thread is closed, false otherwise.
	 * @return This model.
	 */
	public Post setClosed(boolean closed)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether thread is archived.</p>
	 */
	public boolean isArchived()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether thread is archived. Will be ignored by application if post is not original.</p>
	 *
	 * @param archived True if thread is archived, false otherwise.
	 * @return This model.
	 */
	public Post setArchived(boolean archived)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether thread is cyclical.</p>
	 */
	public boolean isCyclical()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether thread is cyclical. Will be ignored by application if post is not original.</p>
	 *
	 * @param cyclical True if thread is cyclical, false otherwise.
	 * @return This model.
	 */
	public Post setCyclical(boolean cyclical)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether poster was warned by moderator.</p>
	 */
	public boolean isPosterWarned()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether poster was warned by moderator.</p>
	 *
	 * @param posterWarned True if poster was warned, false otherwise.
	 * @return This model.
	 */
	public Post setPosterWarned(boolean posterWarned)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether poster was banned by moderator.</p>
	 */
	public boolean isPosterBanned()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether poster was banned by moderator.</p>
	 *
	 * @param posterBanned True if poster was banned, false otherwise.
	 * @return This model.
	 */
	public Post setPosterBanned(boolean posterBanned)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether post was written by original poster.</p>
	 */
	public boolean isOriginalPoster()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether post was written by original poster.</p>
	 *
	 * @param originalPoster True if post was written by original poster, false otherwise.
	 * @return This model.
	 */
	public Post setOriginalPoster(boolean originalPoster)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether poster name is default.</p>
	 */
	public boolean isDefaultName()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether poster name is default. In this case it may be hidden in posts list.</p>
	 *
	 * @param defaultName True if poster name is default, false otherwise.
	 * @return This model.
	 */
	public Post setDefaultName(boolean defaultName)
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Returns whether bump limit reached.</p>
	 */
	public boolean isBumpLimitReached()
	{
		throw new IllegalAccessError();
	}

	/**
	 * <p>Stores whether thread reached a bump limit. In this case user will see an icon.</p>
	 *
	 * @param bumpLimitReached True if bump limit reached, false otherwise.
	 * @return This model.
	 */
	public Post setBumpLimitReached(boolean bumpLimitReached)
	{
		throw new IllegalAccessError();
	}

	@Override
	public int compareTo(Post another)
	{
		throw new IllegalAccessError();
	}
}