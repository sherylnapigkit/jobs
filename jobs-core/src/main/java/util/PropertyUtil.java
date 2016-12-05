package util;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;

public class PropertyUtil {

	private static PropertiesConfiguration props;
	
	public static String getProperty(String key) {
		if (props == null) {
			try {
				props = new PropertiesConfiguration("endpoints.props");
			} catch (ConfigurationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (props != null) {
			return props.getString(key);
		}
		return null;
	}	
}
