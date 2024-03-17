package com.IOStream;

import java.io.File;

public class ListofFile {

	public static void main(String[] args) {
		
		File dir = new File("D:\\SDET_WS\\CoreJawaBasics\\src\\ClassesAndObjects");
		recusive(dir);
		boolean isdir = dir.exists();
	//	File[] arr =dir.listFiles();
		//if(isdir) {
			//for(File fe:arr)
			//System.out.println(fe.getName());
		
	//	}
	//	else {
		//	System.out.println("No Diectory is found");
	//	}
	}
	public static void recusive(File filename) {
		boolean direct = filename.isDirectory();
		
		if(direct) {
			File[] arr =filename.listFiles();
			for( File fe:arr) {
				System.out.println("File  "+fe.getName());
				recusive(fe);
			}
			
			}
		else {
			System.out.println("Not a Directory");
		}
	}

}
