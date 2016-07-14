package com.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;


public class Configuration {
	
	public String URL;
	public String BROWSER;
	
	public Configuration()
	{
		readProps();
	}
	
	public void readProps()
	{
		Properties p = new Properties();
		try {
			FileReader reader = new FileReader("config.properties");
			p.load(reader);
			
			URL = p.getProperty("url");
			
			BROWSER = p.getProperty("browser");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}	
	


