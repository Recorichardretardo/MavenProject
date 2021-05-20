package com.example.testexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

class App {
	public static void main(String[] args) {
		String fileName = "application.properties";
		App app = new App();
		try {
			Properties propValues = app.getPropValues(fileName);
			System.out.println("propValues :"+propValues);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		String filePath = getFileDirectory(fileName);
		System.out.println("filePath :"+filePath);
		FileReader reader;
		try {
			reader = new FileReader(filePath);
			Properties p=new Properties();
			p.load(reader);
			System.out.println("dir"+p);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		System.out.println("Class path"+System.getProperty("java.class.path"));
		
		System.out.println("Hello World!");
	}

	public static String getFileDirectory(String fileName) {
		String workingDir = System.getProperty("user.dir");
		return workingDir+File.separator+fileName;
	}
	
	public  Properties getPropValues(String fileName) throws IOException {
		InputStream inputStream = null;
		Properties prop = new Properties();
		try {
			
			inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
 
			if (inputStream != null) {
				prop.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + fileName + "' not found in the classpath");
			}			
		} catch (Exception e) {
			System.out.println("Exception: " + e);
		} finally {
			
			if (inputStream != null) {
				inputStream.close();
			}
		}
		return prop;
	}
}
