package com.example.testexample;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

import org.apache.log4j.Logger;

import com.example.stackexample.StackExample;
import com.example.testInterface.LogestSubString;
import com.example.testInterfaceImpl.LogestSubStringImpl;

class App {
	private static final Logger logger = Logger.getLogger(App.class);

	public static void main(String[] args) {
		
		if (args.length > 0) {
			if (args.length == 1) {
				String one = args[0];
				logger.debug("args.length : " + one);
				if(one.equalsIgnoreCase("Hi")) {
					logger.debug("args.length zero : " + args.length +"-----"+ one);
				}else {
					logger.debug("args.length zero else : " +args.length +"-----"+ one);
				}
			}
			
			if (args.length == 2) {
				String one = args[0];
				String two = args[1];
				logger.debug("args.length one : " + args.length +"-----"+ one);
				logger.debug("args.length two : " + args.length +"-----"+ two);
			}
		}
		/*
		if (args.length > 0) {
			String one = args[0];
			logger.debug("one : " + one);
		}

		if (args.length > 1) {
			String two = args[1];
			logger.debug("two : " + two);
		}
		*/

		String fileName = "application.properties";
		App app = new App();
		try {
			Properties propValues = app.getPropValues(fileName);
			System.out.println("propValues :" + propValues);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String filePath = getFileDirectory(fileName);
		System.out.println("filePath :" + filePath);
		FileReader reader;
		try {
			reader = new FileReader(filePath);
			Properties p = new Properties();
			p.load(reader);
			System.out.println("dir" + p);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		System.out.println("Class path" + System.getProperty("java.class.path"));

		System.out.println("Hello World!");
		System.out.println(getLocalCurrentDate());
		
		
		// calling interface methods
		String str = "abcdabzyxwvu";
		LogestSubString logestSubString = new LogestSubStringImpl();
		String longest = logestSubString.longest(str);
		System.out.println("longest : "+longest);
		
		// calling Class
		
		StackExample stackExample = new StackExample();
		stackExample.push(10);
		stackExample.push(20);
		stackExample.push(30);
		stackExample.push(40);
		stackExample.pop();
		System.out.println("Printing the top most value : "+stackExample.peek());
		
	}

	public static String getFileDirectory(String fileName) {
		String workingDir = System.getProperty("user.dir");
		return workingDir + File.separator + fileName;
	}

	public Properties getPropValues(String fileName) throws IOException {
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

	private static String getLocalCurrentDate() {

		if (logger.isDebugEnabled()) {
			logger.debug("getLocalCurrentDate() is executed!");
		}

		Date date = new Date();
		return date.toString();

	}
}
