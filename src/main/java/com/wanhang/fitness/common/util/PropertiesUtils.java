package com.wanhang.fitness.common.util;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertiesUtils {

    static final Logger LOG = LoggerFactory.getLogger(PropertiesUtils.class);

    static final String propFile = "com/iydsj/erp/resources/jdbc.properties";

    private static Properties props;

    static {
        props = new Properties();
        try {
            props.load(getResourceAsStream(propFile));
        } catch (FileNotFoundException e) {
            LOG.error(propFile + " not found!", e);
        } catch (IOException e) {
            LOG.error(propFile + " io exception!", e);
        }
    }


    public static String getString(String key) {
        if (props.get(key) != null) {
        	String str = props.get(key).toString();
            return str;
        }
        return "";
    }
    
    /*
     * Try to get a resource from a group of classloaders
     * 
     * @param resource - the resource to get
     * 
     * @param classLoader - the classloaders to examine
     * 
     * @return the resource or null
     */
	public static InputStream getResourceAsStream(String resource) {
		ClassLoader[] classLoader = {
				Thread.currentThread().getContextClassLoader(),
				PropertiesUtils.class.getClassLoader() };
		for (ClassLoader cl : classLoader) {
			if (null != cl) {
				// try to find the resource as passed
				InputStream returnValue = cl.getResourceAsStream(resource);
				// now, some class loaders want this leading "/", so we'll add
				// it and try again if we didn't find the resource
				if (null == returnValue)
					returnValue = cl.getResourceAsStream("/" + resource);
				if (null != returnValue)
					return returnValue;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		String yevalue = getString("yejun");
		String panvalue = getString("panlei");
		System.out.println(yevalue+","+panvalue);
	}
	
}
