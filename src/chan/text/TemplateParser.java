package chan.text;

/**
 * <p>HTML text parser. This parser is a convenient wrapper over the {@link GroupParser}. Read about wrapped
 * parser before using this one.</p>
 *
 * <p>You can define parsing rules using the following methods:</p>
 *
 * <ul>
 * <li>{@link SimpleRuleBuilder#name(String)}</li>
 * <li>{@link ComplexRuleBuilder#equals(String, String, String)}</li>
 * <li>{@link ComplexRuleBuilder#starts(String, String, String)}</li>
 * <li>{@link ComplexRuleBuilder#contains(String, String, String)}</li>
 * <li>{@link ComplexRuleBuilder#ends(String, String, String)}</li>
 * </ul>
 *
 * <p>And define reaction rules:</p>
 *
 * <ul>
 * <li>{@link OpenBuilder#open(OpenCallback)}</li>
 * <li>{@link ContentBuilder#content(ContentCallback)}</li>
 * <li>{@link SimpleBuilder#close(CloseCallback)}</li>
 * <li>{@link InitialBuilder#text(TextCallback)}</li>
 * </ul>
 *
 * <p>After defining parsing rules you should call {@link InitialBuilder#prepare()} method.
 * Then you can use your parsing calling {@link #parse(String, Object)} method.</p>
 */
