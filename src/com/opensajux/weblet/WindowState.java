/**
 * 
 */
package com.opensajux.weblet;

/**
 * The <code>WindowState</code> class represents the possible window states that
 * a weblet window can assume.
 * 
 * This class defines a standard set of the most basic weblet window states.
 * Additional window states may be defined by calling the constructor of this
 * class.
 * 
 * @author Sheikh Mohammad Sajid
 * 
 */
public class WindowState {
	public final static WindowState MAXIMIZED = new WindowState("maximized");
	public final static WindowState MINIMIZED = new WindowState("minimized");
	public final static WindowState NORMAL = new WindowState("normal");

	private String name;

	public WindowState(String name) {
		this.name = name.toLowerCase();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null || !(obj instanceof WindowState))
			return false;
		WindowState mode = (WindowState) obj;
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
