package com.IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertySample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties connProp = new Properties();
		connProp.setProperty("Username","trg08");
		connProp.setProperty("Password","trg08");
		FileOutputStream propsFile = new FileOutputStream("Information.properties");
		connProp.store(propsFile, "Properties File");
		propsFile.close();
		
		String uname=null;
		String password=null;
		Properties tempProp = new Properties();
		FileInputStream obtained = new FileInputStream("Information.properties");
		tempProp.load(obtained);
		propsFile.close();
		uname=tempProp.getProperty("Username");
		password=tempProp.getProperty("Password");
		System.out.println(uname+password);
		

	}

}