public final class TemplateParser<H> {
	TemplateParser() {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Creates a new parser builder.</p>
	 *
	 * @param <H> Holder object type.
	 * @return Template parser builder.
	 */
	public static <H> InitialBuilder<H> builder() {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Starts a new parsing process.</p>
	 *
	 * @param source String to parse.
	 * @param holder Intermediate data holder during parsing process.
	 * @throws ParseException when parsing process was interrupted.
	 */
	public void parse(String source, H holder) throws ParseException {
		throw new IllegalAccessError();
	}

	/**
	 * <p>Attributes holder and parser.</p>
	 */
	public static final class Attributes {
		Attributes() {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Parses the attribute and returns its value if attribute exists.</p>
		 *
		 * @param attribute Attribute name.
		 * @return Attribute value.
		 */
		public String get(String attribute) {
			throw new IllegalAccessError();
		}
	}

	/**
	 * <p>Parsing process holder.</p>
	 */
	public static final class Instance {
		Instance() {
			throw new IllegalAccessError();
		}

		/**
		 * <p>Finishes a parsing process. Calling this method doesn't interrupt your working callback.</p>
		 */
		public void finish() {
			throw new IllegalAccessError();
		}
	}

	/**
	 * <p>Tag open callback.</p>
	 */
	public interface OpenCallback<H> {
		/**
		 * <p>Tag open callback method. See {@link OpenBuilder#open(OpenCallback)}.</p>
		 *
		 * @param instance Parser instance holder.
		 * @param holder Intermediate data holder.
		 * @param tagName Tag name.
		 * @param attributes Attributes holder.
		 * @return True if parser should parser full tag content.
		 * @throws ParseException to interrupt parsing process.
		 */
		public boolean onOpen(Instance instance, H holder, String tagName, Attributes attributes) throws ParseException;
	}

	/**
	 * <p>Tag full content callback.</p>
	 */
	public interface ContentCallback<H> {
		/**
		 * <p>Tag full content method. See {@link ContentBuilder#content(ContentCallback)}.</p>
		 *
		 * @param instance Parser instance holder.
		 * @param holder Intermediate data holder.
		 * @param text Full tag content.
		 * @throws ParseException to interrupt parsing process.
		 */
		public void onContent(Instance instance, H holder, String text) throws ParseException;
	}

	/**
	 * <p>Tag close callback.</p>
	 */
	public interface CloseCallback<H> {
		/**
		 * <p>Tag close callback method. See {@link SimpleBuilder#close(CloseCallback)}.</p>
		 *
		 * @param instance Parser instance holder.
		 * @param holder Intermediate data holder.
		 * @param tagName Tag name.
		 * @throws ParseException to interrupt parsing process.
		 */
		public void onClose(Instance instance, H holder, String tagName) throws ParseException;
	}

	/**
	 * <p>Text between tags callback.</p>
	 */
	public interface TextCallback<H> {
		/**
		 * <p>Text between tags callback method. See {@link InitialBuilder#text(TextCallback)}.</p>
		 *
		 * @param instance Parser instance holder.
		 * @param holder Intermediate data holder.
		 * @param source Source string.
		 * @param start Start index of text.
		 * @param end End index of text.
		 * @throws ParseException to interrupt parsing process.
		 */
		public void onText(Instance instance, H holder, String source, int start, int end) throws ParseException;
	}

	/**
	 * <p>Parser builder.</p>
	 */
	public interface SimpleRuleBuilder<H> {
		/**
		 * <p>Indicates the parser to react on {@code tagName} tags.</p>
		 *
		 * @param tagName Tag name.
		 * @return Parser builder.
		 */
		public SimpleBuilder<H> name(String tagName);
	}

	/**
	 * <p>Parser builder.</p>
	 */
	public interface ComplexSimpleRuleBuilder<H> {
		/**
		 * <p>Indicates the parser to react on {@code tagName} tags.</p>
		 *
		 * @param tagName Tag name.
		 * @return Parser builder.
		 */
		public ComplexBuilder<H> name(String tagName);
	}

	/**
	 * <p>Parser builder.</p>
	 */
	public interface ComplexRuleBuilder<H> {
		/**
		 * <p>Indicates the parser to react on {@code tagName} tags which has an {@code attribute}
		 * equals {@code value}.</p>
		 *
		 * @param tagName Tag name.
		 * @param attribute Attribute name.
		 * @param value Attribute value.
		 * @return Parser builder.
		 */
		public ComplexBuilder<H> equals(String tagName, String attribute, String value);

		/**
		 * <p>Indicates the parser to react on {@code tagName} tags which has an {@code attribute}
		 * starts with {@code value}.</p>
		 *
		 * @param tagName Tag name.
		 * @param attribute Attribute name.
		 * @param value Attribute value.
		 * @return Parser builder.
		 */
		public ComplexBuilder<H> starts(String tagName, String attribute, String value);

		/**
		 * <p>Indicates the parser to react on {@code tagName} tags which has an {@code attribute}
		 * contains {@code value}.</p>
		 *
		 * @param tagName Tag name.
		 * @param attribute Attribute name.
		 * @param value Attribute value.
		 * @return Parser builder.
		 */
		public ComplexBuilder<H> contains(String tagName, String attribute, String value);

		/**
		 * <p>Indicates the parser to react on {@code tagName} tags which has an {@code attribute}
		 * ends with {@code value}.</p>
		 *
		 * @param tagName Tag name.
		 * @param attribute Attribute name.
		 * @param value Attribute value.
		 * @return Parser builder.
		 */
		public ComplexBuilder<H> ends(String tagName, String attribute, String value);
	}

	/**
	 * <p>Parser builder.</p>
	 */
	public interface OpenBuilder<H> {
		/**
		 * <p>Defines a reaction callback when tag opened. This callback determines whether parser should parse
		 * the full tag content and call content callback or not depending on the return value. If you don't
		 * specify this callback parser will parse full content anyway.</p>
		 *
		 * @param openCallback Tag open callback.
		 * @return Parser builder.
		 * @see GroupParser.Callback#onStartElement(GroupParser, String, String)
		 */
		public ContentBuilder<H> open(OpenCallback<H> openCallback);

		/**
		 * <p>Defines a reaction callback when full tag content parsed. This callback may be not called if
		 * open callback returned a {@code false} value.</p>
		 *
		 * @param contentCallback Tag content callback.
		 * @return Parser builder.
		 * @see GroupParser.Callback#onGroupComplete(GroupParser, String)
		 */
		public InitialBuilder<H> content(ContentCallback<H> contentCallback);
	}

	/**
	 * <p>Parser builder.</p>
	 */
	public interface InitialBuilder<H> extends SimpleRuleBuilder<H>, ComplexRuleBuilder<H> {
		/**
		 * <p>Defines a reaction callback on text between tags. This callback doesn't depend on any rules.</p>
		 *
		 * @param textCallback Text between tags callback.
		 * @return Parser builder.
		 * @see GroupParser.Callback#onText(GroupParser, String, int, int)
		 */
		public InitialBuilder<H> text(TextCallback<H> textCallback);

		/**
		 * <p>Creates a parser from builder.</p>
		 *
		 * @return Parser instance.
		 */
		public TemplateParser<H> prepare();
	}

	/**
	 * <p>Parser builder.</p>
	 */
	public interface SimpleBuilder<H> extends SimpleRuleBuilder<H>, ComplexRuleBuilder<H>, OpenBuilder<H> {
		/**
		 * <p>Defines a reaction callback when tag closed. Parser can react only on {@link #name(String)} rule.</p>
		 *
		 * @param closeCallback Tag close callback.
		 * @return Parser builder.
		 * @see GroupParser.Callback#onEndElement(GroupParser, String)
		 */
		public InitialBuilder<H> close(CloseCallback<H> closeCallback);
	}

	/**
	 * <p>Parser builder.</p>
	 */
	public interface ComplexBuilder<H> extends ComplexSimpleRuleBuilder<H>, ComplexRuleBuilder<H>, OpenBuilder<H> {}

	/**
	 * <p>Parser builder.</p>
	 */
	public interface ContentBuilder<H> extends InitialBuilder<H> {
		/**
		 * <p>Defines a reaction callback when full tag content parsed. This callback may be not called if
		 * open callback returned a {@code false} value.</p>
		 *
		 * @param contentCallback Tag content callback.
		 * @return Parser builder.
		 * @see GroupParser.Callback#onGroupComplete(GroupParser, String)
		 */
		public InitialBuilder<H> content(ContentCallback<H> contentCallback);
	}
}