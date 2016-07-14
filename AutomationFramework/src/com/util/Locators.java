package com.util;

import java.io.FileReader;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Properties;

public class Locators {
	
	public static HashMap<String,String> loc = new HashMap<>();
	
	
	public static void getElements()
	{
		Properties p = new Properties();
		try {
			FileReader reader = new FileReader("locators.properties");
			p.load(reader);
			
			Enumeration e = p.propertyNames();
			
			while (e.hasMoreElements()){
				String Key = (String) e.nextElement();
				loc.put(Key,p.getProperty(Key));
				System.out.println(Key + "--" + p.getProperty(Key));
			}
			
		
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
