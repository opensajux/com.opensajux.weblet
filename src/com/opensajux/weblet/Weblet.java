package com.opensajux.weblet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Sheikh Mohammad Sajid
 * 
 */
public interface Weblet {
	void destroy();

	void init(WebletConfig webletConfig);

	void render(HttpServletRequest request, HttpServletResponse response);
}
