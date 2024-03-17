package com.IOStream;

import java.io.File;
import java.io.IOException;

public class FileCreatorSample {

	public static void main(String[] args) throws IOException {
		// create a file object for the current location
		File dir = new File("D:\\New2");
		boolean value = false;
			//trying to create a file based on the object
			boolean isDir = dir.mkdir();
			boolean value1 = false;
			String path =dir.getAbsolutePath();
			dir.exists();
			
			if(isDir) {
				File file = new File("D:\\New2\\Newfile2.txt");
				value1 = file.createNewFile();
			}
			if(value1) {
				System.out.println("the file is Created");
			}
			else {
				System.out.println("the file is not created");
			}
			
		
		
		
		

	}
}
