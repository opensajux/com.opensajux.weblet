/**
 * 
 */
package com.opensajux.weblet;

/**
 * @author Sheikh Mohammad Sajid
 * 
 */
public class WebletMode {

	public final static WebletMode EDIT = new WebletMode("edit");
	public final static WebletMode HELP = new WebletMode("help");
	public final static WebletMode VIEW = new WebletMode("view");

	private String name;

	public WebletMode(String name) {
		this.name = name.toLowerCase();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof WebletMode))
			return false;
		WebletMode mode = (WebletMode) obj;
		return this.name.equals(mode.name);
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public String toString() {
		return name;
	}
}
