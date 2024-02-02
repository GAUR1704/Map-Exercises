package com.prowings.PropertiesDemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {
	
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		String filePath = Thread.currentThread().getContextClassLoader().getResource("").getPath()+"properties";
		
		Properties prop = new Properties();
		
		prop.load(new FileInputStream(filePath));
		
		String email = prop.getProperty("email");
		System.out.println(email);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		String Password = prop.getProperty("password");
		System.out.println(Password);
		
		prop.setProperty("email","goluparate17@gmail.com");
		
		System.out.println(prop);
		
		Enumeration<Object> key = prop.keys();
		
		while(key.hasMoreElements()) {
			
			System.out.println(key.nextElement());
		}
		
		
		
	}

}