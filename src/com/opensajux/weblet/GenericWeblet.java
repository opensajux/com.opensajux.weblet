/**
 * 
 */
package com.opensajux.weblet;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Sheikh Mohammad Sajid
 * 
 */
public abstract class GenericWeblet implements Weblet {
	private WebletConfig webletConfig;

	public void destroy() {

	}

	public void init(WebletConfig webletConfig) {
		this.webletConfig = webletConfig;
		init();
	}

	public void init() {

	}

	public void render(HttpServletRequest request, HttpServletResponse response) {

	}

	/**
	 * @return the webletConfig
	 */
	public WebletConfig getWebletConfig() {
		return webletConfig;
	}

	public String getInitParameter(String name) {
		return null;
	}

	public String getWebletName() {
		return null;
	}

	public Enumeration<String> getInitParameterNames() {
		return null;
	}

	protected String getTitle(HttpServletRequest request) {
		return null;
	}

	protected void doView(HttpServletRequest request, HttpServletResponse response) {

	}

	protected void doEdit(HttpServletRequest request, HttpServletResponse response) {

	}

	protected void doHelp(HttpServletRequest request, HttpServletResponse response) {

	}

}
