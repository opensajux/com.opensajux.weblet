/**
 * 
 */
package com.opensajux.weblet;

import java.util.Enumeration;
import java.util.Map;

/**
 * @author Sheikh Mohammad Sajid
 * 
 */
public interface WebletPreferences {
	Map<String, String[]> getMap();

	Enumeration<String> getNames();

	String getValue(String key, String def);

	String[] getValues(String key, String[] def);

	void reset(String key);

	void setValue(String key, String value);

	void setValues(String key, String[] values);

	void save();
}
