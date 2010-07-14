package com.google.code.facebookapi;

import java.io.Serializable;

import org.json.JSONObject;

/**
 * A simple data structure for storing a story-template used in the feed_registerTemplateBundle API call.
 */
@SuppressWarnings("serial")
@Deprecated
public class BundleStoryTemplate implements Serializable {

	private String body;
	private String title;

	/**
	 * Constructor. If you use this version, you must make sure you set both the 'title' and 'body' fields before trying to submit your template, otherwise it will not
	 * serialize correctly.
	 */
	public BundleStoryTemplate() {
		this.title = null;
		this.body = null;
	}

	/**
	 * Constructor.
	 * 
	 * @param title
	 *            the title to show for this template.
	 * @param body
	 *            the body content for this template.
	 */
	public BundleStoryTemplate( String title, String body ) {
		this.title = title;
		this.body = body;
	}

	/**
	 * @return a JSON representation of this template.
	 */
	public JSONObject toJson() {
		JSONObject result = new JSONObject();
		try {
			result.put( "template_title", title == null ? "" : title );
			result.put( "template_body", body == null ? "" : body );
		}
		catch ( Exception ignored ) {
			// ignore
		}
		return result;
	}

	/**
	 * @return the body of this template.
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body
	 *            the body content to set.
	 */
	public void setBody( String body ) {
		this.body = body;
	}

	/**
	 * @return the title to display for this template.
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title
	 *            the title to set.
	 */
	public void setTitle( String title ) {
		this.title = title;
	}

}
